package com.hashicraft.chromagreen.utils;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.hashicraft.chromagreen.ChromaGreenMod;
import com.hashicraft.chromagreen.blocks.ChromaGreen;

public class RegistryHandler {
  
  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChromaGreenMod.MOD_ID);
  public static final RegistryObject<Block> CHROMAGREEN_BLOCK = BLOCKS.register("chromagreen_block", ChromaGreen::new);

  private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChromaGreenMod.MOD_ID);
  public static final RegistryObject<Item> CHROMAGREEN = ITEMS.register("chromagreen", () -> new BlockItem(
    CHROMAGREEN_BLOCK.get(), new Item.Properties().group(ChromaGreenMod.TAB)
  ));
  

  public static void init() {
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }

}
