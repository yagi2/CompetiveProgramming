package yukicoder.No3021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            int Xs = Integer.parseInt(sc.next());
            int Xe = Integer.parseInt(sc.next());
            int Ys = Integer.parseInt(sc.next());
            int Ye = Integer.parseInt(sc.next());

            System.out.printf("SELECT count(*) FROM point WHERE x BETWEEN %d AND %d AND y BETWEEN %d AND %d;\n", Xs, Xe, Ys, Ye);
        }
    }
}
