package net.glipr.vowmod.block.entity;

import net.glipr.vowmod.VowMod;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ObeliskBlockEntity extends BlockEntity {
    public ObeliskBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.OBELISK_BLOCK_ENTITY, pos, state);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        VowMod.LOGGER.info("TICKING...");
        if (world.isClient()) {
            return;
        }
    }
}
