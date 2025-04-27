package liquidburn1.relicsPlugin.Commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;

import liquidburn1.relicsPlugin.Items.RelicItems;
import liquidburn1.relicsPlugin.RelicsPlugin;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.HoverEvent;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.logging.Logger;

public class ShowCommand {
    /// ./show will show the item in your hand to everyone in the server to show other people your cool weapons
    public static LiteralArgumentBuilder<CommandSourceStack> registerShowCommand(JavaPlugin plugin) {

        LiteralArgumentBuilder<CommandSourceStack> command = Commands.literal("show")
                .executes(ctx -> {
                    CommandSender sender = ctx.getSource().getSender();
                    Entity executor = ctx.getSource().getExecutor();

                    if (!(executor instanceof Player player)) {
                        sender.sendMessage("Only players can use this command!");
                        return Command.SINGLE_SUCCESS;
                    }




                    ItemStack item = player.getInventory().getItemInMainHand();
                    ItemMeta meta = item.getItemMeta();
                    Component itemName;

                    //if item is Nothing
                    if (item == null || item.getType() == Material.AIR) {

                        player.sendMessage("Hold an Item to Show off");
                        return Command.SINGLE_SUCCESS;
                    }


                    //Relic Names
                    if (meta != null && meta.hasDisplayName()) {

                        itemName = LegacyComponentSerializer.legacySection().deserialize(meta.getDisplayName());
                    }
                    //Non Relics (Vanilla items)
                    else {
                        // Fallback: use Minecraft material name nicely
                        String niceMaterialName = item.getType().name().toLowerCase().replace("_", " ");
                        niceMaterialName = Character.toUpperCase(niceMaterialName.charAt(0)) + niceMaterialName.substring(1);

                        itemName = Component.text(niceMaterialName);
                    }

                    TextComponent message = Component.text(player.getName() + " showed [")
                                    .append(
                                            itemName.hoverEvent(HoverEvent.showItem(item.asHoverEvent().value()))
                                    ).append(Component.text("]"));
                            player.getServer().sendPlainMessage("");
                            player.getServer().broadcast(message);
                            player.getServer().sendPlainMessage("");

                    return Command.SINGLE_SUCCESS;
                        }

                );


        return command;






    }}