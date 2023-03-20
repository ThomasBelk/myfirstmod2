package net.youseless.myfirstmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.youseless.myfirstmod.MyFirstMod;

@Mod.EventBusSubscriber(modid = MyFirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModTabs {
    public static CreativeModeTab MY_FIRST_TAB;

    @SubscribeEvent
    public static void registerCreativeModTabs(CreativeModeTabEvent.Register event) {
        MY_FIRST_TAB = event.registerCreativeModeTab(new ResourceLocation(MyFirstMod.MOD_ID,
                "my_first_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItem.BLACK_OPAL.get()))
                        .title(Component.translatable("creativemodetab.my_first_tab")));
    }
}
