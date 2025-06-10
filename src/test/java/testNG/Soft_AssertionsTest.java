package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert; // Used for soft assertions

public class Soft_AssertionsTest {

    // Creating a SoftAssert object since its methods are non-static
    SoftAssert softAssert = new SoftAssert();

    // Sample actual value to be used in assertions
    String actualValue = "Dias";

    @Test(priority = 0)
    public void valuesEqualCheck() {
        String expectedValue = "Diasw";
        System.out.println("Prior to valuesEqualCheck assertion");
        softAssert.assertEquals(actualValue, expectedValue, "value miss matched");
        System.out.println("After valuesEqualCheck assertion");

        // If any soft assertions failed, the test will now fail.
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void valuesNotEqualCheck() {
        String expectedValue = "Learn well";
        System.out.println("Prior to valuesNotEqualCheck assertion");

        // Hard assertion: test will immediately stop if this fails
        softAssert.assertNotEquals(actualValue, expectedValue, "value matched");
        System.out.println("After valuesNotEqualCheck assertion");
    }

    @Test(priority = 2)
    public void trueConditionCheck() {
        System.out.println("Prior to trueConditionCheck assertion");

        // startWith - Return boolean
        softAssert.assertTrue(actualValue.startsWith("D"), "Condition Return a False");

        System.out.println("After to trueConditionCheck assertion");
    }

    @Test(priority = 3)
    public void falseConditionCheck() {
        System.out.println("Prior to falseConditionCheck assertion");

        // Soft assertion to check if actualValue is not blank
        softAssert.assertFalse(actualValue.isBlank(), "Condition Return a True");

        System.out.println("After to falseConditionCheck assertion");

        // Missing assertAll(): Without this, failure won't be reported
    }

}
