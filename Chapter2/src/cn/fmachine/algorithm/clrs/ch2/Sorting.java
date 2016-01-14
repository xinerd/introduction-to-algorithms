package cn.fmachine.algorithm.clrs.ch2;

/**
 * InsertionSort
 * COPYRIGHT ©2014-2024, FMACHINE.CN, ALL RIGHTS RESERVED
 *
 * @author XIN MING
 * @since 1/13/16
 */
public class Sorting {


    /**
     * 2.1 Insertion Sort
     * Exercises 2.1-2
     *
     * @param candidate    Unsorted Array
     * @param isIncreasing is true on default, if value is false then do decreasing order
     */
    public static void insertionSort(double[] candidate, boolean isIncreasing) {
        for (int j = 1; j < candidate.length; j++) {
            double key = candidate[j];
            int i = j - 1;
            if (isIncreasing) {
                while (i >= 0 && candidate[i] > key) {
                    candidate[i + 1] = candidate[i];
                    i--;
                }
            } else {
                while (i >= 0 && candidate[i] < key) {
                    candidate[i + 1] = candidate[i];
                    i--;
                }
            }
            candidate[i + 1] = key;
        }
    }


}
