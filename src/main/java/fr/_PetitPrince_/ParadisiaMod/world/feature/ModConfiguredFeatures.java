package fr._PetitPrince_.ParadisiaMod.world.feature;

import fr._PetitPrince_.ParadisiaMod.block.deepslate_paradisium_ore;
import fr._PetitPrince_.ParadisiaMod.block.paradisium_ore;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PARADISIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, paradisium_ore.PARADISIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, deepslate_paradisium_ore.DEEPSLATE_PARADISIUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PARADISIUM_ORE = FeatureUtils.register("paradisium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PARADISIUM_ORES, 3));

}
