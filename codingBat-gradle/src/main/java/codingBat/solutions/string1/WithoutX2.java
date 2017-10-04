package codingBat.solutions.string1;

public class WithoutX2 {
    public String withoutX2(String str) {

        String result = str;
        if (str.length() < 2) return "";

        boolean isfirstCharX = str.substring(0, 1).equals("x");
        boolean isSecondCharX = str.substring(1, 2).equals("x");

        if (isfirstCharX && isSecondCharX) {
            result = str.substring(2);
        }
        if (isfirstCharX && !isSecondCharX) {
            result = str.substring(1);
        }
        if (!isfirstCharX && isSecondCharX) {
            result = str.substring(0, 1) + str.substring(2);
        }

        return result;
    }
}
