package com.cosmic.cosmicsimula;

import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;

public class Star extends Entity{

    private Rotate rotationTransform;
    public Star(String name,float posX, float posY, float posZ, float radius, String imagePath) {

        super(name,posX, posY, posZ, radius, imagePath);
        rotationTransform = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS);
        rotationTransform.setPivotZ(0);
        rotationTransform.setPivotY(0);
        this.getEntity().getTransforms().add(rotationTransform);

    }
    public Star(String name,String imagePath) {
        super(name,imagePath);
        rotationTransform = new Rotate(0, 0, 0, 0);
        this.getEntity().getTransforms().add(rotationTransform);

    }



    @Override
    public void evolve()
    {
        double rotationSpeed = this.getRotationSpeed();
        double currentRotation = this.getEntity().getRotate();



        rotationTransform.setAngle(currentRotation);

        currentRotation += rotationSpeed;
        currentRotation %= 360;

        this.getEntity().setRotate(currentRotation);
        System.out.println(currentRotation);
    }
}
