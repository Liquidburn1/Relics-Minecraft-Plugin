package liquidburn1.relicsPlugin.Listeners.RelicLootRegistry;

import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.inventory.ItemStack;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class RelicLootRegistry {

    public static final List<RelicBlueprint> RELIC_LOOT = new ArrayList<>();


    public static void registerRelics() {

        RELIC_LOOT.add(liquidburn1.relicsPlugin.Items.RelicLoot.Charms.CharmItems.liquidsLaptop());
        RELIC_LOOT.add(liquidburn1.relicsPlugin.Items.RelicLoot.Boots.BootItems.Wali_boots());

    }



}
