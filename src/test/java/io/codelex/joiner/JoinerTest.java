package io.codelex.joiner;

import io.codelex.examination_work.joiner.Joiner;
import org.junit.Assert;
import org.junit.Test;

public class JoinerTest {
    @Test
    public void testJoin() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String result = joiner.join(1, 2, 3, 4);
        Assert.assertEquals("1-2-3-4", result);
    }
}
