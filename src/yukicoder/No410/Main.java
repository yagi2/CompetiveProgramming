package yukicoder.No410;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Px = Integer.parseInt(sc.next());
        int Py = Integer.parseInt(sc.next());
        int Qx = Integer.parseInt(sc.next());
        int Qy = Integer.parseInt(sc.next());

        int mannX = Math.abs(Px - Qx);
        int manhY = Math.abs(Py - Qy);
        System.out.println((mannX + manhY) / 2.0);
    }
}
