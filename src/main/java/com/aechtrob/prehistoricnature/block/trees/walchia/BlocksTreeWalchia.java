package com.aechtrob.prehistoricnature.block.trees.walchia;

import com.aechtrob.prehistoricnature.PrehistoricNatureMod;
import com.aechtrob.prehistoricnature.block.BlockHandler;
import com.aechtrob.prehistoricnature.block.BlockRegistration;
import com.aechtrob.prehistoricnature.block.trees.WoodTypeHelper;
import com.aechtrob.prehistoricnature.creativetabs.CreativeTabHelper;
import com.aechtrob.prehistoricnature.datagen.loottable.BlockLootSubProvider;
import com.aechtrob.prehistoricnature.world.tree.walchia.WalchiaTreeGrower;
import com.ibm.icu.impl.Pair;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class BlocksTreeWalchia {
    public static class WalchiaBlockTags {
        public static TagKey<Block> WALCHIA_LOGS = BlockTags.create(new ResourceLocation(PrehistoricNatureMod.MOD_ID, "walchia_logs"));
    }
    public static class WalchiaItemTags {
        public static TagKey<Item> WALCHIA_LOGS = ItemTags.create(new ResourceLocation(PrehistoricNatureMod.MOD_ID, "walchia_logs"));
    }
    public static String treeName = "walchia";
    public static int treeId = 1;
    public static final WoodType WALCHIA = WoodTypeHelper.putWoodType(WoodType.create(treeName));

    public static final RegistryObject<Block> WALCHIA_STRIPPED_LOG = BlockRegistration.strippedLogBlock(
                                                                            List.of(WalchiaBlockTags.WALCHIA_LOGS,BlockTags.MINEABLE_WITH_AXE,BlockTags.LOGS,BlockTags.LOGS_THAT_BURN,BlockTags.OVERWORLD_NATURAL_LOGS),
                                                                            List.of(WalchiaItemTags.WALCHIA_LOGS, ItemTags.LOGS,ItemTags.LOGS_THAT_BURN),treeName,treeId);
    public static final RegistryObject<Block> WALCHIA_LOG = BlockRegistration.logBlock(WALCHIA_STRIPPED_LOG,
                                                                            List.of(WalchiaBlockTags.WALCHIA_LOGS,BlockTags.MINEABLE_WITH_AXE,BlockTags.LOGS,BlockTags.LOGS_THAT_BURN,BlockTags.OVERWORLD_NATURAL_LOGS),
                                                                            List.of(WalchiaItemTags.WALCHIA_LOGS, ItemTags.LOGS,ItemTags.LOGS_THAT_BURN),treeName,treeId);
    public static final RegistryObject<Block> WALCHIA_STRIPPED_WOOD = BlockRegistration.strippedWoodBlock(WALCHIA_STRIPPED_LOG,
                                                                            List.of(WalchiaBlockTags.WALCHIA_LOGS, BlockTags.MINEABLE_WITH_AXE,BlockTags.LOGS,BlockTags.LOGS_THAT_BURN,BlockTags.OVERWORLD_NATURAL_LOGS),
                                                                            List.of(WalchiaItemTags.WALCHIA_LOGS, ItemTags.LOGS,ItemTags.LOGS_THAT_BURN), treeName, treeId);
    public static final RegistryObject<Block> WALCHIA_WOOD = BlockRegistration.woodBlock(WALCHIA_LOG,WALCHIA_STRIPPED_WOOD, List.of(WalchiaBlockTags.WALCHIA_LOGS, BlockTags.MINEABLE_WITH_AXE,BlockTags.LOGS,BlockTags.LOGS_THAT_BURN,BlockTags.OVERWORLD_NATURAL_LOGS),
                                                                            List.of(WalchiaItemTags.WALCHIA_LOGS, ItemTags.LOGS,ItemTags.LOGS_THAT_BURN), treeName, treeId);
    public static final RegistryObject<Block> WALCHIA_SAPLING = BlockRegistration.saplingBlock(new WalchiaTreeGrower(),List.of(BlockTags.SAPLINGS),
                                                                            List.of(ItemTags.SAPLINGS), treeName, treeId);
    public static final RegistryObject<Block> WALCHIA_LEAVES = BlockRegistration.leafBlock(WALCHIA_SAPLING,
                                                                            List.of(BlockTags.MINEABLE_WITH_HOE, BlockTags.LEAVES),List.of(ItemTags.LEAVES), treeName, treeId);
    public static final RegistryObject<Block> WALCHIA_PLANKS = BlockRegistration.plankBlock(WalchiaItemTags.WALCHIA_LOGS,List.of(BlockTags.MINEABLE_WITH_AXE,BlockTags.PLANKS),
                                                                            List.of(ItemTags.PLANKS),treeName,treeId);
    public static final RegistryObject<Block> WALCHIA_SLAB = BlockRegistration.slabBlock(WALCHIA_PLANKS,List.of(BlockTags.MINEABLE_WITH_AXE,BlockTags.WOODEN_SLABS),
                                                                            List.of(ItemTags.WOODEN_SLABS),treeName,treeId);
    public static final RegistryObject<Block> WALCHIA_STAIRS = BlockRegistration.stairsBlock(WALCHIA_PLANKS,List.of(BlockTags.MINEABLE_WITH_AXE,BlockTags.WOODEN_STAIRS),
                                                                            List.of(ItemTags.WOODEN_STAIRS),treeName,treeId);
    public static final RegistryObject<Block> WALCHIA_FENCE = BlockRegistration.fenceBlock(WALCHIA_PLANKS,List.of(BlockTags.MINEABLE_WITH_AXE,BlockTags.WOODEN_FENCES),
                                                                            List.of(ItemTags.WOODEN_FENCES),treeName,treeId);
    public static final RegistryObject<Block> WALCHIA_FENCE_GATE = BlockRegistration.fenceGateBlock(WALCHIA_PLANKS,List.of(BlockTags.MINEABLE_WITH_AXE,BlockTags.FENCE_GATES),
                                                                            List.of(ItemTags.FENCE_GATES), treeName, treeId);
    public static final RegistryObject<Block> WALCHIA_DOOR = BlockRegistration.doorBlock(WALCHIA_PLANKS,List.of(BlockTags.MINEABLE_WITH_AXE,BlockTags.WOODEN_DOORS),
                                                                            List.of(ItemTags.WOODEN_DOORS), treeName, treeId);
    //Needs manual json file.
    public static final RegistryObject<Block> WALCHIA_TRAPDOOR = BlockRegistration.trapdoorBlock(WALCHIA_PLANKS,List.of(BlockTags.MINEABLE_WITH_AXE,BlockTags.WOODEN_TRAPDOORS),
                                                                            List.of(ItemTags.WOODEN_TRAPDOORS), treeName, treeId);
    public static final RegistryObject<Block> WALCHIA_PRESSURE_PLATE = BlockRegistration.pressurePlateBlock(WALCHIA_PLANKS,List.of(BlockTags.MINEABLE_WITH_AXE,BlockTags.WOODEN_PRESSURE_PLATES),
                                                                            List.of(ItemTags.WOODEN_PRESSURE_PLATES), treeName, treeId);
    public static final RegistryObject<Block> WALCHIA_BUTTON = BlockRegistration.buttonBlock(WALCHIA_PLANKS ,List.of(BlockTags.MINEABLE_WITH_AXE,BlockTags.WOODEN_BUTTONS),
                                                                            List.of(ItemTags.WOODEN_BUTTONS), treeName, treeId);
    public static final RegistryObject<Block> WALCHIA_WALL_SIGN = BlockRegistration.wallSignBlock(WALCHIA,List.of(BlockTags.WALL_SIGNS),treeName);
    public static final RegistryObject<Block> WALCHIA_SIGN = BlockRegistration.standingSignBlock(WALCHIA_WALL_SIGN,WALCHIA,List.of(BlockTags.STANDING_SIGNS),treeName);

    public static final RegistryObject<Block> WALCHIA_LADDER = BlockRegistration.ladderBlock(
            WALCHIA_PLANKS, List.of(BlockTags.MINEABLE_WITH_AXE, BlockTags.CLIMBABLE),List.of(),treeName,treeId);


//    public static final RegistryObject<Block> WALCHIA_BENCH = BlockHandler.registerBlock("walchia_bench",
//            () -> new PNBenchBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)
//                    , 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));

    //Other tree-specific stuff:

    public static void register() {
    }
}
