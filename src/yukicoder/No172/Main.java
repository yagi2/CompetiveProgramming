package yukicoder.No172;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((int)Math.floor(Math.abs(Integer.parseInt(sc.next())) + Math.abs(Integer.parseInt(sc.next())) + (Math.sqrt(2) * Integer.parseInt(sc.next()))) + 1);
    }
}
