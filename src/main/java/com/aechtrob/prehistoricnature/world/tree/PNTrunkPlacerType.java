package com.aechtrob.prehistoricnature.world.tree;

import com.aechtrob.prehistoricnature.PrehistoricNatureMod;
import com.aechtrob.prehistoricnature.world.tree.lepidodendron.LepidodendronTrunkPlacer;
import com.aechtrob.prehistoricnature.world.tree.walchia.WalchiaTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PNTrunkPlacerType {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER_TYPES = DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, PrehistoricNatureMod.MOD_ID);

    public static RegistryObject<TrunkPlacerType<LepidodendronTrunkPlacer>> LEPIDODENDRON_TRUNK_PLACER = TRUNK_PLACER_TYPES.register("lepidodendron_trunk_placer", () -> new TrunkPlacerType<>(LepidodendronTrunkPlacer.CODEC));

    public static RegistryObject<TrunkPlacerType<WalchiaTrunkPlacer>> WALCHIA_TRUNK_PLACER = TRUNK_PLACER_TYPES.register("walchia_trunk_placer", () -> new TrunkPlacerType<>(WalchiaTrunkPlacer.CODEC));

    //public static RegistryObject<TrunkPlacerType<LepidodendronTrunkPlacer>> LEPIDODENDRON_TRUNK_PLACER = TRUNK_PLACER_TYPES.register("lepidodendron_trunk_placer", () -> new TrunkPlacerType<>(LepidodendronTrunkPlacer.CODEC));

}