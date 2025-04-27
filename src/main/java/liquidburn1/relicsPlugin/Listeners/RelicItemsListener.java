package liquidburn1.relicsPlugin.Listeners;

import liquidburn1.relicsPlugin.Items.RelicItems;
import org.bukkit.Particle;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class RelicItemsListener implements Listener {
    //Testing purposes To Tell everyone in Server that Opened a Relic
    @EventHandler
    public void OnPlayerInteract(PlayerInteractEvent event)
    {
        Player player=event.getPlayer();
        Server server = player.getServer();
        ItemStack item=player.getInventory().getItemInMainHand();

        if (item == null || item.getType().isAir() || !item.hasItemMeta()) {
            return; // Do nothing if no item
        }

        //Relic
        if(player.getInventory().getItemInMainHand().getItemMeta().equals(RelicItems.Relic().getItemMeta())) {

            player.getInventory().removeItem(RelicItems.Relic());


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
