package com.appscorner.samples;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MathTestTimed {

//    @Rule public Timeout globalTimeout = new Timeout(1000);

    @Test(timeout = 1000)
    public void testAddWithTime() throws Exception {
        final Math math = new Math();
        assertThat("Addition", math.slowFactorial(10), is(BigInteger.valueOf(3628800)));
    }
}
