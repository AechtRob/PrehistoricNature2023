package com.aechtrob.prehistoricnature.block.trees.walchia;

import com.aechtrob.prehistoricnature.block.BlockRegistration;
import com.aechtrob.prehistoricnature.entity.entities.PNBoat;
import com.aechtrob.prehistoricnature.item.ItemHandler;
import com.aechtrob.prehistoricnature.item.items.PNBoatItem;
import com.ibm.icu.impl.Pair;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static com.aechtrob.prehistoricnature.creativetabs.CreativeTabHelper.transportTabBoatTier;

public class ItemsTreeWalchia {
    public static void register(){}
    public static final RegistryObject<Item> WALCHIA_SIGN_ITEM = BlockRegistration.signItem(BlocksTreeWalchia.WALCHIA_PLANKS, BlocksTreeWalchia.WALCHIA_WALL_SIGN, BlocksTreeWalchia.WALCHIA_SIGN,
            List.of(ItemTags.SIGNS), BlocksTreeWalchia.treeName, BlocksTreeWalchia.treeId);


    public static final RegistryObject<Item> WALCHIA_BOAT_ITEM = ItemHandler.addItem("walchia_boat",
            () -> new PNBoatItem(false, PNBoat.Type.WALCHIA, new Item.Properties().stacksTo(1)),
            (provider, item) -> {provider.basicItem(item);},
            List.of(Pair.of("prehistoricnature_transport_tab",Pair.of(transportTabBoatTier, BlocksTreeWalchia.treeId))),
            "Walchia Boat");

    public static final RegistryObject<Item> WALCHIA_CHEST_BOAT_ITEM = ItemHandler.addItem("walchia_chest_boat",
            () -> new PNBoatItem(true, PNBoat.Type.WALCHIA, new Item.Properties().stacksTo(1)),
            (provider, item) -> {provider.basicItem(item);},
            List.of(Pair.of("prehistoricnature_transport_tab",Pair.of(transportTabBoatTier, BlocksTreeWalchia.treeId))),
            "Walchia Chest Boat");


            //regular item creation applies



}
