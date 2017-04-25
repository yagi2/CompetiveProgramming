package yukicoder.No104;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split("");

        int N = 1;;
        for(String s : S) {
            if ("R".equals(s)) N += N+1;
            if ("L".equals(s)) N += N;
        }
        System.out.println(N);
    }
}
