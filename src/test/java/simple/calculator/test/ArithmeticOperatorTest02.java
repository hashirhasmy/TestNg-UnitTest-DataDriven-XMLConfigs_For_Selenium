package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest02 {

    ArithmeticOperator calc;

    @BeforeMethod
    public void setUP() {
        calc = new ArithmeticOperator();
    }

    @Test(dataProvider = "getData")
    public void testSum(int input1, int input2, int expectedOutPut ) {
        Assert.assertEquals(calc.sum(input1,input2),expectedOutPut,"failed to calc sum");
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {0,1,1},
                {0,-1,-1},
                {-2147483647,-1,-2147483648},
                {2147483646,1,2147483647}
        };
    }
}
