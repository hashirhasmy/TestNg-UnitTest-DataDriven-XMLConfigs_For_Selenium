package testng.assersions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssersionTest01 {

    @Test
    public void testAssertEquals(){
        String actualValue = "Hello Word";
        System.out.println("***prior to assersion***");
        Assert.assertEquals(actualValue,"Hello Word","if failed the scenario message will apear");
        System.out.println("***after assersion***");
    }

    @Test
    public void testAssertNotEquals() {
        String actualValue = "Hello Word";
        System.out.println("***prior to assersion***");
        Assert.assertNotEquals(actualValue,"Hello word","faile message");
        System.out.println("***after assersion***");
    }

    @Test
    public void testAssertTrue() {
        boolean isActualValue = true;
        Assert.assertTrue(isActualValue,"failed to match boolean");
    }

    @Test
    public void testAssertFalse() {
        boolean isActualValue = false;
        Assert.assertFalse(isActualValue,"XXX YYY ZZZ");
    }
}
