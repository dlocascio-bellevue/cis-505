# GradeBookApp

---

## Software Versions Used

- **Java:** 17.0.19  
- **JavaFX:** 17.0.19  

---

## Project Structure

```
GradeBookApp/
│
├── src/
│   └── GradeBookApp/
│       └── LocascioGradeBookApp.java
│
├── bin/                                <-- Compiled .class files will be placed here
│   └── GradeBookApp/
│       └── LocascioGradeBookApp.class
│
└── .vscode/
    ├── settings.json
    └── launch.json

```

---

## How to Run the Application

### 1. Install Prerequisites

Before running the application, ensure the following are installed:

- **Java 17 (JDK 17)**
- **JavaFX SDK 17.0.19**

Extract JavaFX to:
 `C:\Program Files\Java\javafx-sdk-17.0.19\`

---

## 2. Compile the Application (Command Line)

From the project root (`GradeBookApp/`), compile the source files into the `bin/` directory:
`javac -d bin --module-path "C:/Program Files/Java/javafx-sdk-17.0.19/lib" --add-modules javafx.controls,javafx.fxml src/GradeBookApp/*.java`

This will generate:
- bin/
- GradeBookApp/
- LocascioGradeBookApp.class

---

## 3. Run the Application (Command Line)

After compiling, run the JavaFX application using:
`java --module-path "C:/Program Files/Java/javafx-sdk-17.0.19/lib" --add-modules javafx.controls,javafx.fxml -cp bin GradeBookApp.LocascioGradeBookApp`

---

## 4. Running the Application in VS Code

1. Open the project folder in VS Code  
2. Open `LocascioGradeBookApp.java`  
3. Click the **Run** button (green triangle)

### VS Code Configuration Requirements

#### `.vscode/settings.json`
Ensure VS Code points to the JavaFX library:
`C:/Program Files/Java/javafx-sdk-17.0.19/lib/*.jar`

#### `.vscode/launch.json`
Ensure JavaFX modules are added at runtime:
`--module-path "C:/Program Files/Java/javafx-sdk-17.0.19/lib" --add-modules javafx.controls,javafx.fxml`

---

## 5. Creating the JAR File (For Submission)

After compiling, create the JAR file using:
`jar --create --file LocascioGradeBookApp.jar --main-class GradeBookApp.LocascioGradeBookApp -C bin/ .`

### Run the JAR
`java --module-path "C:/Program Files/Java/javafx-sdk-17.0.19/lib" --add-modules javafx.controls,javafx.fxml -jar GradeBookApp.jar`

---

## Notes

- The JAR file does **not** include JavaFX libraries.  
- JavaFX must be installed on the system running the JAR.  
- The application must be launched with the JavaFX module path (as shown above).

---