package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnTest {

    @Test()
    public void oLevel(){
        System.out.println("Ordinary Level");
        Assert.fail();

    }

    @Test(dependsOnMethods = "oLevel")
    public void aLevel(){
        System.out.println("Advanced Level");
    }

    @Test(dependsOnMethods = {"oLevel","aLevel"},alwaysRun = true)
    public void university(){
        System.out.println("Government University ");
    }
}
