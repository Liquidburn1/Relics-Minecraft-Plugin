package liquidburn1.relicsPlugin.Utils;

import liquidburn1.relicsPlugin.RelicsPlugin;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class CreateRelic {

    //to add Attributes
    private AttributeModifier addAttributes(String key, double amount, EquipmentSlotGroup slot, AttributeModifier.Operation type)
    {
        NamespacedKey attributekey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), key);

        return new AttributeModifier(
                attributekey,
                amount,
                type,
                slot
        );

    }


    public CreateRelic() {
    }

    public ItemStack Create_Relic(UUID code, Material material, String displayname, List<String>lore, double healthboost, double armor_tough, double armor, double attk_dmg, double attk_speed, double speed, double knockbackresis, EquipmentSlotGroup slot, Map<Enchantment, Integer> enchants,boolean hideenchants) {

        ItemStack relic = new ItemStack(material);
        ItemMeta meta= relic.getItemMeta();
        meta.setDisplayName(displayname);
        meta.setLore(lore);


        RelicsPlugin.getPlugin(RelicsPlugin.class).getLogger().info("These are the values "+healthboost+" "+armor_tough+" "+armor+" "+attk_dmg+" "+attk_speed+" "+speed+" "+knockbackresis);


        //Health Modifier
        if(healthboost > 0 || healthboost<0) {
            meta.addAttributeModifier(Attribute.MAX_HEALTH,addAttributes("Health",healthboost, slot, AttributeModifier.Operation.ADD_NUMBER));
        }

        //Armor Toughness
        if(armor_tough > 0 || armor_tough<0) {meta.addAttributeModifier(Attribute.ARMOR,addAttributes("armor",armor, slot, AttributeModifier.Operation.ADD_NUMBER));}

        //Armor
        if(armor > 0 || armor<0) {meta.addAttributeModifier(Attribute.ARMOR_TOUGHNESS,addAttributes("armor_tough",armor_tough, slot,AttributeModifier.Operation.ADD_NUMBER));}

        //Attack Damage
        if(attk_dmg>0 || attk_dmg<0){meta.addAttributeModifier(Attribute.ATTACK_DAMAGE,addAttributes("attack_speed",attk_dmg, slot,AttributeModifier.Operation.ADD_NUMBER));}

        //Attack Speed
        if(attk_speed>0.0 || attk_speed<0.0){meta.addAttributeModifier(Attribute.ATTACK_SPEED,addAttributes("attack_speed",attk_speed, slot,AttributeModifier.Operation.ADD_NUMBER));}

        //speed
         if(speed>0.0 || speed<0.0){meta.addAttributeModifier(Attribute.MOVEMENT_SPEED,addAttributes("speed",speed, slot,AttributeModifier.Operation.ADD_NUMBER));}


        //KnockbackResistance
        if(knockbackresis>0 || knockbackresis<0){meta.addAttributeModifier(Attribute.KNOCKBACK_RESISTANCE,addAttributes("knock_resistance",knockbackresis, slot, AttributeModifier.Operation.ADD_NUMBER));}



        enchants.forEach((enchant, level) -> meta.addEnchant(enchant, level, true));

        // Add a special enchant glint
        if(hideenchants){meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);}

        // Dont allow people to place this item and unable to stack it
        NamespacedKey relicTag = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "relic_tag");
        meta.getPersistentDataContainer().set(relicTag, PersistentDataType.STRING, code.toString());

        relic.setItemMeta(meta);
        return relic;





    }
}
