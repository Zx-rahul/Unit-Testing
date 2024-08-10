package org.example.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;


public class CalculatorServiceJUnit5Test {

@Test
public void addTwoNumbersTest(){

   // fail("yet not implemented");
    int actualResult= CalculatorService.addTwoNumbers(4,5);
    int expectedResult=9;

    Assertions.assertEquals(expectedResult,actualResult,"addition result is wrong");

}

@Test
public void sumAnyNumberTest(){

    int actualResult=CalculatorService.sumAnyNumber(4,5,6);
    int expectedResult=15;

    Assertions.assertEquals(expectedResult,actualResult,"Test Failed");

}
}
