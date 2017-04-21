package yukicoder.No227;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> cards = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            int N = Integer.parseInt(sc.next());
            if (!cards.containsKey(N)) cards.put(N, 0);
            cards.put(N, cards.get(N)+1);
        }

        if (isFullHouse(cards)) {
            System.out.println("FULL HOUSE");
        } else if (isThreeCard(cards)) {
            System.out.println("THREE CARD");
        } else if (isTwoPair(cards)) {
            System.out.println("TWO PAIR");
        } else if (isOnePair(cards)) {
            System.out.println("ONE PAIR");
        } else {
            System.out.println("NO HAND");
        }
    }

    private static boolean isFullHouse(Map<Integer, Integer> cards) {
        return cards.size() == 2 && cards.containsValue(3);
    }

    private static boolean isThreeCard(Map<Integer, Integer> cards) {
        return cards.containsValue(3);
    }

    private static boolean isTwoPair(Map<Integer, Integer> cards) {
        return cards.size() == 3 && !cards.containsValue(3);
    }

    private static boolean isOnePair(Map<Integer, Integer> cards) {
        return cards.size() == 4;
    }
}
