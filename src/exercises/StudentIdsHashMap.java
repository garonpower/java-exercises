package exercises;

import java.util.*;

public class StudentIdsHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ID's
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newId = in.nextInt();
                students.put(newStudent, newId);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        // double sum = 0.0;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " ID: " + student.getValue());
            // sum += student.getValue();
        }

        // double avg = sum / students.size();
        // System.out.println("Average grade: " + avg);
    }
}
