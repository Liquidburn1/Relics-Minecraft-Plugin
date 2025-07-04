package liquidburn1.relicsPlugin.Listeners;

import liquidburn1.relicsPlugin.Listeners.BaseFunctionalityListeners.MobsLootListener;
import liquidburn1.relicsPlugin.Listeners.BaseFunctionalityListeners.RelicItemsListener;
import liquidburn1.relicsPlugin.Listeners.BaseFunctionalityListeners.RelicRulesListener;
import liquidburn1.relicsPlugin.Listeners.BaseFunctionalityListeners.Relicpotioneffects;
import liquidburn1.relicsPlugin.Listeners.RelicItemAbilities.CustomEnchantsListener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;


//Registers all the Listeners here
public class ListenerRegister {

    //Constructor
    public ListenerRegister() {}



    //Method to Register all Listeners
    public void registerListeners(JavaPlugin plugin) {
        PluginManager pm = plugin.getServer().getPluginManager();
        Relicpotioneffects.startRelicEffectChecker();
        pm.registerEvents(new MobsLootListener(), plugin);
        pm.registerEvents(new RelicRulesListener(), plugin);
        pm.registerEvents(new RelicItemsListener(), plugin);
        pm.registerEvents(new CustomEnchantsListener(), plugin);
    }
}
