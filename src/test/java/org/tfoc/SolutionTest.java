package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    @Test
    void testSolutionEvenLength() {

        int[] nums = {1, 2, 5, 7, 9, 11, 14, 18};
        int target = 14;
        var result = Solution.search(nums, target);

        assertEquals(6, result);
    }

    @Test
    void testSolutionOddLength() {

        int[] nums = {1, 2, 5, 7, 9, 11, 14, 18, 21};
        int target = 14;
        var result = Solution.search(nums, target);

        assertEquals(6, result);
    }

    @Test
    void testNotFoundOnArray() {

        int[] nums = {1, 2, 5, 7, 9, 11, 14, 18, 21};
        int target = 4;
        var result = Solution.search(nums, target);

        assertEquals(-1, result);
    }

    @Test
    void testLengthOfOne() {

        int[] nums = {1};
        int target = 1;
        var result = Solution.search(nums, target);

        assertEquals(0, result);
    }


}