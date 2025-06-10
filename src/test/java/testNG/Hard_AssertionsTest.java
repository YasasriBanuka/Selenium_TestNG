package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_AssertionsTest {


    String actualValue = "Dias";

    @Test(priority = 0)
    public void valuesEqualCheck(){
        String expectedValue = "Dias";
        System.out.println("Prior to valuesEqualCheck assertion");
        Assert.assertEquals(actualValue,expectedValue,"value miss matched");
        System.out.println("After valuesEqualCheck assertion");
    }
    @Test(priority = 1)
    public void valuesNotEqualCheck(){
        String expectedValue = "Learn well";
        System.out.println("Prior to valuesNotEqualCheck assertion");
        Assert.assertNotEquals(actualValue,expectedValue,"value matched");
        System.out.println("After valuesNotEqualCheck assertion");
    }

    @Test(priority = 2)
    public void trueConditionCheck(){
        System.out.println("Prior to trueConditionCheck assertion");
       Assert.assertTrue(actualValue.startsWith("D"),"Condition Return a False");
        System.out.println("After to trueConditionCheck assertion");

    }

    @Test(priority = 3)
    public void falseConditionCheck(){
        System.out.println("Prior to falseConditionCheck assertion");
        Assert.assertFalse(actualValue.isBlank(),"Condition Return a True");
        System.out.println("After to falseConditionCheck assertion");

    }

}
