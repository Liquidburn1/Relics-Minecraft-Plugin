package liquidburn1.relicsPlugin.Crafting;

import org.bukkit.Bukkit;
import org.bukkit.inventory.CraftingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class RegisterRecipes {

    public RegisterRecipes() {}

    public void RegisterAllRecipes(JavaPlugin plugin)
    {
        CraftingRecipe relicRecipe = RelicCrafting.registerRelicCrafting(plugin);
        CraftingRecipe ArchaicRecipe = RelicCrafting.registerArchaicCrafting(plugin);
        CraftingRecipe ArchaicRecipewithRelics = RelicCrafting.registerArchaicCrafting2(plugin);




        Bukkit.addRecipe(relicRecipe);
        Bukkit.addRecipe(ArchaicRecipe);
        Bukkit.addRecipe(ArchaicRecipewithRelics);
    }


}
