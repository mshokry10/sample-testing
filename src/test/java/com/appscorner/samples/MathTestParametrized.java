package com.appscorner.samples;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class MathTestParametrized {

    @Test
    @Parameters({
            "2, 3, 5",
            "5, 6, 11",
            "23, 32, 55",
            "100, 0, 100",
            "0, 0, 0"
    })
    public void testAdd(int a, int b, int sum) throws Exception {
        final Math math = new Math();
        assertThat("Addition", math.add(a, b), is(sum));
    }
}
