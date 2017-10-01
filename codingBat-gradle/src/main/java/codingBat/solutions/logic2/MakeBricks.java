package codingBat.solutions.logic2;

public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {

        boolean result = false;

        if (small + 5 * big < goal)
            return result;

        int bigBricksNeeded = goal / 5;
        if (big >= bigBricksNeeded) {

            if (Math.abs(bigBricksNeeded * 5 - goal) <= small)
                result = true;
        } else if (big < bigBricksNeeded) {
            bigBricksNeeded = big;
            if (Math.abs(goal - bigBricksNeeded * 5) <= small)
                result = true;

        }

        return result;
    }

}
