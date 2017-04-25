package yukicoder.No9011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (String s : sc.next().split("")) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
