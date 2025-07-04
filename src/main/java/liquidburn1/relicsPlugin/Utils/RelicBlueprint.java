package liquidburn1.relicsPlugin.Utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;

import java.util.List;
import java.util.Map;

public class RelicBlueprint {

    public Material material;
    public String displayName;
    public List<String> lore;
    public RandomRange healthBoost;
    public RandomRange armorToughness;
    public RandomRange armor;
    public RandomRange attackDamage;
    public RandomRange attackSpeed;
    public RandomRange movementSpeed;

    public EquipmentSlotGroup equipmentSlot;
    public Map<Enchantment, RandomRange> enchants;
    public String potioneffects;
    public boolean hideEnchants;
    public boolean ischarm;
    public boolean charmable;
    public String extratag;

    // Constructor
    public RelicBlueprint(Material material, String displayName, List<String> lore,
                          RandomRange healthBoost, RandomRange armorToughness, RandomRange armor,
                          RandomRange attackDamage, RandomRange attackSpeed, RandomRange movementSpeed,
                           EquipmentSlotGroup equipmentSlot,
                          Map<Enchantment, RandomRange> enchants,String potioneffects,
                          boolean hideEnchants,boolean ischarm,boolean charmable,String extratag) {
        this.material = material;
        this.displayName = displayName;
        this.lore = lore;
        this.healthBoost = healthBoost;
        this.armorToughness = armorToughness;
        this.armor = armor;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.movementSpeed = movementSpeed;
        this.equipmentSlot = equipmentSlot;
        this.enchants = enchants;
        this.potioneffects=potioneffects;
        this.hideEnchants = hideEnchants;
        this.ischarm = ischarm;
        this.charmable = charmable;
        this.extratag = extratag;

    }
}
