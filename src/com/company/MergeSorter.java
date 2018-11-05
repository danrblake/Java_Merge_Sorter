package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSorter {
    public int[] splitArray(int[] entryArray) {
        if (entryArray.length == 1){
            return entryArray;
        }
        int[] firstSplit;
        int[] secondSplit;
        firstSplit = Arrays.copyOfRange(entryArray, 0, entryArray.length/2 );
        System.out.println(Arrays.toString(firstSplit));
        splitArray(firstSplit);
        secondSplit = Arrays.copyOfRange(entryArray, entryArray.length/2, entryArray.length);
        System.out.println(Arrays.toString(secondSplit));
        splitArray(secondSplit);



        return entryArray;
    }
}
