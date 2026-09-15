package lab1;

public class Reduce {
    public static void main(String[] args) {
        int num = 2;
        int steps = reduce(num);

        System.out.println(steps);
    }

    public static int reduce(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num -= 1;
            }

            steps += 1;
        }
        return steps;
    }
}
