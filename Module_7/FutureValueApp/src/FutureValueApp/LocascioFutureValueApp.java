/**
 * LocascioFutureValueApp.java
 * 
 * Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
 * 
 * This JavaFX application demonstrates the use of various JavaFX components to create a user interface for calculating future value based on monthly payment, interest rate, and years. 
 * The application includes text fields for user input, a combo box for selecting years, buttons for clearing and calculating, and a text area for displaying results. 
 * The layout is organized using a GridPane, and the application is designed to be user-friendly with clear labels and instructions.
 * 
 * Java Version: 17.0.19
 * JavaFX Version: 17.0.19
 * 
*/

package FutureValueApp;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class LocascioFutureValueApp extends Application {

    // Declaring private TextField variables for monthly payment and interest rate, and initializing them.
    private TextField txtFieldMonthlyPayment = new TextField();
    private TextField txtFieldInterestRate = new TextField();

    // Declaring a private TextArea variable for displaying results, and initializing it.
    private TextArea txtArea = new TextArea();

    // Declaring private Label variables for monthly payment, interest rate, interest rate format instructions, and years, and initializing them.
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");

    // Declaring a private ComboBox variable for selecting years, and initializing it.
    private ComboBox<Integer> comboBoxYear = new ComboBox<>();

    // Declaring private Button variables for clear and calculate actions, and initializing them.
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");

    // Overriding the start method to set up the JavaFX application.
    @Override
    public void start(Stage primaryStage) {

        // Creating a Grid Pane.
        GridPane gridPane = new GridPane();

        // Setting size for the pane.
        gridPane.setAlignment(Pos.CENTER);

        // Setting the padding and gaps between the components in the grid pane.
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

        // Setting the horizontal and vertical gaps between the components in the grid pane.
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        // Adding the labels and text fields to the grid pane.
        gridPane.add(lblMonthlyPayment, 0, 0);
        gridPane.add(txtFieldMonthlyPayment, 1, 0);

        // Adding the interest rate label and text field to the grid pane.
        gridPane.add(lblInterestRate, 0, 1);
        gridPane.add(txtFieldInterestRate, 1, 1);

        lblInterestRateFormat.setTextFill(Color.RED); // Set the font color of the interest rate instructions to red.
        gridPane.add(lblInterestRateFormat, 1, 2); // Add the label to the grid pane.
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT); // Position the label to the right of the pane.

        // Adding the years label to the grid pane.
        gridPane.add(lblYears, 0, 3);

        // Adding the combo box to the grid pane.
        gridPane.add(comboBoxYear, 1, 3);
        // Set the ComboBox to expand horizontally to fill the available space in its cell.
        comboBoxYear.setMaxWidth(Double.MAX_VALUE);

        // Populate ComboBox with relevant years (2026 to 1990)
        for (int i = 2026; i >= 1990; i--) {
            comboBoxYear.getItems().add(i);
        }

        HBox actionBtnContainer = new HBox(); // Create a new HBox container.        
        GridPane.setHalignment(actionBtnContainer, HPos.RIGHT);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 0)); // Set the containers padding. 
        actionBtnContainer.setSpacing(10); // Set the containers spacing. 
        actionBtnContainer.getChildren().add(btnClear); // Add the btnClear to the container.
        actionBtnContainer.getChildren().add(btnCalculate); // Add the btnCalculate to the container.
        gridPane.add(actionBtnContainer, 1, 4); // Add the container to the GridPanel.

        // Place TextArea directly below buttons
        gridPane.add(txtArea, 0, 5, 2, 1);

        // Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage.
        primaryStage.setTitle("Locascio Future Value App");

        // Adding scene to the stage.
        primaryStage.setScene(scene);

        // Displaying the contents of the stage.
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