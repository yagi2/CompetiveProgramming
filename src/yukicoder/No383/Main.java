package yukicoder.No383;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        if (A == B) {
            System.out.println("0");
        } else if (A > B) {
            System.out.println("-" + (A-B));
        } else if (A < B) {
            System.out.println("+" + (B-A));
        }
    }
}
