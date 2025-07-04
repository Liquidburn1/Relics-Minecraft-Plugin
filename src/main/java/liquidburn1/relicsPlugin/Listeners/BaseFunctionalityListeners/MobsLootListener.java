package liquidburn1.relicsPlugin.Listeners.BaseFunctionalityListeners;

import liquidburn1.relicsPlugin.Items.RelicItems.RelicItems;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

import java.util.Objects;
import java.util.Random;
import java.util.Set;

//TODO FIX THE PERCENTAGES cuz the fragments ain't rare >_>

public class MobsLootListener implements Listener {

    // Easy Mobs (20% Essence)
    private static final Set<EntityType> easyMobs = Set.of(
            EntityType.ZOMBIE,         // 20 HP (10 hearts)
            EntityType.SKELETON,       // 20 HP (10 hearts)
            EntityType.HUSK,           // 20 HP (10 hearts)
            EntityType.DROWNED,        // 20 HP (10 hearts)
            EntityType.ZOMBIE_VILLAGER,// 20 HP (10 hearts)
            EntityType.PILLAGER,       // 24 HP (12 hearts)
            EntityType.STRAY,          // 20 HP (10 hearts)
            EntityType.SPIDER,         // 16 HP (8 hearts)
            EntityType.CAVE_SPIDER,     // 12 HP (6 hearts)
            EntityType.ZOMBIFIED_PIGLIN
    );

    // Medium mobs (40% Essence, 8% Relic)
    private static final Set<EntityType> mediumMobs = Set.of(
            EntityType.PIGLIN,         // 16 HP (8 hearts)
            EntityType.HOGLIN,         // 40 HP (20 hearts)
            EntityType.BLAZE,          // 20 HP (10 hearts)
            EntityType.WITHER_SKELETON,// 20 HP (10 hearts)
            EntityType.GHAST,          // 10 HP (5 hearts)
            EntityType.ENDERMAN,       // 40 HP (20 hearts)
            EntityType.EVOKER,         // 24 HP (12 hearts)
            EntityType.BREEZE,        // 30 HP (15 hearts)
            EntityType.GUARDIAN
    );

    // Tough mobs (70% Essence, 20% Shard, 40% Relic)
    private static final Set<EntityType> toughMobs = Set.of(
            EntityType.PIGLIN_BRUTE,   // 50 HP (25 hearts)
            EntityType.RAVAGER,        // 100 HP (50 hearts)
            EntityType.ELDER_GUARDIAN  // 80 HP (40 hearts)
    );

    // Boss mobs (100% Essence, 100% Relic, 50% Shard, 20% Archaic Relic)
    private static final Set<EntityType> bossMobs = Set.of(
            EntityType.ENDER_DRAGON,   // 200 HP (100 hearts)
            EntityType.WITHER,         // 300 HP (150 hearts)
            EntityType.WARDEN          // 500 HP (250 hearts)
    );






    private final Random random = new Random();


    private int getMobLevel(LivingEntity livingEntity){
        Plugin levelledMobsPlugin = Bukkit.getPluginManager().getPlugin("LevelledMobs");
        if (levelledMobsPlugin == null) return 0;
        NamespacedKey levelKey = new NamespacedKey(levelledMobsPlugin, "level");
        return Objects.requireNonNullElse(
                livingEntity.getPersistentDataContainer().get(levelKey, PersistentDataType.INTEGER),
                0
        );
    }


 @EventHandler
    public void onMobDeath(EntityDeathEvent event) {
        LivingEntity entity = event.getEntity();

        EntityType type = entity.getType();


        Plugin levelledMobsPlugin = Bukkit.getPluginManager().getPlugin("LevelledMobs");
        if (levelledMobsPlugin == null) {


        // Easy Mobs
        if (easyMobs.contains(type) ) {

            // Drop chance (example: 0.10 =10% chance and 1 = 100%)
            if (random.nextDouble() <= 0.1) {
                ItemStack fragment = RelicItems.RelicFragment();
                fragment.setAmount(1 + random.nextInt(2));
                event.getDrops().add(fragment);
            }}

        //Medium Mobs
        else if (mediumMobs.contains(type))
        {
            // Drop chance for relic fragment
            if (random.nextDouble() <= 0.35)
            {
                ItemStack fragment = RelicItems.RelicFragment();
                fragment.setAmount(1 + random.nextInt(3));
                event.getDrops().add(fragment);
            }
            // Drop chance for relics
            if (random.nextDouble() <= 0.05)
            {
                ItemStack relic = RelicItems.Relic();
                relic.setAmount(1);
                event.getDrops().add(relic);
            }

        }

        //Harder Mobs (70% Essence, 20% Shard, 40% Relic)
        else if (toughMobs.contains(type)) {

            // Drop chance for relic fragment
            if (random.nextDouble() <= 0.8)
            {
                ItemStack fragment = RelicItems.RelicFragment();
                fragment.setAmount(1 + random.nextInt(4));
                event.getDrops().add(fragment);
            }
            // Drop chance for relics
            if (random.nextDouble() <= 0.45)
            {
                ItemStack relic = RelicItems.Relic();
                relic.setAmount(1 + random.nextInt(2));
                event.getDrops().add(relic);
            }
            // Drop chance for Archaic Shards
            if (random.nextDouble() <= 0.2)
            {
                ItemStack shard = RelicItems.ArchaicShard();
                shard.setAmount(1 + random.nextInt(2));
                event.getDrops().add(shard);
            }


        }
        //Hardest Mobs (100% fragment,100% relics)
        else if (bossMobs.contains(type)) {

            // Drop chance for relic fragment
            if (random.nextDouble() <= 1)
            {
                ItemStack fragment = RelicItems.RelicFragment();
                fragment.setAmount(2 + random.nextInt(7));
                event.getDrops().add(fragment);
            }
            // Drop chance for relics
            if (random.nextDouble() <= 1)
            {
                ItemStack relic = RelicItems.Relic();
                relic.setAmount(1 + random.nextInt(3));
                event.getDrops().add(relic);
            }
            // Drop chance for Archaic Shards
            if (random.nextDouble() <= 0.5)
            {
                ItemStack shard = RelicItems.ArchaicShard();
                shard.setAmount(1 + random.nextInt(4));
                event.getDrops().add(shard);
            }
            // Drop chance for Archaic Relic
            if (random.nextDouble() <= 0.4)
            {
                ItemStack Archaic = RelicItems.ArchaicRelic();
                Archaic.setAmount(1 + random.nextInt(3));
                event.getDrops().add(Archaic);
            }


        }
        }

        //NOT REALLY NEEDED IF DONT HAVE LEVELED MOBS PLUGIN
        //If Leveled Mobs is installed as a plugin then I use the leveling system
        else
        {
            int level= getMobLevel(entity);

            ifleveledmobs(event,level,type);
        }

    }



