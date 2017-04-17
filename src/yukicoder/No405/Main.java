package yukicoder.No405;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rome = sc.next();
        int T = Integer.parseInt(sc.next());

        System.out.println(intToRome((romeToInt(rome) + T + 1200) % 12));
    }

    private static int romeToInt(String rome) {
        switch (rome) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IIII":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XI":
                return 11;
            case "XII":
                return 0;
            default:
                return 0;
        }
    }

    private static String intToRome(int time) {
        switch (time) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IIII";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 11:
                return "XI";
            case 0:
                return "XII";
            default:
                return "XII";
        }
    }
}
