package com.aechtrob.prehistoricnature.block.trees.walchia;

import com.aechtrob.prehistoricnature.entity.block.blocks.PNSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;

import static com.aechtrob.prehistoricnature.entity.block.PNBlockEntities.BLOCK_ENTITY_REGISTER;

public class EntitiesTreeWalchia {

    public static void register(){

    }
    public static final RegistryObject<BlockEntityType<PNSignBlockEntity>> WALCHIA_SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITY_REGISTER.register("walchia_sign_block_entity", ()->
                    BlockEntityType.Builder.of(PNSignBlockEntity::new, BlocksTreeWalchia.WALCHIA_WALL_SIGN.get(),
                            BlocksTreeWalchia.WALCHIA_SIGN.get()).build(null));


}
