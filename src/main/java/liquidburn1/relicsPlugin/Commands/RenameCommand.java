package liquidburn1.relicsPlugin.Commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class RenameCommand {
    /// You can Rename items
    public static LiteralArgumentBuilder<CommandSourceStack> registerRenameCommand(JavaPlugin plugin) {

        LiteralArgumentBuilder<CommandSourceStack> command = Commands.literal("rename")
                .then(Commands.literal("Shulker")
                .then(Commands.argument("name", StringArgumentType.greedyString())
                .executes(ctx -> {
                            CommandSender sender = ctx.getSource().getSender();
                            Entity executor = ctx.getSource().getExecutor();

                            if (!(executor instanceof Player player)) {
                                sender.sendMessage("Only players can use this command!");
                                return Command.SINGLE_SUCCESS;
                            }




                            ItemStack item = player.getInventory().getItemInMainHand();
                            ItemMeta meta = item.getItemMeta();
                                if (!item.getType().name().endsWith("SHULKER_BOX")) {
                                    sender.sendMessage("You can only change names of Shulker Boxes");
                                    return Command.SINGLE_SUCCESS;
                                }

                                String newName = StringArgumentType.getString(ctx, "name");
                                newName=newName.replace('&','§');
                               meta.setDisplayName(newName);
                                item.setItemMeta(meta);
                                return Command.SINGLE_SUCCESS;



                        })

        ));


        return command;






    }

}