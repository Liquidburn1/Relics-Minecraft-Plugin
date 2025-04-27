package liquidburn1.relicsPlugin.Crafting;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.CraftingRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.plugin.java.JavaPlugin;

public class RelicCrafting {

  public static CraftingRecipe registerRelicCrafting (JavaPlugin plugin) {
        ItemStack outputRelic = liquidburn1.relicsPlugin.Items.RelicItems.Relic();
        ItemStack fragment = liquidburn1.relicsPlugin.Items.RelicItems.RelicFragment();

        NamespacedKey recipeKey = new NamespacedKey(plugin, "Crafting/relic_craft");

        ShapedRecipe relicRecipe = new ShapedRecipe(recipeKey, outputRelic);
        relicRecipe.shape("FFF", "FGF", "FFF");

        relicRecipe.setIngredient('F', new RecipeChoice.ExactChoice(fragment)); // Only your exact fragment will work
        relicRecipe.setIngredient('G', Material.GOLD_BLOCK); // Gold block

        return relicRecipe;
        
    }



    //Archaic Relics
    public static CraftingRecipe registerArchaicCrafting (JavaPlugin plugin) {
        ItemStack outputRelic = liquidburn1.relicsPlugin.Items.RelicItems.ArchaicRelic();
        ItemStack ArchaicShard = liquidburn1.relicsPlugin.Items.RelicItems.ArchaicShard();

        NamespacedKey recipeKey = new NamespacedKey(plugin, "Crafting/archaic_craft");

        ShapedRecipe relicRecipe = new ShapedRecipe(recipeKey, outputRelic);
        relicRecipe.shape("FFF", "FGF", "FFF");

        relicRecipe.setIngredient('F', new RecipeChoice.ExactChoice(ArchaicShard)); // Only your exact fragment will work
        relicRecipe.setIngredient('G', Material.GOLD_BLOCK); // Gold block

        return relicRecipe;

    }


    //Archaic Relic Crafting with Normal Relics
    public static CraftingRecipe registerArchaicCrafting2 (JavaPlugin plugin) {
        ItemStack outputRelic = liquidburn1.relicsPlugin.Items.RelicItems.ArchaicRelic();
        ItemStack Relic = liquidburn1.relicsPlugin.Items.RelicItems.Relic();

        NamespacedKey recipeKey = new NamespacedKey(plugin, "Crafting/archaic_craft_relic");

        ShapedRecipe relicRecipe = new ShapedRecipe(recipeKey, outputRelic);
        relicRecipe.shape("FFF", "FGF", "FFF");

        relicRecipe.setIngredient('F', new RecipeChoice.ExactChoice(Relic)); // Only your exact fragment will work
        relicRecipe.setIngredient('G', Material.DIAMOND_BLOCK); // Gold block

        return relicRecipe;

    }


}
