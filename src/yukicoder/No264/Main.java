package yukicoder.No264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int me = Integer.parseInt(sc.next());
        int cpu = Integer.parseInt(sc.next());

        if (me == cpu) {
            System.out.println("Drew");
        }
        if (cpu == (me + 1) % 3) {
            System.out.println("Won");
        }
        if (me == (cpu + 1) % 3) {
            System.out.println("Lost");
        }
    }
}
