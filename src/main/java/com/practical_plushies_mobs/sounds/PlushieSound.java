package com.practical_plushies_mobs.sounds;

import com.practical_plushies_mobs.PracticalPlushiesMobs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class PlushieSound {
    public static final SoundEvent PLUSHIE_SOUND = registerSound("plushie_sound");

    public static SoundEvent registerSound(String name) {
        Identifier identifier = new Identifier(PracticalPlushiesMobs.MODID, name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
    public static void registerSound() {

    }
}
