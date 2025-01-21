package com.practical_plushies_mobs.plushies.variants;

import com.practical_plushies_mobs.plushies.Plushie;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BigPlushie extends Plushie {
    public BigPlushie(AbstractBlock.Settings settings) {
        super(settings);
        setDefaultState((BlockState) ((BlockState) getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH)).with(WATERLOGGED, false));
    }

    @Override // com.practical_plushies_mobs.plushies.Plushie
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        VoxelShape shape;
        boolean northOrSouth = state.get(FACING) == Direction.SOUTH || state.get(FACING) == Direction.NORTH;
        VoxelShape shape2 = VoxelShapes.empty();
        if (northOrSouth) {
            shape = VoxelShapes.union(shape2, VoxelShapes.cuboid(0.1875d, 0.0d, 0.0625d, 0.8125d, 0.75d, 0.75d));
        } else {
            shape = VoxelShapes.union(shape2, VoxelShapes.cuboid(0.0625d, 0.0d, 0.1875d, 0.75d, 0.75d, 0.8125d));
        }
        return shape;
    }
}