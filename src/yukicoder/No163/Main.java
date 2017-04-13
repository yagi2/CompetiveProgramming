package yukicoder.No163;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String[] sp = S.split("");

        for (String aSp : sp) {
            if (Character.isUpperCase(aSp.charAt(0))) {
                System.out.print(aSp.toLowerCase());
            } else {
                System.out.print(aSp.toUpperCase());
            }
        }
        System.out.println();
    }
}
