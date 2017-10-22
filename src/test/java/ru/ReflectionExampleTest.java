package ru;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created by victor.burtsev@gmail.com on 10/22/17.
 */

public class ReflectionExampleTest {

    private ReflectionExample reflectionExample = new ReflectionExample();
    private Class mClassObject = ReflectionExample.class;

    @Test
    public void test1Method1() throws Exception {
        Method method = mClassObject.getMethod("method1", null);
        Assert.assertEquals(method.invoke(reflectionExample, null), "Method1 run!");
    }

    @Test
    public void test21Method2() throws Exception {
        Method method = mClassObject.getMethod("method2", null);
        Assert.assertEquals(method.invoke(reflectionExample, null), "Method2 run!");
    }
}
