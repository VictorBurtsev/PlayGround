package ru;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by victor.burtsev@gmail.com on 9/6/17.
 */

public class StringsTest {
    @Test
    public void test1ReverseWordsInString() throws Exception {
        assertEquals("tamA airotciv maruc", new Strings().reverseWordsInString("Amat victoria curam"));
        assertEquals("yM efil ym zelur", new Strings().reverseWordsInString("My life my rulez"));
    }

    @Test
    public void tes21ReverseWordsInString() throws Exception {
        assertEquals("yM efil ym zelur", new Strings().reverseWordsInString("My life my rulez"));
    }
}
