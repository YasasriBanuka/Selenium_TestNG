package testNG;

import org.testng.annotations.Test;

public class PrioritizeTest {

    @Test(priority = 0)
    public void loginTest(){
        System.out.println("Login");
    }
    //priority means indicates the intended execution order if the test were enabled
    @Test(priority = 1)
    public void testCreate(){
        System.out.println("Create");
    }
    //// enabled = false is used to temporarily skip this test (e.g., under development or known to fail)
    @Test(priority = 2, enabled = false)
    public void testEdit(){
        System.out.println("Edit");
    }
    @Test(priority = 3)
    public void testDelete(){
        System.out.println("Delete");
    }
    @Test(priority = 4)
    public void testLogout(){
        System.out.println("Logout");

    }
}
