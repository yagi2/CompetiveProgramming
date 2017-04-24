package yukicoder.No149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Aw = Integer.parseInt(sc.next());
        int Ab = Integer.parseInt(sc.next());
        int Bw = Integer.parseInt(sc.next());
        int Bb = Integer.parseInt(sc.next());

        int C = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());

        if (Aw+Ab < C*2) {
            Aw -= C - Ab;
            Bw += C - Ab;
        }

        int move = (D > Bw)? Bw : D;

        System.out.println(Aw+move);
    }
}
