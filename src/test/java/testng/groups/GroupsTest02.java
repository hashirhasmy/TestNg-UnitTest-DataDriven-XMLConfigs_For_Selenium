package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest02 {
    @Test
    public void test01(){
        System.out.println("GroupsTest2-1");
    }
    @Test(groups = {"R"})
    public void test02(){
        System.out.println("GroupsTest2-2");
    }
    @Test(groups = {"S","R"})
    public void test03(){
        System.out.println("GroupsTest2-3");
    }
}
