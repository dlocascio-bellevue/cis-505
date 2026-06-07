/**
 * LocascioGradeBookApp.java
 * 
 * Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
 * 
 * References:
 * W3Schools. (n.d.). CSV viewer. W3Schools. https://www.w3schools.com/tools/tool_csv_viewer.php
 * OpenJFX. (n.d.). TableView. OpenJFX JavaFX 22 API documentation. https://openjfx.io/javadoc/22/javafx.controls/javafx/scene/control/TableView.html
 * 
 * This JavaFX application serves as a grade book form where users can input student information, select a grade, and perform actions such as saving the data or viewing the grade book. 
 * The form includes fields for first name, last name, course name, and a combo box for selecting a grade. 
 * It also features buttons for clearing the form, saving the data, and viewing the grade book.
 * 
 * Java Version: 17.0.19
 * JavaFX Version: 17.0.19
 */

package GradeBookApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

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

    private TextArea resultsArea = new TextArea();

    // Constant for the CSV file path where grade data will be saved.
    private final String CSV_FILE_NAME = "grades.csv";
    // Constant for the CSV header that will be written to the CSV file if it does not already exist.
    private final String CSV_HEADER = "firstName,lastName,course,grade\n";
    // Array of grade options that will be added to the ComboBox for grade selection.
    private final String[] GRADE_OPTIONS = {"A", "B", "C", "D", "F"};

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
        comboBoxGrade.getItems().addAll(GRADE_OPTIONS);
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

        // Setting the action event handlers for the buttons to call the corresponding methods when clicked.
        btnClear.setOnAction(e -> clearFormFields());
        btnSave.setOnAction(e -> saveFormFields(txtFirstName, txtLastName, txtCourseName, comboBoxGrade));
        btnViewGradeBook.setOnAction(e -> viewGrades());

        // Creating a scene with the grid pane as its root node and setting it on the primary stage, then showing the stage.
        Scene scene = new Scene(gridPane);

        // Setting the title of the primary stage to "Grade Book Form", setting the scene, and displaying the stage.
        primaryStage.setTitle("Grade Book Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Method to clear the form fields when the "Clear" button is clicked.
     */
    private void clearFormFields() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtCourseName.setText("");
        comboBoxGrade.getSelectionModel().clearSelection();
    }

    /**
     * Method to save the form fields to a CSV file when the "Save" button is clicked. 
     * It checks if the CSV file exists, creates it with a header if it doesn't, and appends the form data to the file.
     * @param txtFirstName
     * @param txtLastName
     * @param txtCourseName
     * @param comboBoxGrade
     */
    private void saveFormFields(TextField txtFirstName, TextField txtLastName, TextField txtCourseName, ComboBox<String> comboBoxGrade) {
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String courseName = txtCourseName.getText();
        String grade = comboBoxGrade.getValue();

        File csvFile = new File(CSV_FILE_NAME); // Create a File object for the CSV file to check if it exists.
        boolean fileExists = csvFile.exists(); // Check if the CSV file exists and store the result in a boolean variable.
        // If the CSV file does not exist, create it and write the header to it.
        if (!fileExists) {
            try (FileOutputStream output = new FileOutputStream(CSV_FILE_NAME)) {
                output.write(CSV_HEADER.getBytes());
            } catch (IOException e) {
                System.out.println("Error occurred while creating CSV file.");
                e.printStackTrace();
            }
        }

        // Create a Student object with the form data to represent the student's information.
        Student student = new Student(firstName, lastName, courseName, grade);
        // Append the student's information to the CSV file by writing a CSV-formatted string representation of the student object to the file.
        try (FileOutputStream output = new FileOutputStream(CSV_FILE_NAME, true)) {
            output.write((student.toString() + "\n").getBytes());
        } catch (IOException e) {
            System.out.println("Error occurred while saving form fields.");
            e.printStackTrace();
        }
    }

    /**
     * Method to view the grades in a new window.
     * It creates a TableView to display the student data, reads the data from the CSV file, and populates the table with the student information.
     */
    private void viewGrades() {
        // Create a TableView to display the student data.
        TableView<Student> table = new TableView<>();
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        // Create columns for the TableView and set their cell value factories to map to the Student class properties.
        // Set the cell value factory for the first name column to map to the "firstName" property of the Student class.
        TableColumn<Student, String> firstNameColumn = new TableColumn<>("First Name");
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        // Set the cell value factory for the last name column to map to the "lastName" property of the Student class.
        TableColumn<Student, String> lastNameColumn = new TableColumn<>("Last Name");
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        // Set the cell value factory for the course column to map to the "course" property of the Student class.
        TableColumn<Student, String> courseColumn = new TableColumn<>("Course");
        courseColumn.setCellValueFactory(new PropertyValueFactory<>("course"));
        // Set the cell value factory for the grade column to map to the "grade" property of the Student class.
        TableColumn<Student, String> gradeColumn = new TableColumn<>("Grade");
        gradeColumn.setCellValueFactory(new PropertyValueFactory<>("grade"));

        // Add the columns to the TableView.
        table.getColumns().addAll(firstNameColumn, lastNameColumn, courseColumn, gradeColumn);

        // Read the student data from the CSV file and populate the TableView with the student information.
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_NAME))) {
            // Variable to hold each line read from the CSV file.
            String line;
            // Read the first line of the CSV file (the header) and ignore it, then read each subsequent line until the end of the file.
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                Student student = new Student(values[0], values[1], values[2], values[3]);
                table.getItems().add(student);
            }   
        } catch (IOException e) {
            e.printStackTrace();
    }

        // Create a new stage to display the TableView, set up a VBox layout to hold the table, create a scene with the layout, and show the stage.
        Stage stage = new Stage();
        VBox vBox = new VBox(table);
        Scene scene = new Scene(vBox);

        // Set the title of the stage to "Student Grades", set the scene, and display the stage.
        stage.setTitle("Student Grades");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main method launches the JavaFX application.
     * @param args 
     */
    public static void main(String[] args) {
        launch(args);
    }
}