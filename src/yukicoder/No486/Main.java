package yukicoder.No486;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next() + "AA";

        if (S.length() < 5) {
            System.out.println("NA");
        } else {
            for (int i = 0; i < S.length() - 2; i++) {
                if (S.charAt(i) == 'O' && S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'O') {
                    System.out.println("East");
                    break;
                }
                if (S.charAt(i) == 'X' && S.charAt(i + 1) == 'X' && S.charAt(i + 2) == 'X') {
                    System.out.println("West");
                    break;
                }
                if (i == S.length() - 4) {
                    System.out.println("NA");
                    break;
                }
            }
        }
    }
}
