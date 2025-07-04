package liquidburn1.relicsPlugin.Utils;

import liquidburn1.relicsPlugin.RelicsPlugin;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class CreateRelic {
    public CreateRelic() {
    }
    //helper function to add Attributes
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

    public ItemStack Create_Relic(UUID code, Material material, String displayname, List<String>lore, double healthboost, double armor_tough, double armor, double attk_dmg, double attk_speed, double speed, EquipmentSlotGroup slot, Map<Enchantment, RandomRange> enchants,String potioneffects,boolean hideenchants,boolean ischarm,boolean charmable,String extratag) {

        ItemStack relic = new ItemStack(material);
        ItemMeta meta= relic.getItemMeta();
        meta.setDisplayName(displayname);


        //Add that something is a Charm
        if(!ischarm) {
            meta.setLore(lore);
        }
        else{
            List<String> newlore = new ArrayList<>();
            newlore.addAll(lore);
            newlore.add("§fCharm");

            meta.setLore(newlore);

        }
        //Health Modifier
        if(healthboost!= 0) {meta.addAttributeModifier(Attribute.MAX_HEALTH,addAttributes(code+"Health",healthboost, slot, AttributeModifier.Operation.ADD_NUMBER));}

        //Armor Tough
        if(armor_tough!=0) {meta.addAttributeModifier(Attribute.ARMOR_TOUGHNESS,addAttributes(code+"armor_tough",armor_tough, slot,AttributeModifier.Operation.ADD_NUMBER));}

        //Armor
        if(armor!=0) {meta.addAttributeModifier(Attribute.ARMOR,addAttributes(code+"armor",armor, slot, AttributeModifier.Operation.ADD_NUMBER));}

        //Attack Damage
        if(attk_dmg!=0){meta.addAttributeModifier(Attribute.ATTACK_DAMAGE,addAttributes(code+"attack_speed",attk_dmg, slot,AttributeModifier.Operation.ADD_NUMBER));}

        //Attack Speed
        if(attk_speed!=0){meta.addAttributeModifier(Attribute.ATTACK_SPEED,addAttributes(code+"attack_speed",attk_speed, slot,AttributeModifier.Operation.ADD_NUMBER));}

        //speed
         if(speed!=0){meta.addAttributeModifier(Attribute.MOVEMENT_SPEED,addAttributes(code+"speed",speed, slot,AttributeModifier.Operation.ADD_NUMBER));}



        //enchants
        enchants.forEach((enchant, level) -> {
            int lvl = level.getRandomInt();
            if(lvl>0) { meta.addEnchant(enchant, lvl, true);
            }
        }
        );

        // Add a special enchant glint
        if(hideenchants){meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);}

        // Doesn't allow people to stack it or Place it
        NamespacedKey relicTag = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "relic_tag");
        meta.getPersistentDataContainer().set(relicTag, PersistentDataType.STRING, code.toString());

        //add a charm tag so it can be charmed on other items
        if(ischarm) {
            NamespacedKey charmtag = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "charm_tag");
            meta.getPersistentDataContainer().set(charmtag, PersistentDataType.STRING, "charm_tag");
        }
        //otherwise allow user to charm it
        else if(charmable){
            NamespacedKey relicitem_tag = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "relicitem_tag");
            meta.getPersistentDataContainer().set(relicitem_tag, PersistentDataType.STRING, "relicitem_tag");

        }

        if(!(potioneffects.isEmpty()))
        {

            NamespacedKey potioneffect_tag = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "potioneffect_tag");
            meta.getPersistentDataContainer().set(potioneffect_tag, PersistentDataType.STRING, potioneffects);

        }


        //In case the relic needs some special effects like lightening on hit then when creating relics pass the tag Lighteningonhit and then it will happen. These values are hardcoded, because the listners listen for items that have that unique tag value so look at the README.MD or watch the video
        if(!(extratag==""))
        {
            NamespacedKey extratagkey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), extratag);
            meta.getPersistentDataContainer().set(extratagkey, PersistentDataType.STRING, extratag);


        }




        relic.setItemMeta(meta);
        return relic;





    }
}
