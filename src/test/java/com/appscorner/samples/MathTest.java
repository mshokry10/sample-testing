package com.appscorner.samples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertEquals;

public class MathTest {

    @Test
    public void testAdd() throws Exception {
        final Math math = new Math();
        assertEquals("Addition", 5, math.add(2, 3));
    }

    @Test
    public void testAddWithHamcrestMatchers() throws Exception {
        final Math math = new Math();
        assertThat("Addition", math.add(2, 3), is(5));
    }

    @Test
    public void testDivWithHamcrestMatchers() throws Exception {
        final Math math = new Math();
        assertThat("Division", math.div(3, 2), is(1.5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivByZero() throws Exception {
        final Math math = new Math();
        math.div(1, 0);
    }
}
