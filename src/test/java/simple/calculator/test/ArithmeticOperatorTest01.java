package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest01 {

    ArithmeticOperator calc;

    @BeforeMethod
    public void testName() {
        calc = new ArithmeticOperator();
    }

    @Test
    public void setSum() {
        Assert.assertEquals(calc.sum(0,1),1,"failed to calc sum");
        Assert.assertEquals(calc.sum(0,-1),-1,"failed to calc sum");
        Assert.assertEquals(calc.sum(2147483646,1),2147483647,"failed to calc sum");
        Assert.assertEquals(calc.sum(-2147483647,-1),-2147483648,"failed to calc sum");
    }

    @Test
    public void testSum1() {
        Assert.assertEquals(calc.sum(0,1),1,"failed to calc sum");
    }

    @Test
    public void testSum2() {
        Assert.assertEquals(calc.sum(0,-1),-1,"failed to calc sum");
    }

    @Test
    public void testSum3() {
        Assert.assertEquals(calc.sum(2147483646,1),2147483647,"failed to calc sum");
    }

    @Test
    public void testSum4() {
        Assert.assertEquals(calc.sum(-2147483647,-1),-2147483648,"failed to calc sum");
    }
}
