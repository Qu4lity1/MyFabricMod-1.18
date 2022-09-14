package net.qu4lity.mccourse;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.ActionResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {

	public static final MCCourseMod INSTANCE = new MCCourseMod();
	public static final String MOD_ID = "mccourse";
//	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Logger logger = LogManager.getLogger(MCCourseMod.class);
	public static final MinecraftClient MC = MinecraftClient.getInstance();

	@Override
	public void onInitialize() {
		logger.info("Hello world");
	}

	public void onKeyPress(int key, int action) {
		if (action == GLFW.GLFW_PRESS) logger.info("Key " + key + " was pressed");
	}

	public void onTick() {
		logger.info("Ticking");
	}
}
