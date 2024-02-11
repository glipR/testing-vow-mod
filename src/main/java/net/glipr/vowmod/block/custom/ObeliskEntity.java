package net.glipr.vowmod.block.custom;

import com.mojang.serialization.MapCodec;
import net.glipr.vowmod.VowMod;
import net.glipr.vowmod.block.entity.ModBlockEntities;
import net.glipr.vowmod.block.entity.ObeliskBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ObeliskEntity extends BlockWithEntity implements BlockEntityProvider {

    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 4, 16);
    public static final MapCodec<ObeliskEntity> CODEC = ObeliskEntity.createCodec(ObeliskEntity::new);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public ObeliskEntity(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ObeliskBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        VowMod.LOGGER.info(type.toString() + " " + ModBlockEntities.OBELISK_BLOCK_ENTITY.toString());
        VowMod.LOGGER.info(ModBlockEntities.OBELISK_BLOCK_ENTITY == type ? "Matches" : "Doesn't Match");
        return validateTicker(type, ModBlockEntities.OBELISK_BLOCK_ENTITY,
                ((world1, pos, state1, blockEntity) -> blockEntity.tick(world1, pos, state1)));
    }
}
