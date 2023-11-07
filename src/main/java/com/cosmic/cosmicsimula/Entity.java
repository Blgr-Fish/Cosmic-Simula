package com.cosmic.cosmicsimula;

import javafx.scene.image.Image;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;


public class Entity {

    private String name;
    private double posX;
    private double posZ;
    private double posY;
    private double diameter;
    private double mass;
    private double radius;
    private double rotationSpeed;
    private double velocity;
    private double temperature;
    private double circumference;
    private double surfaceArea;
    private double volume;
    private String imageName; // file name of the entity image
    private Image entityImage; // Image object representing the entity
    private PhongMaterial entityPhongMaterial;  // ImageView object for displaying the entity
    private Sphere entity;


    public Entity(float posX,float posY, float posZ, float radius, String imagePath)
    {

        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
        this.radius = radius;
        this.diameter = 2 * radius;
        this.imageName = imagePath;

        this.surfaceArea = 4 * Math.PI * radius * radius; // 4 * pi * r²
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // 4/3 * pi * r^3
        this.circumference = 2 * Math.PI * radius; // 2 * pi * r

        this.entityImage = new Image(imagePath);
        entityPhongMaterial = new PhongMaterial();
        entityPhongMaterial.setDiffuseMap(entityImage);

        this.entity = new Sphere(radius);
        this.entity.setTranslateX(posX);
        this.entity.setTranslateY(posY);
        this.entity.setTranslateZ(posZ);


        entity.setMaterial(entityPhongMaterial);

    }

    public Entity(String imagePath)
    {
        this(0,0,0,100,imagePath);
    }



    public String getName() {
        return name;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosZ() {
        return posZ;
    }

    public double getPosY() {
        return posY;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getRotationSpeed() {
        return rotationSpeed;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public String getImageName() {
        return imageName;
    }

    public Image getEntityImage() {
        return entityImage;
    }

    public PhongMaterial getEntityPhongMaterial() {
        return entityPhongMaterial;
    }

    public Sphere getEntity() {
        return entity;
    }

}
