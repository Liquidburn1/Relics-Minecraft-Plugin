package liquidburn1.relicsPlugin.Listeners;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;


//Registers all the Listeners here
public class ListenerRegister {

    //Constructor
    public ListenerRegister() {}



    //Method to Register all Listeners
    public void registerListeners(JavaPlugin plugin) {
        PluginManager pm = plugin.getServer().getPluginManager();

        pm.registerEvents(new MobsLootListener(), plugin);
        pm.registerEvents(new RelicLootItemsListener(), plugin);
        pm.registerEvents(new RelicItemsListener(), plugin);
    }
}
