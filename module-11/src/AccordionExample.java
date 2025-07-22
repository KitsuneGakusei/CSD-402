/*
 * Name: Crystal Long
 * Date: July 20, 2025
 * Class: CSD 402
 * Assignment: Module 11 – JavaFX Accordion Example
 *
 * Purpose: This program demonstrates how to use the Accordion control in JavaFX to display collapsible titled sections.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccordionExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create titled panes
        TitledPane sectionOne = new TitledPane("Section 1", new Label("Content of Section 1"));
        TitledPane sectionTwo = new TitledPane("Section 2", new Label("Content of Section 2"));
        TitledPane sectionThree = new TitledPane("Section 3", new Label("Content of Section 3"));

        // Create accordion and add panes
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(sectionOne, sectionTwo, sectionThree);
        accordion.setExpandedPane(sectionOne);

        // Scene setup
        VBox layout = new VBox(accordion);
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Accordion Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
