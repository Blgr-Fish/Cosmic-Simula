package com.cosmic.cosmicsimula;

import javafx.scene.Camera;
import javafx.scene.PerspectiveCamera;

public class _Camera {

    private Camera camera ;
    private float cameraPosX;
    private float cameraPosY;
    private float cameraPosZ;
    public _Camera()
    {
        this.camera = new PerspectiveCamera();
        this.cameraPosX = 0;
        this.cameraPosY = 0;
        this.cameraPosZ = 0;

    }


    public void setCameraPos(float posX,float posY,float posZ) {

        this.cameraPosX = posX;
        this.cameraPosY = posY;
        this.cameraPosZ = posZ;

        this.camera.setTranslateX(cameraPosX);
        this.camera.setTranslateY(cameraPosY);
        this.camera.setTranslateZ(cameraPosZ);
    }

    public Camera getCamera() {return this.camera;}



    public void setCameraPosTowardEntity(Entity entity){}
}
