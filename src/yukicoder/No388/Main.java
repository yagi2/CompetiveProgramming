package yukicoder.No388;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = Integer.parseInt(sc.next());
        int F = Integer.parseInt(sc.next());

        System.out.printf("%d\n", (S / F) + 1);
    }
}
