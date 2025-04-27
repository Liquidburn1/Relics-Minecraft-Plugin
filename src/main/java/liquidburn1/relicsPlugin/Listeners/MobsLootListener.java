package liquidburn1.relicsPlugin.Listeners;

import liquidburn1.relicsPlugin.Items.RelicItems;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;
import java.util.Set;

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
            EntityType.CAVE_SPIDER     // 12 HP (6 hearts)
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





    //Makes sure anything with unPlaceablerelic doesnt get placed Any Relic essentially
//    @EventHandler
//    public void onPlace(PlayerInteractEvent event) {
//        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
//
//            ItemStack item = event.getPlayer().getInventory().getItemInMainHand();
//            if (item == null || item.getType() == Material.AIR || !item.hasItemMeta()) return;
//               ItemMeta meta = item.getItemMeta();
//
//            NamespacedKey key = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "unplaceable_relic");
//            if (meta.getPersistentDataContainer().has(key, PersistentDataType.BYTE)) {
//                event.setCancelled(true);
//                event.getPlayer().getServer().sendPlainMessage("");
//
//            }
//        }
//    }




//    //Testing purposes To Tell everyone in Server that Opened a Relic
//    @EventHandler
//    public void OnPlayerInteract(PlayerInteractEvent event)
//    {
//        Player player=event.getPlayer();
//        Server server = player.getServer();
//        ItemStack item=player.getInventory().getItemInMainHand();
//
//        if (item == null || item.getType().isAir() || !item.hasItemMeta()) {
//            return; // Do nothing if no item
//        }
//
//        //Relic
//        if(player.getInventory().getItemInMainHand().getItemMeta().equals(RelicItems.Relic().getItemMeta())) {
//
//            player.getInventory().removeItem(RelicItems.Relic());
//
//
//            server.broadcastMessage(player.getName() + " opened a " + "§x§F§D§4§9§4§4§l§oR§x§F§6§5§B§4§8§l§oE§x§F§0§6§C§4§C§l§oL§x§E§9§7§E§4§F§l§oI§x§E§2§8§F§5§3§l§oC");
//        }
//
//        //If Archaic Relic
//        else if(player.getInventory().getItemInMainHand().getItemMeta().equals(RelicItems.ArchaicRelic().getItemMeta()) && event.getAction().isRightClick()) {
//            player.getInventory().removeItem(RelicItems.ArchaicRelic());
//            player.spawnParticle(Particle.NAUTILUS, player.getLocation().add(0, 1, 0), 30, 0.5, 0.5, 0.5, 0.01);
//
//            server.broadcastMessage(player.getName() + " opened a " + RelicItems.ArchaicRelic().getItemMeta().getDisplayName());
//
//
//
//
//
//
//
//        }
//
//    }




    @EventHandler
    public void onMobDeath(EntityDeathEvent event) {
        LivingEntity entity = event.getEntity();

        // Check if the killer is a player (optional — if you only want players to cause drops)
        if (!(entity.getKiller() instanceof Player)) {
            return;
        }

        EntityType type = entity.getType();

        // Easy Mobs
        if (easyMobs.contains(type) ) {

            // Drop chance (example: 0.10 =10% chance and 1 = 100%)
            if (random.nextDouble() <= 0.2) {
                ItemStack fragment = RelicItems.RelicFragment();
                fragment.setAmount(1 + random.nextInt(2));
                event.getDrops().add(fragment);
            }}

        //Medium Mobs
        else if (mediumMobs.contains(type))
        {
            // Drop chance for relic fragment
            if (random.nextDouble() <= 0.4)
            {
                ItemStack fragment = RelicItems.RelicFragment();
                fragment.setAmount(1 + random.nextInt(2));
                event.getDrops().add(fragment);
            }
            // Drop chance for relics
            if (random.nextDouble() <= 0.2)
            {
                ItemStack relic = RelicItems.Relic();
                relic.setAmount(1);
                event.getDrops().add(relic);
            }

        }

        //Harder Mobs (70% Essence, 20% Shard, 40% Relic)
        else if (toughMobs.contains(type)) {

            // Drop chance for relic fragment
            if (random.nextDouble() <= 0.7)
            {
                ItemStack fragment = RelicItems.RelicFragment();
                fragment.setAmount(1 + random.nextInt(4));
                event.getDrops().add(fragment);
            }
            // Drop chance for relics
            if (random.nextDouble() <= 0.4)
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


    }
}