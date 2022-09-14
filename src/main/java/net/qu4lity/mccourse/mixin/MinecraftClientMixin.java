package net.qu4lity.mccourse.mixin;

import net.minecraft.client.MinecraftClient;
import net.qu4lity.mccourse.MCCourseMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {

    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    public void onTick(CallbackInfo ci){
        MCCourseMod.INSTANCE.onTick();
    }
}
