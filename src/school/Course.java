package school;

import java.util.HashMap;

public class Course {

    private String courseName, letterGrade;
    private int courseCredits, gradePoints;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public int getGradePoints() {
        return gradePoints;
    }

    public void setGradePoints(int gradePoints) {
        this.gradePoints = gradePoints;
    }

    HashMap<String, Integer> grades = new HashMap<>();


}
