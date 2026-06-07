/**
 * Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
 * 
 * The Student class represents a student in the grade book. 
 * It contains fields for the student's first name, last name, course, and grade. 
 * The class provides constructors for creating student objects, as well as getters and setters for accessing and modifying the student's information. 
 * The toString method is overridden to return a CSV-formatted string representation of the student object.    
 */

package GradeBookApp;

public class Student {
    private String firstName;
    private String lastName;
    private String course;
    private String grade;

    /**
     * Default constructor for the Student class. Initializes the student object with default values.
     */
    public Student() {
    }

    /**
     * Constructor for the Student class. Initializes the student object with the specified values.
     * @param firstName
     * @param lastName
     * @param course
     * @param grade
     */
    public Student(String firstName, String lastName, String course, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.grade = grade;
    }
    
    // Getters for the Student class.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }

    // Setters for the Student class.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Override the toString method to return a CSV-formatted string representation of the student object.
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", firstName, lastName, course, grade);
    }
}
