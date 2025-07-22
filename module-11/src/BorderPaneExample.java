/*
 * Name: Crystal Long
 * Date: July 20, 2025
 * Class: CSD 402
 * Assignment: Module 11 – JavaFX BorderPane Example
 *
 * Purpose: This program demonstrates how to use the BorderPane layout in JavaFX to position content in five regions.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create BorderPane and add labels
        BorderPane layout = new BorderPane();
        layout.setTop(new Label("Top Area"));
        layout.setBottom(new Label("Bottom Area"));
        layout.setLeft(new Label("Left Area"));
        layout.setRight(new Label("Right Area"));
        layout.setCenter(new Label("Center Area"));

        // Scene setup
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
