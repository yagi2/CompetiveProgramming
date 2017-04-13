package yukicoder.No207;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());

        for (long i = A; i <= B; i++) {
            boolean isNabeatsu = false;
            if (i % 3 == 0 || i % 30 == 0) {
                isNabeatsu = true;
            } else {
                String s = String.valueOf(i);
                String[] sp = s.split("");

                for (int j = 0; j < sp.length; j++) {
                    if (sp[j].equals("3")) {
                        isNabeatsu = true;
                        break;
                    }
                }
            }
            if (isNabeatsu) {
                System.out.println(i);
            }
        }
    }
}
