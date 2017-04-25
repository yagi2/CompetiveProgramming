package yukicoder.No98;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((int)(Math.sqrt(Math.pow(Integer.parseInt(sc.next()), 2) + Math.pow(Integer.parseInt(sc.next()), 2)) * 2.0) + 1);
    }
}
