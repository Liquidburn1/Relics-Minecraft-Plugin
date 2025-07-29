package liquidburn1.relicsPlugin.Listeners.RelicItemAbilities;

import com.destroystokyo.paper.event.player.PlayerArmorChangeEvent;
import liquidburn1.relicsPlugin.RelicsPlugin;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;

/**This file contains the custom enchants so relics can have different abilities */
public class CustomEnchantsListener implements Listener {

//TODO FIX THE ENCAHNT FOR FLIGHT


//>: FLIGHT ENCHANT
    //Allows users to fly whoever has diamond boots
    @EventHandler
    public void flightenchant(PlayerArmorChangeEvent event) {
        if(!event.getSlot().equals(EquipmentSlot.FEET)) {return;}
        ItemStack item =event.getNewItem();
        if(!item.hasItemMeta()){
            event.getPlayer().setAllowFlight(false);
            event.getPlayer().setFlying(false);
            return;
        }


        Player player = event.getPlayer();
        NamespacedKey relicKey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "flight");
        if (item.getItemMeta().getPersistentDataContainer().has(relicKey, PersistentDataType.STRING)) {
            player.setAllowFlight(true);

        }

        else
        {

            player.setAllowFlight(false);
            player.setFlying(false);
        }


    }




    //>: When hitting someone

    //Create this for Thor's Hammer
    @EventHandler
    public void onMobHit(EntityDamageByEntityEvent event) {
            // Only trigger if a player is hitting a living entity (like a mob)
            Random random = new Random();
            if (!(event.getDamager() instanceof Player player)) return;
            Entity target= event.getEntity();

            ItemStack item = player.getInventory().getItemInMainHand();

            if (item.getType().isAir() || !item.hasItemMeta()) return;


            ItemMeta meta = item.getItemMeta();


            //Lightening 30% chance of it working
            if(random.nextDouble() <= 0.3) {
             NamespacedKey relicKey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "Lightening");
            if (meta.getPersistentDataContainer().has(relicKey, PersistentDataType.STRING)) {
                target.getWorld().strikeLightning(target.getLocation());

            }
            }


    }








//Exploding arrows
    @EventHandler
    public void onArrowHit(ProjectileHitEvent event) {
        // Only respond to arrows
        if (!(event.getEntity() instanceof SpectralArrow arrow)) return;

        // Only if the shooter was a player
        if (!(arrow.getShooter() instanceof Player player)) return;

        ItemStack bow = player.getInventory().getItemInMainHand();

        NamespacedKey explode = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class),"explode");
        if(bow.getItemMeta().getPersistentDataContainer().has(explode,PersistentDataType.STRING))
        {
            player.getWorld().spawnParticle(Particle.DRAGON_BREATH,arrow.getLocation(),100);
            player.getWorld().createExplosion(arrow.getLocation(),2F);
        }


    }



//    //Can do crazy stuff with this
//    //Add Particles behind Arrows
    @EventHandler
    public void onArrowShoot(EntityShootBowEvent event) {
        if (!(event.getEntity() instanceof Player player)) return;
        if (!(event.getProjectile() instanceof SpectralArrow arrow)) return;

        ItemStack bow = player.getInventory().getItemInMainHand();
        NamespacedKey explode = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class),"explode");

        if (!bow.getItemMeta().getPersistentDataContainer().has(explode,PersistentDataType.STRING)) return;
        arrow.setInvulnerable(true); // optional, prevents explosion damage
        arrow.setFireTicks(0); // in case particles set fire
        // Correct way to use BukkitRunnable with runTaskTimer
        new BukkitRunnable() {
            @Override
            public void run() {
                if (arrow.isDead() || arrow.isInBlock() || arrow.isOnGround()) {
                    this.cancel();
                    return;
                }


                arrow.getWorld().spawnParticle(Particle.SONIC_BOOM, arrow.getLocation(), 2, 0, 0, 0, 0);


            }
        }.runTaskTimer(RelicsPlugin.getPlugin(RelicsPlugin.class), 0L, 1L);
    }













}
