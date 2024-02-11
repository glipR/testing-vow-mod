package net.glipr.vowmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.glipr.vowmod.VowMod;
import net.glipr.vowmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup VOW_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(VowMod.MOD_ID, "vow"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vow"))
                    .icon(() -> new ItemStack(Items.DIAMOND)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.OBELISK_BLOCK);
                        entries.add(ModBlocks.OBELISK_ENTITY);
                    }).build());

    public static void registerItemGroups() {
        VowMod.LOGGER.info("Registering Item Groups for " + VowMod.MOD_ID);
    }
}
