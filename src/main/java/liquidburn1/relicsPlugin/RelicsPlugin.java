package liquidburn1.relicsPlugin;
import io.papermc.paper.event.player.AsyncChatEvent;
import liquidburn1.relicsPlugin.Commands.RegisterAllCommands;
import liquidburn1.relicsPlugin.Crafting.RegisterRecipes;
import liquidburn1.relicsPlugin.Listeners.ListenerRegister;
import liquidburn1.relicsPlugin.Items.RelicLootRegistry;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;


public final class RelicsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("RelicsPlugin has started");

        //Register all Relics
        RelicLootRegistry.registerRelics();
        RelicLootRegistry.registerArchaic();

        //Registers Commands
        RegisterAllCommands Commands = new RegisterAllCommands();
        Commands.registerCommands(this);



        //Crafting Recipe for Relics
        RegisterRecipes Recipes = new RegisterRecipes();
        Recipes.RegisterAllRecipes(this);

        //Registering All the Listeners and potioneffect runnable
        ListenerRegister Listener= new ListenerRegister();
        Listener.registerListeners(this);





    }




    @Override
    public void onDisable() {
        getLogger().info("RelicsPlugin has stopped.");
    }
}
