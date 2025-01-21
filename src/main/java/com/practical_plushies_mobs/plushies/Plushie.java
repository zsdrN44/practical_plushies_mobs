package com.practical_plushies_mobs.plushies;

import com.practical_plushies_mobs.sounds.PlushieSound;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;


public class Plushie extends HorizontalFacingBlock implements Waterloggable {
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public Plushie(AbstractBlock.Settings settings) {
        super(settings);
        setDefaultState((BlockState) ((BlockState) getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH)).with(WATERLOGGED, false));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        VoxelShape shape = VoxelShapes.empty();
        return shape;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{Properties.HORIZONTAL_FACING, WATERLOGGED});
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState) ((BlockState) super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite())).with(WATERLOGGED, Boolean.valueOf(ctx.getWorld().getFluidState(ctx.getBlockPos()).isOf(Fluids.WATER)));
    }

    public FluidState getFluidState(BlockState state) {
        return ((Boolean) state.get(WATERLOGGED)).booleanValue() ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (((Boolean) state.get(WATERLOGGED)).booleanValue()) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.getAbilities().allowModifyWorld) {
            return ActionResult.PASS;
        } else {
            world.playSound(player,pos, PlushieSound.PLUSHIE_SOUND,SoundCategory.BLOCKS,1.0F,1.0F);
            
            return ActionResult.SUCCESS;
        }
    }
}