    private void ifleveledmobs(EntityDeathEvent event,int level,EntityType type)
    {
        if (toughMobs.contains(type)) {

            // Drop chance for relic fragment
            if (random.nextDouble() <= 0.8)
            {
                ItemStack fragment = RelicItems.RelicFragment();
                fragment.setAmount(1 + random.nextInt(4));
                event.getDrops().add(fragment);
            }
            // Drop chance for relics
            if (random.nextDouble() <= 0.45)
            {
                ItemStack relic = RelicItems.Relic();
                relic.setAmount(1 + random.nextInt(2));
                event.getDrops().add(relic);
            }
            // Drop chance for Archaic Shards
            if (random.nextDouble() <= 0.2)
            {
                ItemStack shard = RelicItems.ArchaicShard();
                shard.setAmount(1 + random.nextInt(2));
                event.getDrops().add(shard);
            }


        }

        //In case Hard mobs spawn as low level
        else if (bossMobs.contains(type)) {

            // Drop chance for relic fragment
            if (random.nextDouble() <= 1)
            {
                ItemStack fragment = RelicItems.RelicFragment();
                fragment.setAmount(2 + random.nextInt(7));
                event.getDrops().add(fragment);
            }
            // Drop chance for relics
            if (random.nextDouble() <= 1)
            {
                ItemStack relic = RelicItems.Relic();
                relic.setAmount(1 + random.nextInt(3));
                event.getDrops().add(relic);
            }
            // Drop chance for Archaic Shards
            if (random.nextDouble() <= 0.5)
            {
                ItemStack shard = RelicItems.ArchaicShard();
                shard.setAmount(1 + random.nextInt(4));
                event.getDrops().add(shard);
            }
            // Drop chance for Archaic Relic
            if (random.nextDouble() <= 0.4)
            {
                ItemStack Archaic = RelicItems.ArchaicRelic();
                Archaic.setAmount(1 + random.nextInt(3));
                event.getDrops().add(Archaic);
            }


        }

        else
        {
            //Weak Mobs
            if(level<=10)
            {
                if (random.nextDouble() <= 0.05) {
                    ItemStack fragment = RelicItems.RelicFragment();
                    fragment.setAmount(1 + random.nextInt(2));
                    event.getDrops().add(fragment);
                }

            }
            else if(level<=20)
            {
                if (random.nextDouble() <= 0.15) {
                    ItemStack fragment = RelicItems.RelicFragment();
                    fragment.setAmount(1 + random.nextInt(2));
                    event.getDrops().add(fragment);
                }

            }

            else if(level<=30)
            {
                if (random.nextDouble() <= 0.30)
                {
                    ItemStack fragment = RelicItems.RelicFragment();
                    fragment.setAmount(1 + random.nextInt(3));
                    event.getDrops().add(fragment);
                }
                // Drop chance for relics
                if (random.nextDouble() <= 0.1)
                {
                    ItemStack relic = RelicItems.Relic();
                    relic.setAmount(1);
                    event.getDrops().add(relic);
                }

            }

            else if(level<=40)
            {
                if (random.nextDouble() <= 0.4)
                {
                    ItemStack fragment = RelicItems.RelicFragment();
                    fragment.setAmount(1 + random.nextInt(3));
                    event.getDrops().add(fragment);
                }
                // Drop chance for relics
                if (random.nextDouble() <= 0.3)
                {
                    ItemStack relic = RelicItems.Relic();
                    relic.setAmount(1 + random.nextInt(2));
                    event.getDrops().add(relic);
                }

                if (random.nextDouble() <= 0.1)
                {
                    ItemStack shard = RelicItems.ArchaicShard();
                    shard.setAmount(1 + random.nextInt(2));
                    event.getDrops().add(shard);
                }

            }


            else if(level<=60)
            {
                // Drop chance for relic fragment
                if (random.nextDouble() <= 0.8) {
                    ItemStack fragment = RelicItems.RelicFragment();
                    fragment.setAmount(1 + random.nextInt(4));
                    event.getDrops().add(fragment);
                }
                // Drop chance for relics
                if (random.nextDouble() <= 0.45) {
                    ItemStack relic = RelicItems.Relic();
                    relic.setAmount(1 + random.nextInt(2));
                    event.getDrops().add(relic);
                }
                // Drop chance for Archaic Shards
                if (random.nextDouble() <= 0.2) {
                    ItemStack shard = RelicItems.ArchaicShard();
                    shard.setAmount(1 + random.nextInt(2));
                    event.getDrops().add(shard);
                }

            }






        }
    }


    }


