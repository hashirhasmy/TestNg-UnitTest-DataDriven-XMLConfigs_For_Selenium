package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {

    ArithmeticOperator calc;
    
    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();
    }

    @Test
    public void testsum() {
        int actualvalue = calc.sum(50,350);
        Assert.assertEquals(actualvalue,400,"failed to calc sum");
        //this is showing error because in logic have some changes to expected result
    }
}
