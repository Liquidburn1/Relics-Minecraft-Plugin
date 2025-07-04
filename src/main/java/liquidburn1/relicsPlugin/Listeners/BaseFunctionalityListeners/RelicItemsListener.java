package liquidburn1.relicsPlugin.Listeners.BaseFunctionalityListeners;

import liquidburn1.relicsPlugin.RelicsPlugin;
import liquidburn1.relicsPlugin.Utils.CreateRelic;
import liquidburn1.relicsPlugin.Items.RelicItems.RelicItems;
import liquidburn1.relicsPlugin.Items.RelicLootRegistry;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.NamespacedKey;
import org.bukkit.Particle;
import org.bukkit.Server;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;


//TODO
// MAYBE:Add Percentages for Chisel to break or be successful or not do anything
// Also make it so old potion effects from relics are still there



public class RelicItemsListener implements Listener {

    //Opens Relics
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


            //getting a random relic from the registry list then creating it into a relic and giving it to the player
            int size = RelicLootRegistry.RELIC_LOOT.size();
            int randomIndex = new Random().nextInt(size);

           RelicBlueprint b = RelicLootRegistry.RELIC_LOOT.get(randomIndex);

           CreateRelic x = new CreateRelic(); //Creating the Object CreateRelic then passing the data to it so it returns an ItemStack

           player.getInventory().addItem(x.Create_Relic(UUID.randomUUID(),b.material,b.displayName,b.lore,b.healthBoost.getRandomInt(),b.armorToughness.getRandomInt(),b.armor.getRandomInt(),b.attackDamage.getRandomInt(),b.attackSpeed.getRandom(),b.movementSpeed.getRandom(),b.equipmentSlot,b.enchants,b.potioneffects,b.hideEnchants,b.ischarm,b.charmable,b.extratag));

            player.sendMessage( " You received a " + b.displayName);
        }

        //If Archaic Relic
        else if(player.getInventory().getItemInMainHand().getItemMeta().equals(RelicItems.ArchaicRelic().getItemMeta())) {

            player.getInventory().removeItem(RelicItems.ArchaicRelic());

            player.spawnParticle(Particle.NAUTILUS, player.getLocation().add(0, 1, 0), 30, 0.5, 0.5, 0.5, 0.01);
            int size = RelicLootRegistry.ARCHAIC_LOOT.size();
            int randomIndex = new Random().nextInt(size);
            RelicBlueprint b = RelicLootRegistry.ARCHAIC_LOOT.get(randomIndex);

            CreateRelic x = new CreateRelic(); //Creating the Object CreateRelic then passing the data to it so it returns an ItemStack

            player.getInventory().addItem(x.Create_Relic(UUID.randomUUID(),b.material,b.displayName,b.lore,b.healthBoost.getRandomInt(),b.armorToughness.getRandomInt(),b.armor.getRandomInt(),b.attackDamage.getRandomInt(),b.attackSpeed.getRandom(),b.movementSpeed.getRandom(),b.equipmentSlot,b.enchants,b.potioneffects,b.hideEnchants,b.ischarm,b.charmable,b.extratag));

            server.broadcastMessage(player.getName() + " got a " +b.displayName);

        }

    }







    //Checks if something can be applied a charm Chisel
    private boolean isRelic_item(ItemStack item)
    {
        if(!item.hasItemMeta()){return false;}
        PersistentDataContainer data = item.getItemMeta().getPersistentDataContainer();


        //check if charm was already used on the item
         NamespacedKey charm_used = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "charmer_used");
        if( data.has(charm_used, PersistentDataType.STRING)){return false;}


        //check if it is a relic_item and not a charm or anything

        NamespacedKey relic_item = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "relicitem_tag");
        return data.has(relic_item, PersistentDataType.STRING);

    }

