package net.al0046.labrelarver.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ONION = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 200), 0.25f).build();
    public static final FoodProperties RAW_LABRE_LARVER = new FoodProperties.Builder().nutrition(3).saturationModifier(0.40f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 200), 0.25f)
            .effect(new MobEffectInstance(MobEffects.POISON, 500), 1f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 500), 1f)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 100), 1f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100), 1f)
            .build();
    public static final FoodProperties LABRE_LARVER = new FoodProperties.Builder().nutrition(4).saturationModifier(0.35f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 200), 0.25f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 200), 0.75f)
            .build();
    public static final FoodProperties GOLDEN_LABRE_LARVER = new FoodProperties.Builder().nutrition(5).saturationModifier(0.5f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 200), 0.25f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 1000), 1f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2000), 1f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2000), 1f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 150), 1f)
            .effect(new MobEffectInstance(MobEffects.LUCK, 2000), 1f)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 100), 1f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 200), 1f)
            .alwaysEdible().build();
    public static final FoodProperties ENCHANTED_GOLDEN_LABRE_LARVER = new FoodProperties.Builder().nutrition(5).saturationModifier(0.5f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 200), 0.25f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 2000), 1f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 3000), 1f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3000), 1f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 300), 1f)
            .effect(new MobEffectInstance(MobEffects.LUCK, 3000), 1f)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400), 1f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 600), 1f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 400), 1f)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600), 1f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600), 1f)
            .alwaysEdible().build();

    public static final FoodProperties DIAMOND_LABRE_LARVER = new FoodProperties.Builder().nutrition(10).saturationModifier(0.75f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 225), 0.35f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 2000), 1f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 4000), 1f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4000), 1f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 300), 1f)
            .effect(new MobEffectInstance(MobEffects.LUCK, 4000), 1f)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 200), 1f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 400), 1f)
            .alwaysEdible().build();

    public static final FoodProperties CHEESY_LABRE_LARVER = new FoodProperties.Builder().nutrition(10).saturationModifier(0.75f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 200), 0.25f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 2000), 1f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 1000), 1f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 500), 1f)
            .effect(new MobEffectInstance(MobEffects.JUMP, 500), 1f)
            .build();

    public static final FoodProperties COLA = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 200), 0.25f)
            .effect(new MobEffectInstance(MobEffects.LEVITATION, 200), 0.1f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 200), 0.25f)
            .build();
    public static final FoodProperties CHEESEITEM = new FoodProperties.Builder().nutrition(4).saturationModifier(0.6f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 200), 0.25f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 200), 1f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100), 0.25f)
            .build();

}
