package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationTest02 {
    @Test
    public void test01() {
        System.out.println("test 01");
    }

    @BeforeMethod
    public void setUP() {
        System.out.println("before method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("after method");
    }
}
