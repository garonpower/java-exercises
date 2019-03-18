package school;

public class Student {
    private String name;
    private final int studenId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studenId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studenId = studenId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studenId) {
        this(name, studenId, 0, 0);
    }

    int getNumberOfCredits = 0;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudenId() {
        return studenId;
    }

    public void setStudenId(int aStudentId) {
        studenId = aStudentId;
    }

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

