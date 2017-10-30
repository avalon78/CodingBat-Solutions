package codingBat.solutions.string3;

public class MaxBlock {
    public int maxBlock(String str) {
        if (str.isEmpty()) return 0;

        char[] chars = str.toCharArray();

        char previous = chars[0];
        int count = 1;
        int max = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == previous) {
                count++;
            } else {
                previous = chars[i];
                count = 1;
            }

            if (count > max) max = count;

        }
        return max;
    }
}
