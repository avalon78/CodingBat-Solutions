package codingBat.solutions.warmup1;

import org.junit.Assert;
import org.junit.Test;

public class Diff21Test {

    @Test
    public void diff21() throws Exception {

        Diff21 diff21 = new Diff21();
        int result;
        result = diff21.diff21(19);
        Assert.assertEquals(2, result);

        result = diff21.diff21(22);
        Assert.assertEquals(2, result);

        result = diff21.diff21(25);
        Assert.assertEquals(8, result);

        result = diff21.diff21(-1);
        Assert.assertEquals(22, result);

        result = diff21.diff21(0);
        Assert.assertEquals(21, result);

    }

}