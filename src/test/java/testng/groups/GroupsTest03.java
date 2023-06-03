package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest03 {
    @Test(groups = {"S"})
    public void test01(){
        System.out.println("GroupsTest3-1");
    }
    @Test(groups = {"R"})
    public void test02(){
        System.out.println("GroupsTest3-2");
    }
    @Test
    public void test03(){
        System.out.println("GroupsTest3-3");
    }
    @Test(groups = {"S","R"})
    public void test04(){
        System.out.println("GroupsTest3-4");
    }
}
