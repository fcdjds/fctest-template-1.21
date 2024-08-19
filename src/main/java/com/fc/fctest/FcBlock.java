package com.fc.fctest;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class FcBlock {
    public static Block register(Block block, String name, boolean shouldRegisterItem){
        Identifier id = Identifier.of("fctest", name);
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final Block FCTEST_BLOCK = register(new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SAND)),
            "fctest_block", true
    );
    //占位
    public static void initialize(){}
    }
