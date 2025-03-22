package com.example.project.Binary_Search;

public class BinarySearch {
    // implements binary search on the elements list for target,
    // and returns the index at which the target is found;
    // -1 if not found.
    public static int binarySearch(int[] elements, int target) {
        int loopCounter = 0; // for testing
        int leftIdx = 0;   // TODO: assign this initial value
        int rightIdx = elements.length - 1; // TODO: assign this initial value

        while (rightIdx > leftIdx) {  // TODO: determine this condition (hint: see slides 61-63)
            loopCounter++; // for testing
            System.out.print(loopCounter + " "); // for testing
            int middleIdx =  (leftIdx + rightIdx) / 2 ;
            int current = elements[middleIdx];

            if (current == target) {
                return middleIdx;

            } else if (current > target) {
                rightIdx = middleIdx - 1;

            } else {
                leftIdx = middleIdx + 1;
            }
        }


        if (leftIdx == rightIdx) {
            if (elements[leftIdx] == target) {
                return leftIdx;
            }
        }
        return -1; // not found
    }  
}

