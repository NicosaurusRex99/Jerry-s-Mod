package naturix.jerrysmod.registries;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

/**
 * @author p455w0rd
 *
 */
public class ModSounds {

	private static final List<SoundEvent> PHONE = new LinkedList<>();

	public static List<SoundEvent> getList() {
		if (PHONE.isEmpty()) {
			registerSound("phone");

		}
		return PHONE;
	}

	public static SoundEvent registerSound(String soundNameIn) {
		SoundEvent sound = new SoundEvent(new ResourceLocation(JerrysMod.MODID, soundNameIn)).setRegistryName(new ResourceLocation(JerrysMod.MODID, soundNameIn));
		if (!PHONE.contains(sound)) {
			PHONE.add(sound);
		}
		return sound;
	}
	public static SoundEvent getRandomPhone(Random rand) {
		return ModSounds.getList().get(1);
	}
}