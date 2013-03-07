package micdoodle8.mods.galacticraft.core.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GCCoreModelAssemblyTable extends ModelBase
{
	ModelRenderer base1a;
	ModelRenderer baseAux1;
	ModelRenderer base1b;
	ModelRenderer base2a;
	ModelRenderer base2b;
	ModelRenderer baseAux3;
	ModelRenderer baseAux2;
	ModelRenderer clawL1;
	ModelRenderer clawL2;
	ModelRenderer clawR1;
	ModelRenderer clawR2;
	ModelRenderer clawRPR;
	ModelRenderer clawRPL;
	ModelRenderer armB1;
	ModelRenderer manipulatorRotationPointB;
	ModelRenderer baseRotationPointB;
	ModelRenderer armRotationPointB;
	ModelRenderer armB2;
	ModelRenderer armR1;
	ModelRenderer armR2;
	ModelRenderer baseRotationPointR;
	ModelRenderer armRotationPointR;
	ModelRenderer weldHead;
	ModelRenderer weldBit;
	ModelRenderer screenRotationPointF;
	ModelRenderer armF1;
	ModelRenderer baseRotationPointF;
	ModelRenderer Screen;
	ModelRenderer armRotationPointL;
	ModelRenderer armL2;
	ModelRenderer baseRotationPointL;
	ModelRenderer armL1;
	ModelRenderer sensorDish;
	ModelRenderer sensor;
	
	public GCCoreModelAssemblyTable()
	{
		this(0.0F);
	}
	
	public GCCoreModelAssemblyTable(float var1)
	{
		this.textureWidth = 256;
		this.textureHeight = 128;
		base1a = new ModelRenderer(this, 113, 24);
		base1a.addBox(-2.5F, -2F, -7.5F, 5, 2, 15);
		base1a.setRotationPoint(0F, 24F, 0F);
		base1a.setTextureSize(256, 128);
		base1a.mirror = true;
		setRotation(base1a, 0F, 1.570796F, 0F);
		baseAux1 = new ModelRenderer(this, 35, 40);
		baseAux1.addBox(-3.5F, 0F, -3.5F, 7, 1, 7);
		baseAux1.setRotationPoint(0F, 20F, 0F);
		baseAux1.setTextureSize(256, 128);
		baseAux1.mirror = true;
		setRotation(baseAux1, 0F, 0.7853982F, 0F);
		base1b = new ModelRenderer(this, 113, 24);
		base1b.addBox(-2.5F, -2F, -7.5F, 5, 2, 15);
		base1b.setRotationPoint(0F, 24F, 0F);
		base1b.setTextureSize(256, 128);
		base1b.mirror = true;
		setRotation(base1b, 0F, 0F, 0F);
		base2a = new ModelRenderer(this, 65, 0);
		base2a.addBox(-3.5F, -2F, -7F, 7, 5, 14);
		base2a.setRotationPoint(0F, 23F, 0F);
		base2a.setTextureSize(256, 128);
		base2a.mirror = true;
		setRotation(base2a, 0F, -0.7853982F, 0F);
		base2b = new ModelRenderer(this, 65, 0);
		base2b.addBox(-3.5F, -2F, -7F, 7, 3, 14);
		base2b.setRotationPoint(0F, 23F, 0F);
		base2b.setTextureSize(256, 128);
		base2b.mirror = true;
		setRotation(base2b, 0F, 0.7853982F, 0F);
		baseAux3 = new ModelRenderer(this, 50, 62);
		baseAux3.addBox(-8.5F, 0F, -0.5F, 17, 4, 1);
		baseAux3.setRotationPoint(0F, 20.5F, 0F);
		baseAux3.setTextureSize(256, 128);
		baseAux3.mirror = true;
		setRotation(baseAux3, 0F, -0.7853982F, 0F);
		baseAux2 = new ModelRenderer(this, 50, 62);
		baseAux2.addBox(-8.5F, 0F, -0.5F, 17, 4, 1);
		baseAux2.setRotationPoint(0F, 20.5F, 0F);
		baseAux2.setTextureSize(256, 128);
		baseAux2.mirror = true;
		setRotation(baseAux2, 0F, 0.7853982F, 0F);
		clawL1 = new ModelRenderer(this, 7, 57);
		clawL1.addBox(-0.5F, -1F, -3F, 1, 2, 3);
		clawL1.setRotationPoint(-1F, -0.2F, 4F);
		clawL1.setTextureSize(256, 128);
		clawL1.mirror = true;
		setRotation(clawL1, 0F, 1.003826F, 0F);
		clawL2 = new ModelRenderer(this, 7, 57);
		clawL2.addBox(-2.7F, -1F, -5F, 1, 2, 3);
		clawL2.setRotationPoint(-1F, -0.2F, 4F);
		clawL2.setTextureSize(256, 128);
		clawL2.mirror = true;
		setRotation(clawL2, 0F, 0.1698892F, 0F);
		clawR1 = new ModelRenderer(this, 7, 57);
		clawR1.addBox(-0.5F, -1F, -3F, 1, 2, 3);
		clawR1.setRotationPoint(1F, -0.2F, 4F);
		clawR1.setTextureSize(256, 128);
		clawR1.mirror = true;
		setRotation(clawR1, 0F, -1.041005F, 0F);
		clawR2 = new ModelRenderer(this, 7, 57);
		clawR2.addBox(1.7F, -1F, -5F, 1, 2, 3);
		clawR2.setRotationPoint(1F, -0.2F, 4F);
		clawR2.setTextureSize(256, 128);
		clawR2.mirror = true;
		setRotation(clawR2, 0F, -0.1896157F, 0F);
		clawRPR = new ModelRenderer(this, 0, 45);
		clawRPR.addBox(-2.2F, -1.5F, -3F, 1, 3, 1);
		clawRPR.setRotationPoint(1F, -0.2F, 4F);
		clawRPR.setTextureSize(256, 128);
		clawRPR.mirror = true;
		setRotation(clawRPR, 0F, -1.63514F, 0F);
		clawRPL = new ModelRenderer(this, 0, 45);
		clawRPL.addBox(-2.2F, -1.5F, -3F, 1, 3, 1);
		clawRPL.setRotationPoint(-1F, -0.2F, 4F);
		clawRPL.setTextureSize(256, 128);
		clawRPL.mirror = true;
		setRotation(clawRPL, 0F, 0.4096913F, 0F);
		armB1 = new ModelRenderer(this, 46, 0);
		armB1.addBox(-1F, -12F, -1F, 2, 12, 2);
		armB1.setRotationPoint(0F, 22F, 8F);
		armB1.setTextureSize(256, 128);
		armB1.mirror = true;
		setRotation(armB1, -0.3005282F, 0F, 0F);
		manipulatorRotationPointB = new ModelRenderer(this, 0, 69);
		manipulatorRotationPointB.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		manipulatorRotationPointB.setRotationPoint(0F, 0F, 4.5F);
		manipulatorRotationPointB.setTextureSize(256, 128);
		manipulatorRotationPointB.mirror = true;
		setRotation(manipulatorRotationPointB, 0F, 1.570796F, 0F);
		baseRotationPointB = new ModelRenderer(this, 0, 69);
		baseRotationPointB.addBox(-1.5F, -1.2F, -1.5F, 3, 3, 3);
		baseRotationPointB.setRotationPoint(0F, 22F, 7.5F);
		baseRotationPointB.setTextureSize(256, 128);
		baseRotationPointB.mirror = true;
		setRotation(baseRotationPointB, this.toRadians(0), this.toRadians(90), this.toRadians(15));
		armRotationPointB = new ModelRenderer(this, 0, 69);
		armRotationPointB.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		armRotationPointB.setRotationPoint(0F, 10F, 11.5F);
		armRotationPointB.setTextureSize(256, 128);
		armRotationPointB.mirror = true;
		setRotation(armRotationPointB, this.toRadians(90), this.toRadians(0), this.toRadians(-90));
		armB2 = new ModelRenderer(this, 46, 0);
		armB2.addBox(-1F, -12F, -1F, 2, 12, 2);
		armB2.setRotationPoint(0F, 9F, 11F);
		armB2.setTextureSize(256, 128);
		armB2.mirror = true;
		setRotation(armB2, 0.6289468F, 0F, 0F);
		armR1 = new ModelRenderer(this, 46, 0);
		armR1.addBox(-1F, -12F, -1F, 2, 12, 2);
		armR1.setRotationPoint(-8F, 22F, 0F);
		armR1.setTextureSize(256, 128);
		armR1.mirror = true;
		setRotation(armR1, 0.6351428F, 1.570796F, 0F);
		armR2 = new ModelRenderer(this, 55, 0);
		armR2.addBox(-1F, -8F, -1F, 2, 8, 2);
		armR2.setRotationPoint(-15F, 11F, 0F);
		armR2.setTextureSize(256, 128);
		armR2.mirror = true;
		setRotation(armR2, -0.9635439F, 1.570796F, 0F);
		baseRotationPointR = new ModelRenderer(this, 0, 69);
		baseRotationPointR.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		baseRotationPointR.setRotationPoint(-7.9F, 22F, 0F);
		baseRotationPointR.setTextureSize(256, 128);
		baseRotationPointR.mirror = true;
		setRotation(baseRotationPointR, 0F, 0F, 0.5235988F);
		armRotationPointR = new ModelRenderer(this, 0, 69);
		armRotationPointR.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		armRotationPointR.setRotationPoint(-15.76667F, 11.5F, 0F);
		armRotationPointR.setTextureSize(256, 128);
		armRotationPointR.mirror = true;
		setRotation(armRotationPointR, 0F, 0F, -0.1745329F);
		weldHead = new ModelRenderer(this, 17, 0);
		weldHead.addBox(-2F, -1.5F, -1.5F, 5, 3, 3);
		weldHead.setRotationPoint(-9F, 6F, 0F);
		weldHead.setTextureSize(256, 128);
		weldHead.mirror = true;
		setRotation(weldHead, 0F, 0F, 0.5948578F);
		weldBit = new ModelRenderer(this, 0, 0);
		weldBit.addBox(0F, -0.5F, -0.5F, 7, 1, 1);
		weldBit.setRotationPoint(-9F, 6F, 0F);
		weldBit.setTextureSize(256, 128);
		weldBit.mirror = true;
		setRotation(weldBit, 0F, 0F, 0.5948606F);
		screenRotationPointF = new ModelRenderer(this, 0, 77);
		screenRotationPointF.addBox(-1.5F, -1.5F, -1.5F, 3, 2, 3);
		screenRotationPointF.setRotationPoint(0F, 14F, -9F);
		screenRotationPointF.setTextureSize(256, 128);
		screenRotationPointF.mirror = true;
		setRotation(screenRotationPointF, this.toRadians(30), this.toRadians(0), this.toRadians(0));
		armF1 = new ModelRenderer(this, 55, 0);
		armF1.addBox(-1F, -8F, -1F, 2, 8, 2);
		armF1.setRotationPoint(0F, 21F, -7.5F);
		armF1.setTextureSize(256, 128);
		armF1.mirror = true;
		setRotation(armF1, 0.2602503F, 0F, 0F);
		baseRotationPointF = new ModelRenderer(this, 0, 69);
		baseRotationPointF.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		baseRotationPointF.setRotationPoint(0F, 21.6F, -6.8F);
		baseRotationPointF.setTextureSize(256, 128);
		baseRotationPointF.mirror = true;
		setRotation(baseRotationPointF, this.toRadians(30F), this.toRadians(0), this.toRadians(0));
		Screen = new ModelRenderer(this, 10, 45);
		Screen.addBox(-3.5F, -2.5F, -1F, 7, 5, 1);
		Screen.setRotationPoint(0F, 13F, -10F);
		Screen.setTextureSize(256, 128);
		Screen.mirror = true;
		setRotation(Screen, -1.047198F, 0F, 0F);
		armRotationPointL = new ModelRenderer(this, 0, 69);
		armRotationPointL.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		armRotationPointL.setRotationPoint(13.8F, 18.4F, 0F);
		armRotationPointL.setTextureSize(256, 128);
		armRotationPointL.mirror = true;
		setRotation(armRotationPointL, 0F, -3.141593F, 0.5235988F);
		armL2 = new ModelRenderer(this, 55, 0);
		armL2.addBox(-1F, -8F, -1F, 2, 8, 2);
		armL2.setRotationPoint(13.7F, 18F, 0F);
		armL2.setTextureSize(256, 128);
		armL2.mirror = true;
		setRotation(armL2, 0.6351428F, 1.570796F, 0F);
		baseRotationPointL = new ModelRenderer(this, 0, 69);
		baseRotationPointL.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		baseRotationPointL.setRotationPoint(7.5F, 22F, 0F);
		baseRotationPointL.setTextureSize(256, 128);
		baseRotationPointL.mirror = true;
		setRotation(baseRotationPointL, 0F, -3.141593F, 0.5235988F);
		armL1 = new ModelRenderer(this, 55, 0);
		armL1.addBox(-1F, -8F, -1F, 2, 8, 2);
		armL1.setRotationPoint(8F, 22F, 0F);
		armL1.setTextureSize(256, 128);
		armL1.mirror = true;
		setRotation(armL1, -1.037895F, 1.570796F, 0F);
		sensorDish = new ModelRenderer(this, 68, 41);
		sensorDish.addBox(-1F, -2F, -2F, 1, 4, 4);
		sensorDish.setRotationPoint(6F, 12F, 0F);
		sensorDish.setTextureSize(256, 128);
		sensorDish.mirror = true;
		setRotation(sensorDish, 0F, 0F, -0.3005282F);
		sensor = new ModelRenderer(this, 60, 54);
		sensor.addBox(-3F, -2F, -1F, 5, 2, 2);
		sensor.setRotationPoint(9F, 12F, 0F);
		sensor.setTextureSize(256, 128);
		sensor.mirror = true;
		setRotation(sensor, 0F, 0F, -0.3005353F);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	  
	public void renderAll()
	{
		base1a.render(0.0625F);
		baseAux1.render(0.0625F);
		base1b.render(0.0625F);
		base2a.render(0.0625F);
		base2b.render(0.0625F);
		baseAux3.render(0.0625F);
		baseAux2.render(0.0625F);
		clawL1.render(0.0625F);
		clawL2.render(0.0625F);
		clawR1.render(0.0625F);
		clawR2.render(0.0625F);
		clawRPR.render(0.0625F);
		clawRPL.render(0.0625F);
		armB1.render(0.0625F);
		manipulatorRotationPointB.render(0.0625F);
		baseRotationPointB.render(0.0625F);
		armRotationPointB.render(0.0625F);
		armB2.render(0.0625F);
		armR1.render(0.0625F);
		armR2.render(0.0625F);
		baseRotationPointR.render(0.0625F);
		armRotationPointR.render(0.0625F);
		weldHead.render(0.0625F);
		weldBit.render(0.0625F);
		screenRotationPointF.render(0.0625F);
		armF1.render(0.0625F);
		baseRotationPointF.render(0.0625F);
		Screen.render(0.0625F);
		armRotationPointL.render(0.0625F);
		armL2.render(0.0625F);
		baseRotationPointL.render(0.0625F);
		armL1.render(0.0625F);
		sensorDish.render(0.0625F);
		sensor.render(0.0625F);
	}
	
	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
	
	private float toRadians(float f)
	{
		return (float) (f * (Math.PI / 180.0F));
	}
}