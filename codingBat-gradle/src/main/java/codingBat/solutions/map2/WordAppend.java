package codingBat.solutions.map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public String wordAppend(String[] strings) {
        String result = "";

        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, ++count);
                if (map.get(s) % 2 == 0) {
                    result = result + s;
                }
            } else {
                map.put(s, 1);
            }
        }

        return result;
    }
}
