package exercises.Class2;

public class CountEvenNum {
    public static void main(String[] args) {

        int n[] = {1, 3, 4, 6, 8, 9, 4, 12, 14, 34, 5, 100};

        int total = 0;

        for(int i : n) {
            if (i % 2 == 0) {
                total = total + i;
            }
        }

        System.out.println(" The sum of even numbers = " + total);
    }
}
