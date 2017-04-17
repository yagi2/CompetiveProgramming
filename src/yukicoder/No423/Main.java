package yukicoder.No423;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(encodeHamu(decodeHamu(sc.next()) * 2));
    }

    private static int decodeHamu(String str) {
        str += "A";
        StringBuilder bin = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'm' && str.charAt(i+1) == 'u') {
                bin.append('1');
            } else if (str.charAt(i) == 'm' && (str.charAt(i+1) == 'h' || str.charAt(i+1) == 'A')) {
                bin.append('0');
            }
        }

        return Integer.parseInt(bin.toString(), 2);
    }

    private static String encodeHamu(int num) {
        String bin = Integer.toBinaryString(num);

        StringBuilder hamuBin = new StringBuilder();
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                hamuBin.append("hamu");
            } else if (bin.charAt(i) == '0') {
                hamuBin.append("ham");
            }
        }

        return hamuBin.toString();
    }
}
