package com.appscorner.samples;

import com.pholser.junit.quickcheck.ForAll;
import org.junit.contrib.theories.Theories;
import org.junit.contrib.theories.Theory;
import org.junit.runner.RunWith;

import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

@RunWith(Theories.class)
public class PropertyBasedTest {

    @Theory
    public void testListOfStringSoft(@ForAll List<String> ls) throws Exception {
        String curr;
        String prev = null;
        ls.sort(Comparator.<String>naturalOrder());
        for (String aStr : ls) {
            if (null == prev) prev = aStr;
            curr = aStr;
            assertThat("Elements should be sorted", curr.compareTo(prev)>-1, is(true));
        }
    }
}
