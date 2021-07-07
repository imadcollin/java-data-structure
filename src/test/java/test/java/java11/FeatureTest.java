package test.java.java11;

import org.junit.Assert;
import org.junit.Test;

public class FeatureTest {
    @Test
    public void passed_test(){

        Assert.assertTrue(true);
    }
    @Test
    public void failed_test(){
        Assert.fail();
    }
}
