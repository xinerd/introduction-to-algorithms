package cn.fmachine.algorithm.clrs.ch2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * SortingTest
 * COPYRIGHT ©2014-2024, FMACHINE.CN, ALL RIGHTS RESERVED
 *
 * @author XIN MING
 * @since 1/13/16
 */
public class SortingTest {

    @Test
    public void testInsertionSort() throws Exception {
        double[] candidate = new double[]{8, 1, 2, 9, 5, 4, 3, 6, 7};
        double[] sorted = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        Sorting.insertionSort(candidate, true);
        for (int index = 0; index < sorted.length; index++) {
            assertEquals(sorted[index], candidate[index], 0);
        }
    }


    @Test
    public void testInsertionSortDecreasing() throws Exception {
        double[] candidate = new double[]{8, 1, 2, 9, 5, 4, 3, 6, 7};
        double[] sorted = new double[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        Sorting.insertionSort(candidate, false);

        for (int index = 0; index < sorted.length; index++) {
            assertEquals(sorted[index], candidate[index], 0);
        }
    }
}