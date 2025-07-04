package liquidburn1.relicsPlugin.Items;

import liquidburn1.relicsPlugin.Items.ArchaicLoot.*;
import liquidburn1.relicsPlugin.Items.RelicLoot.*;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;

import java.util.ArrayList;
import java.util.List;


public class RelicLootRegistry {

    public static final List<RelicBlueprint> RELIC_LOOT = new ArrayList<>();
    public static final List<RelicBlueprint> ARCHAIC_LOOT = new ArrayList<>();


    public static void registerRelics() {


        //Charms
        RELIC_LOOT.add(Charms.liquidsLaptop());
        RELIC_LOOT.add(Charms.portal_gun_charm());
        RELIC_LOOT.add(Charms.omnitrix_sample());
        RELIC_LOOT.add(Charms.charm_of_the_dragon_soul());
        RELIC_LOOT.add(Charms.hollow_charm());
        RELIC_LOOT.add(Charms.pip_boy_circuit());
        RELIC_LOOT.add(Charms.charm_of_controlled_fury());
        RELIC_LOOT.add(Charms.bulwark_rune());
        RELIC_LOOT.add(Charms.tideborn_shell());
        RELIC_LOOT.add(Charms.cloak_of_hollow_sight());
        RELIC_LOOT.add(Charms.driftcore());
        RELIC_LOOT.add(Charms.kitsunes_spring());
        RELIC_LOOT.add(Charms.flash_fragment());
        //Helmets
        RELIC_LOOT.add(Helmets.mandalorian_Helmet());
        RELIC_LOOT.add(Helmets.Eldritch_Helm());
        RELIC_LOOT.add(Helmets.shell_of_the_patient_victor());
        RELIC_LOOT.add(Helmets.Kabuto_onislayer());
        RELIC_LOOT.add(Helmets.crown_of_balance());
        RELIC_LOOT.add(Helmets.t_visor());
        RELIC_LOOT.add(Helmets.voidWalker_helm());
        //ChestPlates
        RELIC_LOOT.add(Chestplates.Eldritch_Chest());
        RELIC_LOOT.add(Chestplates.Do_oniSlayer());
        RELIC_LOOT.add(Chestplates.voidWalker_Chest());
        RELIC_LOOT.add(Chestplates.mandalorian_Chest());
        RELIC_LOOT.add(Chestplates.titanium_coreplate());
        RELIC_LOOT.add(Chestplates.mantle_of_4_nations());
        //Legs
        RELIC_LOOT.add(Leggings.mandalorian_Legs());
        RELIC_LOOT.add(Leggings.Eldritch_Legs());
        RELIC_LOOT.add(Leggings.Haidate_oniSlayer());
        RELIC_LOOT.add(Leggings.servo_pistons());
        RELIC_LOOT.add(Leggings.bindings_of_elements());
        RELIC_LOOT.add(Leggings.voidWalker_Legs());
        //Boots
        RELIC_LOOT.add(Boots.Eldritch_boots());
        RELIC_LOOT.add(Boots.boots_of_Icarus());
        RELIC_LOOT.add(Boots.Flash_Boots());
        RELIC_LOOT.add(Boots.Suneate_oniSlayer());
        RELIC_LOOT.add(Boots.voidWalker_Boots());
        RELIC_LOOT.add(Boots.mandalorian_Boots());
        RELIC_LOOT.add(Boots.steps_of_tempest());
        RELIC_LOOT.add(Boots.Treadwalkers_of_Judgment());
        //Pickaxes
        RELIC_LOOT.add(Pickaxes.Nooks_pickaxe());
        RELIC_LOOT.add(Pickaxes.drunkenminerspick());
        RELIC_LOOT.add(Pickaxes.reaperspickaxe());
        //Axes
        RELIC_LOOT.add(Axes.plague_axe());
        RELIC_LOOT.add(Axes.axe_of_amity());
        RELIC_LOOT.add(Axes.Axe_of_kratos());
        RELIC_LOOT.add(Axes.doomslayerslogging());
        //Bows
        RELIC_LOOT.add(Bows.ashmaker());
        RELIC_LOOT.add(Bows.Daryls_crossbow());
        RELIC_LOOT.add(Bows.green());
        //Swords
        RELIC_LOOT.add(Swords.Excalibur());
        RELIC_LOOT.add(Swords.Michonne_Katana());
        RELIC_LOOT.add(Swords.sword_of_maximus());
        RELIC_LOOT.add(Swords.Nanami_blade());
        RELIC_LOOT.add(Swords.sword_of_totsuka());
        //MISC
        RELIC_LOOT.add(MISC.missinglink());

        //Tridents
        RELIC_LOOT.add(Tridents.aquaman_trident());
        RELIC_LOOT.add(Tridents.trident_of_the_deep());
        RELIC_LOOT.add(Tridents.poseidons_fury());
        
}



    //Register all Archaics here
    public static void registerArchaic(){
        //Axes
        ARCHAIC_LOOT.add(AAxes.mjolnir());

        //Maces
        ARCHAIC_LOOT.add(AMace.battlebeast());

        //Swords
        ARCHAIC_LOOT.add(ASwords.sterling());
        ARCHAIC_LOOT.add(ASwords.Keeper());

        //Champion boots
        ARCHAIC_LOOT.add(ABoots.championboots());

        //Armor
        ARCHAIC_LOOT.add(ABoots.drunks_boots());
        ARCHAIC_LOOT.add(AHelmet.drunken_helm());
        ARCHAIC_LOOT.add(ALegs.drunk_legs());
        ARCHAIC_LOOT.add(AChest.drunk_chest());

        //Xur
        ARCHAIC_LOOT.add(ABoots.xur_boots());
        ARCHAIC_LOOT.add(AChest.xur_chest());
        ARCHAIC_LOOT.add(ALegs.xur_legs());
        ARCHAIC_LOOT.add(AHelmet.xur_helm());

        //Bows
        ARCHAIC_LOOT.add(ABows.Hawkeyebow());

    }



}
