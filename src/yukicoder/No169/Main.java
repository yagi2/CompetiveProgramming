package yukicoder.No169;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = Integer.parseInt(sc.next());
        long S = Long.parseLong(sc.next());
        System.out.println((int)Math.floor((S / (100.0 - K)) * 100.0));
    }
}
