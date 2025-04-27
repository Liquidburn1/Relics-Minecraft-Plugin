package liquidburn1.relicsPlugin.Items.Effects;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;
import java.util.Map;

//example of how this works:

//"§x§F§C§8§F§0§0§lR§x§F§B§9§4§0§2§le§x§F§9§9§9§0§4§ll§x§F§8§9§F§0§6§li§x§F§6§A§4§0§8§lc §x§F§3§A§E§0§C§lF§x§F§2§B§4§0§E§lr§x§F§0§B§9§1§0§la§x§E§F§B§E§1§2§lg§x§E§D§C§3§1§4§lm§x§E§C§C§9§1§6§le§x§E§A§C§E§1§8§ln§x§E§9§D§3§1§A§lt", List.of(new PotionEffect(PotionEffectType.REGENERATION, 150, 0)));
//key is the name of whatever relic item you are trying to give pot effects to. and the value is a list of the potion effects it gives.




public class RelicEffectRegistry {



    public static final Map<String, List<PotionEffect>> MainHandEffects = Map.of(
            //Relic
            "§x§F§D§4§9§4§4§l§oR§x§F§6§5§B§4§8§l§oE§x§F§0§6§C§4§C§l§oL§x§E§9§7§E§4§F§l§oI§x§E§2§8§F§5§3§l§oC", List.of(
                    new PotionEffect(PotionEffectType.JUMP_BOOST, 150, 1),
                    new PotionEffect(PotionEffectType.SPEED, 150, 2)
            ),
            //Fragment
            "§x§F§C§8§F§0§0§lR§x§F§B§9§4§0§2§le§x§F§9§9§9§0§4§ll§x§F§8§9§F§0§6§li§x§F§6§A§4§0§8§lc §x§F§3§A§E§0§C§lF§x§F§2§B§4§0§E§lr§x§F§0§B§9§1§0§la§x§E§F§B§E§1§2§lg§x§E§D§C§3§1§4§lm§x§E§C§C§9§1§6§le§x§E§A§C§E§1§8§ln§x§E§9§D§3§1§A§lt", List.of(
                    new PotionEffect(PotionEffectType.REGENERATION, 150, 0)
            )
    );

//Offhand
    public static final Map<String, List<PotionEffect>> OffHandEffects = Map.of(
            //Fragment
            "§x§F§C§8§F§0§0§lR§x§F§B§9§4§0§2§le§x§F§9§9§9§0§4§ll§x§F§8§9§F§0§6§li§x§F§6§A§4§0§8§lc §x§F§3§A§E§0§C§lF§x§F§2§B§4§0§E§lr§x§F§0§B§9§1§0§la§x§E§F§B§E§1§2§lg§x§E§D§C§3§1§4§lm§x§E§C§C§9§1§6§le§x§E§A§C§E§1§8§ln§x§E§9§D§3§1§A§lt", List.of(
                    new PotionEffect(PotionEffectType.REGENERATION, 150, 0)
            )
    );

}
