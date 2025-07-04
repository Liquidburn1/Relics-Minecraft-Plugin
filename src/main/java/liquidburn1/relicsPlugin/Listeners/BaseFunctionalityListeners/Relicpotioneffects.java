package liquidburn1.relicsPlugin.Listeners.BaseFunctionalityListeners;

import liquidburn1.relicsPlugin.RelicsPlugin;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class Relicpotioneffects {


    private static void add_potion_to_player(Player player,ItemMeta meta)
    {
        PersistentDataContainer data = meta.getPersistentDataContainer();
        NamespacedKey potionEffectKey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "potioneffect_tag");
        if (data.has(potionEffectKey, PersistentDataType.STRING)) {
            String storedEffects = data.get(potionEffectKey, PersistentDataType.STRING);

            List<String> tagvalues = List.of(storedEffects.split(","));

            tagvalues.forEach((effect) -> {
                List<String> name = List.of(effect.split("/"));
                PotionEffectType Potion=PotionEffectType.getByName(name.getFirst().trim());
                int amplifier= Integer.parseInt(name.get(1))-1;
                if(Potion !=null && amplifier>=0) {

                    //Adding the potion effect
                    player.addPotionEffect(new PotionEffect(Potion, 150, amplifier));
                }


            });

        }

    }

    public static void startRelicEffectChecker() {

        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    //getting all slots
                    ItemStack mainHand = player.getInventory().getItemInMainHand();
                    ItemStack offhand = player.getInventory().getItemInOffHand();
                    ItemStack Head = player.getInventory().getItem(EquipmentSlot.HEAD);
                    ItemStack Chest = player.getInventory().getItem(EquipmentSlot.CHEST);
                    ItemStack Legs = player.getInventory().getItem(EquipmentSlot.LEGS);
                    ItemStack Boots = player.getInventory().getItem(EquipmentSlot.FEET);

                    //Mainhand checks
                    if (mainHand.hasItemMeta()) {
                        ItemMeta meta = mainHand.getItemMeta();
                        add_potion_to_player(player,meta);

                    }
                    //offhand check
                    if (offhand.hasItemMeta()) {
                        ItemMeta meta = offhand.getItemMeta();
                        add_potion_to_player(player,meta);

                    }

                    //Armor Head
                    if (Head.hasItemMeta()) {
                        ItemMeta meta = Head.getItemMeta();
                        add_potion_to_player(player,meta);

                    }

                    //Armor Chest
                    if (Chest.hasItemMeta()) {
                        ItemMeta meta = Chest.getItemMeta();
                        add_potion_to_player(player,meta);

                    }
                    //Armor Legs
                    if (Legs.hasItemMeta()) {
                        ItemMeta meta = Legs.getItemMeta();
                        add_potion_to_player(player,meta);

                    }



                    //Armor Boots
                    if (Boots.hasItemMeta()) {
                        ItemMeta meta = Boots.getItemMeta();
                        add_potion_to_player(player,meta);

                    }







                }
            }
        }.runTaskTimer(RelicsPlugin.getPlugin(RelicsPlugin.class), 0L, 110L); // Runs every 7 seconds (110 ticks)

    }

}
