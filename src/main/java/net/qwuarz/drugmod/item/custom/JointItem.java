package net.qwuarz.drugmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.ParticleTypes;

public class JointItem extends Item {

    public JointItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            CompoundTag tag = stack.getTag();
            if (tag != null && tag.contains("strain")) {
                String strain = tag.getString("strain");
                System.out.println("Strain: " + strain); // Debug statement
                applyStrainEffects(player, strain);
            } else {
                System.out.println("No strain found in NBT data"); // Debug statement
            }

            // Play smoke particles (implementation depends on your mod setup)
            if (world.isClientSide) {
                for (int i = 0; i < 50; i++) { // Increase the number of particles
                    double offsetX = player.getLookAngle().x * 0.5 + (world.random.nextDouble() - 0.5) * 0.2;
                    double offsetY = player.getEyeY() - 0.1 + (world.random.nextDouble() - 0.5) * 0.2;
                    double offsetZ = player.getLookAngle().z * 0.5 + (world.random.nextDouble() - 0.5) * 0.2;
                    double velocityX = (world.random.nextDouble() - 0.5) * 0.02; // Small horizontal velocity
                    double velocityY = 0.2; // Consistent upward velocity
                    double velocityZ = (world.random.nextDouble() - 0.5) * 0.02; // Small horizontal velocity
                    world.addParticle(ParticleTypes.CLOUD,
                            player.getX() + offsetX,
                            offsetY,
                            player.getZ() + offsetZ,
                            velocityX, velocityY, velocityZ);
                }
            }



        }

        return super.finishUsingItem(stack, world, entity);
    }

    private void applyStrainEffects(Player player, String strain) {
        switch (strain) {
            case "OG_Kush":
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900, 0));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 900, 0));
                break;
            case "Skunk":
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, 900, 1));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 900, 1));
                player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 900, 0));
                break;
            case "Afghani":
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1000, 1));
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000, 0));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1000, 1));
                break;
            case "Acapulco_Gold":
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1400, 1));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1400, 0));
                player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 1400, 0));
                break;
            case "Colombian_Gold":
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1));
                player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1200, 0));
                break;
            case "Gelato":
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900, 1));
                player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 900, 0));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 900, 0));
                break;
            case "Thin_Mint_Cookies":
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0));
                player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1200, 0));
                player.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1200, 0));
                break;
            case "Sunset_Sherbert":
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1400, 0));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1400, 0));
                player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 1400, 0));
                break;
            case "Animal_Mints":
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, 900, 1));
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 0));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 900, 0));
                break;
            case "Triangle_Kush":
                player.addEffect(new MobEffectInstance(MobEffects.LUCK, 1200, 0));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1200, 0));
                break;
            case "Wedding_Cake":
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 800, 0));
                player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 800, 1));
                player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 800, 0));
                break;
            case "Mars_OG":
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 0));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1000, 0));
                player.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1000, 0));
                break;
            case "Sour_Diesel":
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0));
                player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 1200, 0));
                break;
        }
    }


    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.NONE;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 32;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(player.getItemInHand(hand));
    }
}