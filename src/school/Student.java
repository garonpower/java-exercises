package school;

public class Student {
    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studenId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studenId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studenId) {
        this(name, studenId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    int getNumberOfCredits = 0;

    public int getNextStudentId() {
        return getNumberOfCredits;
    }

 /*   private void setNextStudentId(int aNextStudntId) {
        nextStudentId = aNextStudentId;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudenId() {
        return studentId;
    }

   /* public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }*/

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }
}

