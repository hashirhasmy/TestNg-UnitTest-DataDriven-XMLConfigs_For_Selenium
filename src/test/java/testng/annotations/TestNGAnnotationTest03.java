package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationTest03 {

    @BeforeMethod
    public void setUP() {
        System.out.println("before method");
    }
    @Test
    public void test01() {
        System.out.println("test 01");
    }
    @Test
    public void test02() {
        System.out.println("test 02");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("after method");
    }
}
