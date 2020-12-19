package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        // Create the FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "src/sample/sample.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

        // Create the Pane and all Details
        Pane root = loader.load(fxmlStream);

        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Scene to the Stage
        stage.setScene(scene);
        // Set the Title to the Stage
        stage.setTitle("EVERGLADES Temperature Unit Converter");
        // Display the Stage
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
