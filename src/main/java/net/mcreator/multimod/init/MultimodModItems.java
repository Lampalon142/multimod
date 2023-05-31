package net.mcreator.multimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.multimod.item.UraniumpowderItem;
import net.mcreator.multimod.item.UraniumingotItem;
import net.mcreator.multimod.MultimodMod;

public class MultimodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MultimodMod.MODID);
	public static final RegistryObject<Item> URANIUMINGOT = REGISTRY.register("uraniumingot", () -> new UraniumingotItem());
	public static final RegistryObject<Item> URANIUMPOWDER = REGISTRY.register("uraniumpowder", () -> new UraniumpowderItem());
	public static final RegistryObject<Item> URANIUMBLOCK = block(MultimodModBlocks.URANIUMBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
