package com.cosmic.cosmicsimula;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage)
    {
        Group root = new Group();
        javafx.stage.Stage stage1 = new Stage();
        javafx.scene.Scene scene = new Scene(root, Global.widgetWidth, Global.widgetHeight);
        stage1.setScene(scene);
        stage1.setMaximized(true);
        stage1.setResizable(true);
        stage1.show();

        scene.setFill(Color.BLACK);

        _Camera camera = new _Camera();
        Star sun = new Star("Sun","sun-texture.jpg") ;
        sun.setRotationSpeed(0.5);


        scene.setCamera(camera.getCamera());
        root.getChildren().add(sun.getEntity());

        camera.setCameraPos(-500,-300,200);


        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {

                sun.evolve();
            }
        };
        gameLoop.start();


    }

    /**
     * The main method is the entry point of the application.
     * It launches the JavaFX application.
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        launch();
    }
}
