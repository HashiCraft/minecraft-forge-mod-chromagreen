package com.hashicraft.chromagreen.blocks;

import java.util.function.ToIntFunction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.ToolType;

public class ChromaGreen extends Block {

  private static final Logger LOGGER = LogManager.getLogger();

  public ChromaGreen() {
    super(
      Block.Properties.from(Blocks.GREEN_WOOL)
      .hardnessAndResistance(1.0f, 1.0f)
      .sound(SoundType.GLASS)
      .harvestLevel(0)
      .harvestTool(ToolType.PICKAXE)
      .setLightLevel(getLightValueLit(15))
    );
  }

   @OnlyIn(Dist.CLIENT)
   @Override
   public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
      return 1.0F;
   }

  private static ToIntFunction<BlockState> getLightValueLit(int lightValue) {
	  return (block) -> {
		  return lightValue;
	  };
  }
}
