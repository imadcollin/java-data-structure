package test.java.java11;

import java11.LambdaFn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {

    private LambdaFn lambdaFn;

    @Before
    public void init() {
        lambdaFn = new LambdaFn();
    }

    @Test
    public void add_test() {
        Assert.assertEquals(lambdaFn.operation(2, 3), 6);
        Assert.assertEquals(lambdaFn.operation(4, 5), 20);
        Assert.assertEquals(lambdaFn.operation(-5, -10), 50);
    }

    @Test
    public void sort_test() {
        List<String> list = lambdaFn.sortAlfa(Arrays.asList("Java", "Python", "C"));
        Assert.assertTrue(list.size() > 0);
        Assert.assertEquals(list.get(0), "C");
        Assert.assertEquals(list
                .get(1), "Java");
        Assert.assertEquals(list.get(2), "Python");


    }
}
