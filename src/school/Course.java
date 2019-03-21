package school;

import java.util.HashMap;

public class Course {

    private String courseName;
    private int courseCredits;
    private double courseGrade;

    public Course(String courseName, int courseCredits, double courseGrade) {
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.courseGrade = courseGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public double getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(double courseGrade) {
        this.courseGrade = courseGrade;
    }

    //    HashMap of courseName and courseCredits, ex: HIST101, 3
    HashMap<String, Integer> courses = new HashMap<>();

}
