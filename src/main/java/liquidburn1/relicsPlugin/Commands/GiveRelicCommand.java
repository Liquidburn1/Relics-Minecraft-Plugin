package liquidburn1.relicsPlugin.Commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;

import liquidburn1.relicsPlugin.Items.RelicItems;

import org.bukkit.command.CommandSender;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


import org.bukkit.plugin.java.JavaPlugin;


public class GiveRelicCommand {

    public static LiteralArgumentBuilder<CommandSourceStack> registerCommands(JavaPlugin plugin) {

        LiteralArgumentBuilder<CommandSourceStack> command = Commands.literal("giverelicitem")
                .then(Commands.literal("relic")
                        .executes(ctx -> {
                            CommandSender sender = ctx.getSource().getSender(); // Retrieve the command sender
                            Entity executor = ctx.getSource().getExecutor(); // Retrieve the command executor, which may or may not be the same as the sender

                            // Check whether the executor is a player, as you can only set a player's flight speed
                            if (!(executor instanceof Player player)) {

                                sender.sendPlainMessage("Only players can get relics!");
                                return Command.SINGLE_SUCCESS;
                            }



                            if (sender == executor) {
                                // If the player executed the command themselves
                                player.sendPlainMessage("Almost got a relic");

                                // Give the player a relic

                                player.getInventory().addItem(RelicItems.Relic());
                                return Command.SINGLE_SUCCESS;
                            }



                            player.sendPlainMessage("Gave a relic");
                            return Command.SINGLE_SUCCESS;
                        })

                )//Gives a Fragment
                .then(Commands.literal("fragment")
                        .executes(ctx->{

                            CommandSender sender = ctx.getSource().getSender();
                            Entity executor = ctx.getSource().getExecutor();

                            if (!(executor instanceof Player player)) {

                                sender.sendPlainMessage("Only players can get relics!");
                                return Command.SINGLE_SUCCESS;
                            }



                            if (sender == executor) {

                                player.sendPlainMessage("Almost got a relic");



                                player.getInventory().addItem(RelicItems.RelicFragment());
                                return Command.SINGLE_SUCCESS;
                            }



                            player.sendPlainMessage("Gave a relic");
                            return Command.SINGLE_SUCCESS;



                        }))
                        //Archaic Shard
                        .then(Commands.literal("Shard")
                        .executes(ctx->{

                            CommandSender sender = ctx.getSource().getSender();
                            Entity executor = ctx.getSource().getExecutor();

                            if (!(executor instanceof Player player)) {

                                sender.sendPlainMessage("Only players can get relics!");
                                return Command.SINGLE_SUCCESS;
                            }



                            if (sender == executor) {

                                player.sendPlainMessage("Almost got a relic");



                                player.getInventory().addItem(RelicItems.ArchaicShard());
                                return Command.SINGLE_SUCCESS;
                            }



                            player.sendPlainMessage("Gave a relic");
                            return Command.SINGLE_SUCCESS;



                        }))//Archaic Shard
                .then(Commands.literal("Archaic-Relic")
                        .executes(ctx->{

                            CommandSender sender = ctx.getSource().getSender();
                            Entity executor = ctx.getSource().getExecutor();

                            if (!(executor instanceof Player player)) {

                                sender.sendPlainMessage("Only players can get relics!");
                                return Command.SINGLE_SUCCESS;
                            }



                            if (sender == executor) {

                                player.sendPlainMessage("Almost got a relic");



                                player.getInventory().addItem(RelicItems.ArchaicRelic());
                                return Command.SINGLE_SUCCESS;
                            }



                            player.sendPlainMessage("Gave a relic");
                            return Command.SINGLE_SUCCESS;



                        }));

        return command;






    }}