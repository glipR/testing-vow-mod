package net.glipr.vowmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.glipr.vowmod.VowMod;
import net.glipr.vowmod.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<ObeliskBlockEntity> OBELISK_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(VowMod.MOD_ID, "obelisk_entity"),
                    FabricBlockEntityTypeBuilder.create(ObeliskBlockEntity::new, ModBlocks.OBELISK_BLOCK).build());

    public static void registerBlockEntities() {
        VowMod.LOGGER.info("Register Block Entities for " + VowMod.MOD_ID);
    }
}
