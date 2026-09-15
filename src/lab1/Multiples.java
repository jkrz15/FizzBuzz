package lab1;

public class Multiples {
    public static void main(String[] args) {
        // number of integers below 1000 that are positive and
        // divisible by 3 or 5
        System.out.println(multiples());
    }

    static int multiples() {
        return multiples(1000, 3, 5);
    }

    static int multiples(int num, int a, int b) {
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (i % a == 0 || i % b == 0) {
                count += 1;
            }
        }
        return count;
    }
}
