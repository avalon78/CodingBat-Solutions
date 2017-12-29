package codingBat.solutions.warmup1;

public class NotString {
    public String notString(String str) {
        return !str.startsWith("not") ? "not " + str : str;
    }
}
