package yukicoder.No3017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long S = Long.parseLong(sc.next());
        Long K = Long.parseLong(sc.next());
        System.out.println(S%K);
    }
}
