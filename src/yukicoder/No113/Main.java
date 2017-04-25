package yukicoder.No113;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] S = sc.next().split("");

        int T = 0;
        int Y = 0;
        for(String s : S) {
            if ("N".equals(s)) T++;
            if ("E".equals(s)) Y++;
            if ("W".equals(s)) Y--;
            if ("S".equals(s)) T--;
        }

        System.out.println(Math.sqrt(Math.pow(Math.abs(T), 2) + Math.pow(Math.abs(Y), 2)));
    }
}
