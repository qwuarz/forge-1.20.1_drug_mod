package net.qwuarz.drugmod.item;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.phys.Vec3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class PenjaminItem extends Item {
    private static final Logger LOGGER = LoggerFactory.getLogger(PenjaminItem.class);
    private static final Random RANDOM = new Random();

    public PenjaminItem(Properties properties) {
        super(properties.durability(60)); // Set max durability
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        LOGGER.info("finishUsingItem called");
        if (entity instanceof Player) {
            Player player = (Player) entity;
            if (!level.isClientSide) {
                LOGGER.info("Applying effects to player");
                if (RANDOM.nextInt(4) == 0) { // 25% chance to apply confusion effect
                    player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 180, 0));
                }
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1));
            }

            if (level.isClientSide) {
                Vec3 look = player.getLookAngle();
                for (int i = 0; i < 20; i++) {
                    level.addParticle(ParticleTypes.CLOUD, player.getX() + look.x * i / 5.0, player.getY() + 1.5 + look.y * i / 5.0, player.getZ() + look.z * i / 5.0, 0.0, 0.0, 0.0);
                }
            }
        }

        stack.hurtAndBreak(1, entity, (e) -> e.broadcastBreakEvent(entity.getUsedItemHand())); // Reduce durability
        return super.finishUsingItem(stack, level, entity);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        LOGGER.info("getUseAnimation called");
        return UseAnim.NONE; // Use NONE to prevent any sound
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        LOGGER.info("getUseDuration called");
        return 32; // Set the duration for using the item
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        LOGGER.info("use called");
        player.startUsingItem(hand);
        // No sound is played here
        return InteractionResultHolder.consume(player.getItemInHand(hand));
    }

    @Override
    public void onUseTick(Level level, LivingEntity entity, ItemStack stack, int count) {
        // Override to prevent default sound
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}