package yukicoder.No446;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        if (checkFormat(A) && checkFormat(B)) {
            if (checkRange(A) && checkRange(B)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        } else {
            System.out.println("NG");
        }

    }
    private static boolean checkFormat(String str) {
        boolean result = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                result = false;
                break;
            }

            if (i == 0 && str.charAt(i) == '0' && str.length() > 1) {
                result = false;
                break;
            }
        }

        return result;
    }

    private static boolean checkRange(String str) {
        boolean result = true;

        int num = Integer.parseInt(str);

        if (num < 0 || num > 12345) {
            result = false;

        }

        return result;
    }
}
