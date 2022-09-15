package com.legumage.mctherpg.villager;

import com.google.common.collect.ImmutableSet;
import com.legumage.mctherpg.Mctherpg;
import com.legumage.mctherpg.block.ModBlocks;
import com.legumage.mctherpg.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final PointOfInterestType TEST_POI = registerPOI("test_poi", ModBlocks.AERIALITE_BLOCK);
    public static final VillagerProfession TEST_PROF = registerProfession("test_prof",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Mctherpg.MOD_ID, "test_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Mctherpg.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(Mctherpg.MOD_ID, name))
                        .workstation(type).workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block){
        return PointOfInterestHelper.register(new Identifier(Mctherpg.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
        Mctherpg.LOGGER.debug("Registering Villagers for " + Mctherpg.MOD_ID);
    }

    public static void registerTrades(){
        TradeOfferHelper.registerVillagerOffers(TEST_PROF, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.AERIALITE_INGOT, 1),
                            6, 20, 0.1f
                    )));
                });
    }
}
