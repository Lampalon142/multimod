package net.mcreator.multimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.multimod.block.UraniumblockBlock;
import net.mcreator.multimod.MultimodMod;

public class MultimodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MultimodMod.MODID);
	public static final RegistryObject<Block> URANIUMBLOCK = REGISTRY.register("uraniumblock", () -> new UraniumblockBlock());
}
