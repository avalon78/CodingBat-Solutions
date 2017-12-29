package codingBat.solutions.warmup1;

/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

 */

public class SumDouble {

    public int sumDouble(int a, int b) {
        return a != b ? a + b : 2 * (a + b);
    }
}
