package com.aechtrob.prehistoricnature.block;

import com.aechtrob.prehistoricnature.tag.*;
import com.machinezoo.noexception.throwing.*;
import com.aechtrob.prehistoricnature.*;
import com.aechtrob.prehistoricnature.datagen.*;
import com.aechtrob.prehistoricnature.item.*;
import com.aechtrob.prehistoricnature.tag.*;
import net.minecraft.tags.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.material.*;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.registries.*;

import java.util.*;

public class FossilBlocks {

    public static void register(){

    }
    public static final RegistryObject<Block> CARBONIFEROUS_FOSSIL = addFossilBlock("carboniferous_fossil", "Carboniferous Fossil");


    public static RegistryObject<Block> addFossilBlock(String name, String translation){
        return BlockHandler.registerBlock(name,
                () -> {return new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F).requiresCorrectToolForDrops());},
                List.of(BlockTags.MINEABLE_WITH_PICKAXE, PrehistoricNatureTags.MINALBE_WITH_GEOLOGICAL_PICK), block -> {
                    ThrowingBiConsumer<BlockStateProvider, Block> blockStateProviderBlockThrowingBiConsumer = BlockStateProvider::simpleBlock;
                },translation);
    }


}