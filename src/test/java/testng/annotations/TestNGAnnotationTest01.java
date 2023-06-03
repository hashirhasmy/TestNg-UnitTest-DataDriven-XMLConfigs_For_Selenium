package testng.annotations;

import org.testng.annotations.Test;

public class TestNGAnnotationTest01 {
    public static void main(String[] args) {
        System.out.println("print 01");
        TestNGAnnotationTest01 obj = new TestNGAnnotationTest01();
        obj.print();
    }
    public void print() {
        System.out.println("print 02");
    }

    @Test
    public void test01(){
        System.out.println("test01");
    }
}
