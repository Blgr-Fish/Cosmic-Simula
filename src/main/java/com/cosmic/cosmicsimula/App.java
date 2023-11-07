package com.cosmic.cosmicsimula;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

    private Group root;
    private Scene Scene;
    private Stage Stage;

    @Override
    public void start(Stage stage)
    {
        root = new Group();
        Stage=new Stage();
        Scene = new Scene(root,Global.widgetWidth,Global.widgetHeight);
        Stage.setScene(Scene);
        Stage.setMaximized(true);
        Stage.setResizable(true);
        Stage.show();

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
