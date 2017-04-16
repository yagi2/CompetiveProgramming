package yukicoder.No427;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long H = Long.parseLong(sc.next());
        Long W = Long.parseLong(sc.next());

        if (H > W) {
            System.out.println("TATE");
        } else {
            System.out.println("YOKO");
        }
    }
}
