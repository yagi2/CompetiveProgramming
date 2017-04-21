package yukicoder.No203;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String W = sc.next() + sc.next();

        int num = 0;
        int tmp = 0;
        for (String s : W.split("")) {
            if (s.equals("o")) {
                tmp++;
            }
            if (s.equals("x")) {
                if (num < tmp) num = tmp;
                tmp = 0;
            }
        }
        if (num < tmp) num = tmp;
        System.out.println(num);
    }
}
