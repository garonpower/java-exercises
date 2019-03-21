package school;

public class Student {
    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
    /*    Update the appropriate fields: numberOfCredits, gpa
        qualityScore = grade * courseCredits
        gpa = qualityScore / numberOfCredits */

        double aQualityScore = courseCredits * grade;
        double aGpa = aQualityScore / courseCredits;

//        Find current qualityScore to update GPA
        double qualityScore = gpa * numberOfCredits;

//        update quality Score and numberOfCredits, compute new GPA
        gpa = (aQualityScore + qualityScore) / (courseCredits + numberOfCredits);
    }

    public String getGradeLevel() {
//        Determine the grade level of the student based on numberOfCredits
        String gradeLevel;

        if (numberOfCredits < 30) {
            gradeLevel = "Freshman";
        } else if (numberOfCredits < 60) {
            gradeLevel = "Sophomore";
        } else if (numberOfCredits < 90) {
            gradeLevel = "Junior";
        } else {
            gradeLevel = "Senior";
        }

        return gradeLevel;
    }

    public static int getNextStudentId() {
        return nextStudentId;
    }

    public static void setNextStudentId(int nextStudentId) {
        Student.nextStudentId = nextStudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

