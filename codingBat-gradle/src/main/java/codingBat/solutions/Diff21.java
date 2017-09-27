package codingBat.solutions;

public class Diff21 {

    public int diff21(int n) {

        int result = Math.abs(n - 21);
        if (n > 21)
            result = 2 * result;

        return result;
    }
}
