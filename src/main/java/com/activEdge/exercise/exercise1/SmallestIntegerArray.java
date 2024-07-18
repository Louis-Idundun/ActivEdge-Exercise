package com.activEdge.exercise.exercise1;

import java.util.HashSet;
import java.util.Set;

public class SmallestIntegerArray {
    private static int function (int[] A){
        Set<Integer> set = new HashSet<>();

        //Creating an HashSet from the array of integers A
        for (int a : A) {
            set.add (a);
        }
        //Loop through the set to find the smallest integer
        int smallest = 1;
        while(set.contains(smallest)) {
            smallest++;
        }
        return smallest;
    }
}
