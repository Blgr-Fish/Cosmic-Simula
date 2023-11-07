package com.cosmic.cosmicsimula;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
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



        Entity sphere = new Entity(500,500,-500,200,"sun-texture.jpg") ;

        root.getChildren().add(sphere.getEntity());


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
