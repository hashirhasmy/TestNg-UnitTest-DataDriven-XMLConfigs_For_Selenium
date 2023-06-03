package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest04 {
    @Test(groups = {"R"})
    public void test01(){
        System.out.println("GroupsTest4-1");
    }
    @Test(groups = {"S","R"})
    public void test02(){
        System.out.println("GroupsTest4-2");
    }
    @Test
    public void test03(){
        System.out.println("GroupsTest4-3");
    }
    @Test(groups = {"R"})
    public void test04(){
        System.out.println("GroupsTest4-4");
    }
    @Test
    public void test05(){
        System.out.println("GroupsTest4-5");
    }
}