// MAYBE:Add Percentages for Chisel to break or be successful or not do anything
    @EventHandler
    public void onInventoryCharmer(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player player)) return;

        ItemStack cursor = event.getCursor(); // item on cursor (being held)
        ItemStack target = event.getCurrentItem(); // item being clicked on
        if(target==null || cursor==null){return;}



        if(!cursor.hasItemMeta() || !target.hasItemMeta()){return;}
        // Check if the item on cursor is the Charming Rod
        if (!RelicItems.CharmSocketRod().getItemMeta().equals(cursor.getItemMeta())){return;}
        // Check if the item being clicked on is a Relic_item and a charmer can be used
        if (!isRelic_item(target)) return;

        // Add charm lore to the relic
        ItemMeta meta = target.getItemMeta();

        //Adding the Socket to Item
        List<String> lore = meta.getLore();
        List<String> newlore = new ArrayList<>();
        newlore.addAll(lore);
        newlore.add("");
        newlore.add("§7(§4Charm Socket§7)");
        meta.setLore(newlore);
        NamespacedKey charmtag = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "charmer_used");
        meta.getPersistentDataContainer().set(charmtag, PersistentDataType.STRING, "empty");
        meta.addEnchant(Enchantment.VANISHING_CURSE,1,true);
        target.setItemMeta(meta);

        event.setCursor(null);

        event.setCancelled(true);
        player.sendMessage("§aSuccessfully applied charm to your relic!");
    }




    //To check if something is a Charm
    private boolean isCharm(ItemStack item)
    {
        PersistentDataContainer data = item.getItemMeta().getPersistentDataContainer();
        //check if it is a relic_item and not a charm or anything

        NamespacedKey relic_item = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "charm_tag");
        return data.has(relic_item, PersistentDataType.STRING);

    }

    //Checks if something is Charmable
    private boolean isCharmable(ItemStack item)
    {

        PersistentDataContainer data = item.getItemMeta().getPersistentDataContainer();
        //check if it is a relic_item and not a charm or anything

        NamespacedKey charmer_used = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "charmer_used");

        if(data.has(charmer_used, PersistentDataType.STRING)) {
            String charm = data.get(charmer_used, PersistentDataType.STRING);
            return charm == "empty";

        }

        return false;

    }




//Charming the Charm onto the relic
    @EventHandler
    public void onInventoryCharming(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player player)) return;

        ItemStack cursor = event.getCursor(); // item on cursor (being held)
        ItemStack target = event.getCurrentItem(); // item being clicked on


        if(target==null || cursor==null){return;}




        if(!cursor.hasItemMeta() || !target.hasItemMeta()){return;}
        // Check if the item on cursor is the Charming Rod
        if (!isCharm(cursor)) return;
        // Check if the item being clicked on is a Relic_item and a charmer can be used
        if (!isCharmable(target)) return;

        // Add charm lore to the relic
        ItemMeta cursosrmeta= cursor.getItemMeta();
        ItemMeta relicmeta = target.getItemMeta();


        //Adding the Socket to Item
        List<String> lore = relicmeta.getLore();
        List<String> newlore = new ArrayList<>();
        newlore.addAll(lore);
        if (newlore.remove("§7(§4Charm Socket§7)")) {
            newlore.add("§7("+cursosrmeta.getDisplayName()+"§7)");
        }
        relicmeta.setLore(newlore);

        //setting that this item is charmed
        NamespacedKey charmed = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "charmer_used");
        relicmeta.getPersistentDataContainer().set(charmed, PersistentDataType.STRING, "Charmed");

        //Setting Potion Effects on relic if charm doesnt have potion effects do nothing
        PersistentDataContainer datacursor = cursosrmeta.getPersistentDataContainer();
        PersistentDataContainer datatarget = relicmeta.getPersistentDataContainer();

        NamespacedKey potionEffectKey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "potioneffect_tag");//getting ID

        if (datacursor.has(potionEffectKey, PersistentDataType.STRING)) { //making sure charm has potion effects

            String storedEffects = datacursor.get(potionEffectKey, PersistentDataType.STRING); //getting effects from charm

            if(datatarget.has(potionEffectKey, PersistentDataType.STRING)) // Checking if the target relic already has potion effects
            {
                String old_effects = datatarget.get(potionEffectKey, PersistentDataType.STRING);
                storedEffects=old_effects+","+storedEffects;

            }
            relicmeta.getPersistentDataContainer().set(potionEffectKey, PersistentDataType.STRING, storedEffects);


            target.setItemMeta(relicmeta);

            event.setCursor(null);

            event.setCancelled(true);
            player.sendMessage("§aSuccessfully applied "+cursosrmeta.getDisplayName() +" §ato your relic!");
        }

        else{
        player.sendMessage("Something went wrong with your charming");
}
    }



}
