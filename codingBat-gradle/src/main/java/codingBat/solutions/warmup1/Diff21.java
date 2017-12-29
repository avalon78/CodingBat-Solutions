package codingBat.solutions.warmup1;

public class Diff21 {

    public int diff21(int n) {
        return n < 21 ? Math.abs(n - 21) : 2 * Math.abs(n - 21);
    }
}
