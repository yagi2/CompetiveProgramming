package yukicoder.No431;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isAlive = true;

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(sc.next()) == 1) {
                cnt++;
            }
        }
        if (cnt >= 2) {
            isAlive = false;
        }
        if (Integer.parseInt(sc.next()) == 1) {
            isAlive = true;
        }

        if (isAlive) {
            System.out.println("SURVIVED");
        } else {
            System.out.println("DEAD");
        }
    }
}
