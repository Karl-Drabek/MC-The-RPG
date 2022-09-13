package com.legumage.mctherpg.block.entity;

import com.legumage.mctherpg.block.ModBlocks;
import com.legumage.mctherpg.block.custom.RefineryBlock;
import com.legumage.mctherpg.item.ModItems;
import com.legumage.mctherpg.item.inventory.ImplementedInventory;
import com.legumage.mctherpg.screen.RefineryScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class RefineryBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    public RefineryBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.REFINERY_BLOCK_ENTITY, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new RefineryScreenHandler(syncId, inv, this);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
    }
    public static void tick(World world, BlockPos pos, BlockState state, RefineryBlockEntity entity) {
        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }

    private static void craftItem(RefineryBlockEntity entity) {
        entity.removeStack(0, 1);
        entity.removeStack(1, 1);

        entity.setStack(2, new ItemStack(ModItems.REFINED_AERIALITE, entity.getStack(2).getCount() + 1));
    }

    private static boolean hasRecipe(RefineryBlockEntity entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == ModBlocks.WEATHERED_JETSAM.asItem();
        boolean hasItemSecondSlot = entity.getStack(0).getItem() == Blocks.COAL_BLOCK.asItem();
    return hasItemInFirstSlot && hasItemSecondSlot;
    }

    private static boolean hasNotReachedStackLimit(RefineryBlockEntity entity) {
        return entity.getStack(2).getCount() < entity.getStack(2).getMaxCount();
    }

    @Override
    public Text getDisplayName() {
        return null;
    }
}
