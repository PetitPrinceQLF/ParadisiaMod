package fr._PetitPrince_.paradisia.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import fr._PetitPrince_.paradisia.Paradisia;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class ModelCap<T extends Entity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Paradisia.MODID, "cap"), "main");
	public final ModelPart Head;
	public final ModelPart bb_main;

	public ModelCap(ModelPart root) {
		this.Head = root.getChild("Head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.0F, -7.0F, 8.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0F, -4.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -4.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0F, -4.0F, 4.0F, 10.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}