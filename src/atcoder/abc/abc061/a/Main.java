package atcoder.abc.abc061.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());

        System.out.println((C >= A && C <= B)? "Yes" : "No");
    }
}
