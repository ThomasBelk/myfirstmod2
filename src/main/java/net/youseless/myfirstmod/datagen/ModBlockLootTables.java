package net.youseless.myfirstmod.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.youseless.myfirstmod.block.ModBlocks;
import net.youseless.myfirstmod.item.ModItem;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BLACK_OPAL_BLOCK.get());

        add(ModBlocks.BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.BLACK_OPAL_ORE.get(),
                        ModItem.RAW_BLACK_OPAL.get()));

        add(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get(),
                        ModItem.RAW_BLACK_OPAL.get()));

        add(ModBlocks.NETHERRACK_BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHERRACK_BLACK_OPAL_ORE.get(),
                        ModItem.RAW_BLACK_OPAL.get()));

        add(ModBlocks.ENDSTONE_BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ENDSTONE_BLACK_OPAL_ORE.get(),
                        ModItem.RAW_BLACK_OPAL.get()));

        // ebony wood
        dropSelf(ModBlocks.EBONY_LOG.get());
        dropSelf(ModBlocks.EBONY_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_EBONY_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_EBONY_LOG.get());
        dropSelf(ModBlocks.EBONY_PLANKS.get());
        dropSelf(ModBlocks.EBONY_SAPLING.get());

        add(ModBlocks.EBONY_LEAVES.get(),
                (block) -> createLeavesDrops(block, ModBlocks.EBONY_LEAVES.get(),
                        NORMAL_LEAVES_SAPLING_CHANCES));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject :: get) :: iterator;
    }
}
