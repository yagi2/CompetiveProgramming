package yukicoder.No9001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();

        System.out.println(String.format("%d %s", A+B, S));
    }
}
