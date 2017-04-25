package yukicoder.No79;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        Map<Integer, Integer> L = new HashMap<>();
        for (int i = 0 ; i < N; i++) {
            int l = Integer.parseInt(sc.next());

            if (!L.containsKey(l)) L.put(l, 0);
            L.put(l, L.get(l)+1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(L.entrySet());
        entryList.sort((o1, o2) -> {
            if (o1.getValue() > o2.getValue()) return -1;
            if (o1.getValue() < o2.getValue()) return 1;

            if (Objects.equals(o1.getValue(), o2.getValue())) {
                if (o1.getKey() > o2.getKey()) return -1;
                if (o1.getKey() < o2.getKey()) return 1;
            }
            return 0;
        });

        System.out.println(entryList.get(0).getKey());
    }
}
