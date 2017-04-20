package yukicoder.No304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean lockFlag = true;
        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(i + "" + j + "" + k);

                    String S = sc.next();
                    if (S.equals("unlocked")) {
                        lockFlag = false;
                        break;
                    }
                }
                if (!lockFlag) break;
            }
            if (!lockFlag) break;
        }
    }
}
