package com.legumage.mctherpg.util;

import com.legumage.mctherpg.Mctherpg;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.swing.text.html.HTML;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> TEST_TAG = createTag("test_tag");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Mctherpg.MOD_ID, name));
        }
        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }
    public static class Items{

        //public static final Tag<Item> NAME = createCommonTag("name");
        private static TagKey<Item> createTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Mctherpg.MOD_ID, name));
        }
        private static TagKey<Item> createCommonTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }

    }
}
