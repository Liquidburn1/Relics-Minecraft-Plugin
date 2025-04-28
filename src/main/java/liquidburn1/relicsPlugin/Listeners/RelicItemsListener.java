package liquidburn1.relicsPlugin.Listeners;

import liquidburn1.relicsPlugin.Utils.CreateRelic;
import liquidburn1.relicsPlugin.Items.RelicItems;
import liquidburn1.relicsPlugin.Listeners.RelicLootRegistry.RelicLootRegistry;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.Particle;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;
import java.util.UUID;

public class RelicItemsListener implements Listener {











    //Testing purposes To Tell everyone in Server that Opened a Relic
    @EventHandler
    public void OnPlayerInteract(PlayerInteractEvent event)
    {
        Player player=event.getPlayer();
        Server server = player.getServer();
        ItemStack item=player.getInventory().getItemInMainHand();

        if (item.getType().isAir() || !item.hasItemMeta()) {
            return; // Do nothing if no item
        }

        //Relic
        if(player.getInventory().getItemInMainHand().getItemMeta().equals(RelicItems.Relic().getItemMeta())) {

            player.getInventory().removeItem(RelicItems.Relic());


            int size = RelicLootRegistry.RELIC_LOOT.size();
            int randomIndex = new Random().nextInt(size);

           RelicBlueprint b = RelicLootRegistry.RELIC_LOOT.get(randomIndex);

           CreateRelic x = new CreateRelic();

           player.getInventory().addItem(x.Create_Relic(UUID.randomUUID(),b.material,b.displayName,b.lore,b.healthBoost.getRandomInt(),b.armorToughness.getRandomInt(),b.armor.getRandomInt(),b.attackDamage.getRandomInt(),b.attackSpeed.getRandom(),b.movementSpeed.getRandom(),b.knockbackResistance.getRandomInt(),b.equipmentSlot,b.enchants,b.hideEnchants));


            server.broadcastMessage(player.getName() + " opened a " + "§x§F§D§4§9§4§4§l§oR§x§F§6§5§B§4§8§l§oE§x§F§0§6§C§4§C§l§oL§x§E§9§7§E§4§F§l§oI§x§E§2§8§F§5§3§l§oC");
        }

        //If Archaic Relic
        else if(player.getInventory().getItemInMainHand().getItemMeta().equals(RelicItems.ArchaicRelic().getItemMeta()) && event.getAction().isRightClick()) {
            player.getInventory().removeItem(RelicItems.ArchaicRelic());
            player.spawnParticle(Particle.NAUTILUS, player.getLocation().add(0, 1, 0), 30, 0.5, 0.5, 0.5, 0.01);

            server.broadcastMessage(player.getName() + " opened a " + RelicItems.ArchaicRelic().getItemMeta().getDisplayName());







        }

    }

}
