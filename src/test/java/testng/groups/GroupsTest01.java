package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest01 {

    @Test(groups = {"S","R"})
    public void test01(){
        System.out.println("GroupsTest1-1");
    }
    @Test(groups = {"R"})
    public void test02(){
        System.out.println("GroupsTest1-2");
    }
    @Test
    public void test03(){
        System.out.println("GroupsTest1-3");
    }
    @Test(groups = {"S"})
    public void test04(){
        System.out.println("GroupsTest1-4");
    }
    @Test(groups = {"S","R"})
    public void test05(){
        System.out.println("GroupsTest1-5");
    }

}
