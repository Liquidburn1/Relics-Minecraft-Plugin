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
    public RandomRange knockbackResistance;
    public EquipmentSlotGroup equipmentSlot;
    public Map<Enchantment, Integer> enchants;
    public boolean hideEnchants;

    // Constructor
    public RelicBlueprint(Material material, String displayName, List<String> lore,
                          RandomRange healthBoost, RandomRange armorToughness, RandomRange armor,
                          RandomRange attackDamage, RandomRange attackSpeed, RandomRange movementSpeed,
                          RandomRange knockbackResistance, EquipmentSlotGroup equipmentSlot,
                          Map<Enchantment, Integer> enchants,
                          boolean hideEnchants) {
        this.material = material;
        this.displayName = displayName;
        this.lore = lore;
        this.healthBoost = healthBoost;
        this.armorToughness = armorToughness;
        this.armor = armor;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.movementSpeed = movementSpeed;
        this.knockbackResistance = knockbackResistance;
        this.equipmentSlot = equipmentSlot;
        this.enchants = enchants;
        this.hideEnchants = hideEnchants;

    }
}
