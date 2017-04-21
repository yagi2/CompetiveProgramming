package yukicoder.No236;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());

        System.out.println((A+B)*min((double)X/A, (double)Y/B));
    }

    private static double min(double A, double B) {
        if (A < B) {
            return A;
        }
        if (A > B) {
            return B;
        }
        return A;
    }
}
