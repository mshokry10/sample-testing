package com.appscorner.samples;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class MathTestTimedPerTest {

    @Test(timeout = 1000)
    public void testSlowFactorial10() throws Exception {
        final Math math = new Math();
        assertThat("Addition", math.slowFactorial(10), is(BigInteger.valueOf(3628800)));
    }

    @Test(timeout = 500)
    public void testSlowFactorial5() throws Exception {
        final Math math = new Math();
        assertThat("Addition", math.slowFactorial(5), is(BigInteger.valueOf(120)));
    }
}
