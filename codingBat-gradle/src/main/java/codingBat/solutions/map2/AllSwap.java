package codingBat.solutions.map2;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            int index;

            if (map.containsKey(key)) {
                index = map.get(key);

                String tmp = strings[index];
                strings[index] = strings[i];
                strings[i] = tmp;
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }

        return strings;
    }
}
