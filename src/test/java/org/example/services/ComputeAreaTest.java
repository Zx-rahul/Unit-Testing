package org.example.services;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

// @TestInstance(TestInstance.Lifecycle.PER_METHOD) default behaviour
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ComputeAreaTest {

    ComputeAreaTest() {//Test instance will be created after each test case
        System.out.println("Test obj is created");
    }

    @BeforeAll//before all test case
    static void just(){
        System.out.println("Before all test case");
    }

    @BeforeEach//before each test case
    void init(){
        System.out.println("Before each test method");
    }

    @Test
    void computeAreaOfSquare() {
        assertEquals(25,ComputeArea.square(5));
        System.out.println("Test 1");
    }

    @Test
    void computeAreaOfCircle(){
        assertEquals(39.269908169872416,ComputeArea.circle(5),"Your area is wrong");
        System.out.println("Test 2");
    }

    @Test
    void computeAreaOfCircle_Supplier(){
        assertEquals(39.269908169872416,ComputeArea.circle(5),()->"Your area of circle is wrong");
        System.out.println("Test 3");
    }

    @AfterEach//after each test case
    void destroy(){
        System.out.println("After each test method");
    }

    @AfterAll//after all test case
    static void des(){
        System.out.println("After all test case");
    }

}
