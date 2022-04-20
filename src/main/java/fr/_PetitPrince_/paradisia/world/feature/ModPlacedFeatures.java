package fr._PetitPrince_.paradisia.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> PARADISIUM_ORE_PLACED = PlacementUtils.register("paradisium_ore_placed",
        ModConfiguredFeatures.PARADISIUM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

}