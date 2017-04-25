package yukicoder.No89;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = Integer.parseInt(sc.next());
        int Rin = Integer.parseInt(sc.next());
        int Rout = Integer.parseInt(sc.next());

        double R = (Rout - Rin) / 2.0;
        double D = (Rin + Rout) / 2.0;

        System.out.println(Math.pow(R, 2) * Math.pow(Math.PI, 2) * 2 * D * C);
    }
}
