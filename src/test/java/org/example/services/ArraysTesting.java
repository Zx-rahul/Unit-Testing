package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class ArraysTesting {

    @Test
    void testSort(){
//        try {
//            int[] unsorted=null;
//            Assertions.assertArrayEquals(unsorted,ArraysSort.sort(unsorted));
//            System.out.println("After checking");
//        } catch (NullPointerException e) {
//            System.out.printf("exception generated %s",e.getMessage());
//        }
          int[] unsorted= null;
          Assertions.assertThrows(NullPointerException.class,()->ArraysSort.sort(unsorted));


    }

    @Test
     void testArrays() {
     int[] expected={2,4,7,8};
     int[] actual={8,7,4,2};
     Arrays.sort(actual);
     Assertions.assertArrayEquals(expected,actual);
     //Assertions.assertEquals(expected,actual); ---- It will not work(checking the object reference)
    }
}
