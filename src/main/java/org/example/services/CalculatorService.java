package org.example.services;

public class CalculatorService {
    public static int addTwoNumbers(int a,int b){
        return a+b;
    }

    public static int productTwoNumbers(int a,int b) {
         return a*b;
    }

    public static int divideTwoNumbers(int a,int b) {
        return a/b;
    }

    public static int sumAnyNumber(int... numbers){
        int sum=0;
        for (int number : numbers) {
            sum+=number;
        }
        return sum;
    }
}
