package liquidburn1.relicsPlugin;
import liquidburn1.relicsPlugin.Commands.RegisterAllCommands;
import liquidburn1.relicsPlugin.Crafting.RegisterRecipes;
import liquidburn1.relicsPlugin.Items.Effects.Relicpotioneffects;
import liquidburn1.relicsPlugin.Listeners.ListenerRegister;
import liquidburn1.relicsPlugin.Listeners.RelicLootRegistry.RelicLootRegistry;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;
import java.util.UUID;


public final class RelicsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("RelicsPlugin has started");

        //Register all Relics
        RelicLootRegistry.registerRelics();

        //Regisers Commands
        RegisterAllCommands Commands = new RegisterAllCommands();
        Commands.registerCommands(this);



        //Crafting Recipe for Relics
        RegisterRecipes Recipes = new RegisterRecipes();
        Recipes.RegisterAllRecipes(this);


        //Potion Effects for Relics
        Relicpotioneffects.startRelicEffectChecker();



        //Registering All the Listeners
        ListenerRegister Listener= new ListenerRegister();
        Listener.registerListeners(this);

    }

    @Override
    public void onDisable() {
        getLogger().info("RelicsPlugin has stopped.");
    }
}
