package lab1;

public class Multiples {
    public static void main(String[] args) {
        // number of integers below 1000 that are positive and
        // divisible by 3 or 5
        int num = 1000;
        int count = 0;
        for (int i=1; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
