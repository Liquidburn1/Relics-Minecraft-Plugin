package liquidburn1.relicsPlugin.Commands;

import com.mojang.brigadier.tree.LiteralCommandNode;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;

import org.bukkit.plugin.java.JavaPlugin;



//Registers all the Commands from the Commands Files
public class RegisterAllCommands {


    public RegisterAllCommands() {
    }


    public void registerCommands(JavaPlugin plugin) {
        plugin.getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS, commands -> {
            // Register all inside one place
            LiteralCommandNode<CommandSourceStack> buildCommand = GiveRelicCommand.registerCommands(plugin).build();
            commands.registrar().register(buildCommand);

            LiteralCommandNode<CommandSourceStack> showCommand = ShowCommand.registerShowCommand(plugin).build();
            commands.registrar().register(showCommand);

            LiteralCommandNode<CommandSourceStack> renameCommand = RenameCommand.registerRenameCommand(plugin).build();
            commands.registrar().register(renameCommand);
        });
    }


}
