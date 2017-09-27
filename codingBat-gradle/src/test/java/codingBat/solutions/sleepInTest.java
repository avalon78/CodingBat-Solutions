package codingBat.solutions;

import org.junit.Assert;
import org.junit.Test;

public class sleepInTest {

    @Test
    public void sleepIn() throws Exception {
        SleepIn sleepIn = new SleepIn();
        boolean result;

        result = sleepIn.sleepIn(true, false);
        Assert.assertEquals(false, result);

        result = sleepIn.sleepIn(false, false);
        Assert.assertEquals(true, result);


    }

}