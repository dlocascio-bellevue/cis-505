/**
 * LocascioGradeBookApp.java
 * 
 * Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
 * 
 * This JavaFX application serves as a grade book form where users can input student information, select a grade, and perform actions such as saving the data or viewing the grade book. 
 * The form includes fields for first name, last name, course name, and a combo box for selecting a grade. 
 * It also features buttons for clearing the form, saving the data, and viewing the grade book.
 * 
 * Java Version: 17.0.19
 * JavaFX Version: 17.0.19
 */

package GradeBookApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class LocascioGradeBookApp extends Application {

    // Labels for input fields
    private Label lblFirstName = new Label("First Name:");
    private Label lblLastName = new Label("Last Name:");
    private Label lblCourseName = new Label("Course Name:");
    private Label lblGrade = new Label("Grade:");

    // Text fields for user input
    private TextField txtFirstName = new TextField();
    private TextField txtLastName = new TextField();
    private TextField txtCourseName = new TextField();

    // ComboBox for grade selection
    private ComboBox<String> comboBoxGrade = new ComboBox<>();

    // Buttons for actions
    private Button btnClear = new Button("Clear");
    private Button btnViewGradeBook = new Button("View Grade Book");
    private Button btnSave = new Button("Save");

    // Overriding the start method to set up the JavaFX application.
    @Override
    public void start(Stage primaryStage) {
        
        
        // Creating a Grid Pane.
        GridPane gridPane = new GridPane();

        // Setting the alignment of the grid pane to center.
        gridPane.setAlignment(Pos.CENTER);

        // Setting the padding of the grid pane to 15 pixels on all sides.
        gridPane.setPadding(new Insets(15, 15, 15, 15));

        // Setting the horizontal and vertical gaps between the components in the grid pane to 10 pixels.
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Adding the labels, text fields, combo box, and buttons to the grid pane with specified column and row indices.
        gridPane.add(lblFirstName, 0, 0);
        gridPane.add(txtFirstName, 1, 0);

        gridPane.add(lblLastName, 3, 0);
        gridPane.add(txtLastName, 4, 0);

        gridPane.add(lblCourseName, 0, 1);
        gridPane.add(txtCourseName, 1, 1);

        gridPane.add(lblGrade, 3, 1);
        gridPane.add(comboBoxGrade, 4, 1);

        // Adding grade options to the combo box and setting its maximum width to fill the available space.
        comboBoxGrade.getItems().addAll("A", "B", "C", "D", "F"); 
        comboBoxGrade.setMaxWidth(Double.MAX_VALUE);

        // Creating an HBox for the "View Grade Book" button, setting its alignment and padding, and adding the button to it.
        HBox btnContainer = new HBox();
        btnContainer.setAlignment(Pos.CENTER_LEFT);
       btnContainer.setPadding(new Insets(10, 0, 10, 0));
        btnContainer.getChildren().add(btnViewGradeBook);
        gridPane.add(btnContainer, 1, 2);

        // Creating another HBox for the "Clear" and "Save" buttons, setting its spacing, alignment, and padding, and adding the buttons to it.
        HBox secondBtnContainer = new HBox();
        secondBtnContainer.setSpacing(10);
        secondBtnContainer.setAlignment(Pos.CENTER_RIGHT);
        secondBtnContainer.setPadding(new Insets(10, 0, 10, 0));
        btnClear.setPrefWidth(75);
        btnSave.setPrefWidth(75);
        secondBtnContainer.getChildren().add(btnClear); 
        secondBtnContainer.getChildren().add(btnSave); 
        gridPane.add(secondBtnContainer, 4, 2);

        // Creating a scene with the grid pane as its root node and setting it on the primary stage, then showing the stage.
        Scene scene = new Scene(gridPane);

        // Setting the title of the primary stage to "Grade Book Form", setting the scene, and displaying the stage.
        primaryStage.setTitle("Grade Book Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main method launches the JavaFX application.
     * @param args 
     */
    public static void main(String[] args) {
        launch(args);
    }
}