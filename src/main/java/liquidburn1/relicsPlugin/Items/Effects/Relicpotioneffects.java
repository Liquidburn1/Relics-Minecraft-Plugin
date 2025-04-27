package liquidburn1.relicsPlugin.Items.Effects;

import liquidburn1.relicsPlugin.RelicsPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class Relicpotioneffects {
    public static void startRelicEffectChecker() {

        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    ItemStack mainHand = player.getInventory().getItemInMainHand();
                    ItemStack offhand = player.getInventory().getItemInOffHand();
                    ItemStack Head = player.getInventory().getItem(EquipmentSlot.HEAD);
                    ItemStack Chest = player.getInventory().getItem(EquipmentSlot.CHEST);
                    ItemStack Legs = player.getInventory().getItem(EquipmentSlot.LEGS);
                    ItemStack Boots = player.getInventory().getItem(EquipmentSlot.CHEST);

                    // mainhand: Any Item in the MainHand
                    if (mainHand.hasItemMeta()) {
                        ItemMeta meta = mainHand.getItemMeta();

                        if (meta.hasDisplayName()) {
                            String displayName = meta.getDisplayName();

                            if (RelicEffectRegistry.MainHandEffects.containsKey(displayName)) {
                                List<PotionEffect> effects = RelicEffectRegistry.MainHandEffects.get(displayName);

                                for (PotionEffect effect : effects) {
                                    player.addPotionEffect(effect);
                                }
                            }
                        }
                    }




                    //Offhand: Any Item in the Offhand
                    if (offhand.hasItemMeta()) {
                        ItemMeta meta = offhand.getItemMeta();

                        if (meta.hasDisplayName()) {
                            String displayName = meta.getDisplayName();

                            if (RelicEffectRegistry.OffHandEffects.containsKey(displayName)) {
                                List<PotionEffect> effects = RelicEffectRegistry.OffHandEffects.get(displayName);

                                for (PotionEffect effect : effects) {
                                    player.addPotionEffect(effect);
                                }
                            }
                        }
                    }



                }
            }
        }.runTaskTimer(RelicsPlugin.getPlugin(RelicsPlugin.class), 0L, 110L); // Runs every 2 seconds (40 ticks)
    }

}
