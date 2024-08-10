package org.example.services;

//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//    @BeforeClass
//    public static void init(){
//        System.out.println("Executes before all test cases");
//        System.out.println("Test Started"+new Date());
//    }
//
//    //test method of addTwoNumbers
//    @Test(timeout = 2000)
//    public void addTwoNumbersTest() throws InterruptedException {
//        System.out.println("Executes addTwoNumbersTest");
//        //actual result
//        int result= CalculatorService.addTwoNumbers(5, 6);
//
//        //expected result
//        int expected=11;
//
//        //checking test case(expected==result)
//        Assert.assertEquals(expected,result);
//    }
//
//    @Test
//    public void sumAnyNumbersTest(){
//        System.out.println("Executes sumAnyNumbersTest");
//        //actual result
//        int result=CalculatorService.sumAnyNumber(2,3,4,5);
//
//        //expected result
//        int expectedResult=14;
//
//        //checking test case(expected==result)
//        Assert.assertEquals(expectedResult,result);
//    }
//
//    @AfterClass
//    public static void cleanup(){
//        System.out.println("Executes after all test cases");
//        System.out.println("Test Ended : "+new Date());
//    }
//}
