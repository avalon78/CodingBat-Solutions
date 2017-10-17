package codingBat.solutions.map2;

import org.junit.Assert;
import org.junit.Test;

public class WordAppendTest {

    @Test
    public void wordAppend() throws Exception {
        WordAppend wordAppend = new WordAppend();

        String[] input = {"a", "b", "a"};
        String[] expected = {"a"};
        Assert.assertArrayEquals(expected, new String[]{wordAppend.wordAppend(input)});
    }

}