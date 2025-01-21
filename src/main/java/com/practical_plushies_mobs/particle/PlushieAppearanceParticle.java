package com.practical_plushies_mobs.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.Model;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
@Environment(EnvType.CLIENT)
public class PlushieAppearanceParticle extends Particle {
    private final Model model;
    private final RenderLayer layer;

    PlushieAppearanceParticle(ClientWorld clientWorld, double d, double e, double f, EntityModel<LivingEntity> model, Identifier identifier) {
        super(clientWorld, d, e, f);
        this.layer = RenderLayer.getEntityTranslucent(identifier);
        this.model = model;
        this.gravityStrength = 0.0f;
        this.maxAge = 30;
    }

    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.CUSTOM;
    }

    public void buildGeometry(VertexConsumer vertexConsumer, Camera camera, float tickDelta) {
        float f = (this.age + tickDelta) / this.maxAge;
        float g = 0.05f + (0.5f * MathHelper.sin(f * 3.1415927f));
        MatrixStack matrixStack = new MatrixStack();
        matrixStack.multiply(camera.getRotation());
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees((150.0f * f) - 60.0f));
        matrixStack.scale(-1.0f, -1.0f, 1.0f);
        matrixStack.translate(0.0f, -1.101f, 1.5f);
        VertexConsumerProvider.Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
        VertexConsumer vertexConsumer2 = immediate.getBuffer(this.layer);
        this.model.render(matrixStack, vertexConsumer2, 15728880, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, g);
        immediate.draw();
    }
}