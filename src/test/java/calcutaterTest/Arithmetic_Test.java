package calcutaterTest;

import calcutater.ArithmeticOperator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Arithmetic_Test {

    SoftAssert softAssert = new SoftAssert();
    // arithmeticOperator : use none static method.
    ArithmeticOperator arithmeticOperator = new ArithmeticOperator();

    @Test(priority = 0)
    public void testSum() {
        System.out.println("****************01st Test case for cal Sum*****************");
        System.out.println("<<<<<<<<<<<<<<<<First sum calculation>>>>>>>>>>>>>>>>>");
        int actualValueSum = arithmeticOperator.cal_Sum(20, 5);
        System.out.println("Actual Sum 1 value is : " + actualValueSum);
        softAssert.assertEquals(actualValueSum,25,"Failed to calc sum 1");

        System.out.println("<<<<<<<<<<<<<<<<Second sum calculation>>>>>>>>>>>>>>>>>");
        int actualValueSum1 = arithmeticOperator.cal_Sum(10, 20);
        System.out.println("Actual Sum 2 value is : " + actualValueSum1);
        softAssert.assertEquals(actualValueSum1,30,"Failed to calc sum 2");

        System.out.println("<<<<<<<<<<<<<<<<Third sum calculation>>>>>>>>>>>>>>>>>");
        int actualValueSum2 = arithmeticOperator.cal_Sum(4, 8);
        System.out.println("Actual Sum 3 value is : " + actualValueSum2);
        softAssert.assertEquals(actualValueSum2,12,"Failed to calc sum 3");
        System.out.println();
        System.out.println();
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void testSubtraction(){
        System.out.println("****************02nd Test case for cal Subtraction*****************");
        System.out.println("<<<<<<<<<<<<<<<<First Subtraction calculation>>>>>>>>>>>>>>>>>");
        int actualValueSub = arithmeticOperator.cal_Sub(20, 5);
        System.out.println("Actual Subtraction 1 value is : " + actualValueSub);
        softAssert.assertEquals(actualValueSub,10,"Failed to calc Subtraction 1");

        System.out.println("<<<<<<<<<<<<<<<<Second Subtraction calculation>>>>>>>>>>>>>>>>>");
        int actualValueSub1= arithmeticOperator.cal_Sub(30, 5);
        System.out.println("Actual Subtraction 2 value is : " + actualValueSub1);
        softAssert.assertEquals(actualValueSub1,20,"Failed to calc Subtraction 2");
        softAssert.assertAll();
    }
}

