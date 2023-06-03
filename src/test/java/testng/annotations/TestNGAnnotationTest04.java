package testng.annotations;

import org.testng.annotations.*;

public class TestNGAnnotationTest04 {

    @BeforeMethod
    public void setUP() {
        System.out.println("Before Method");
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
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
}
