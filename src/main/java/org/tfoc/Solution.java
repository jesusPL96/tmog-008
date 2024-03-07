package org.tfoc;


/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static int search(
            int[] nums,
            int target) {

        return binarySearch(nums, target, 0, nums.length-1);
    }

    public static int binarySearch (int[] nums, int target, int start, int end){

        int half = (start+end)/2;
        if(nums[half] == target){
            return half;
        } else if(start>=end){
            return -1;
        } else {
            if(target>nums[half]){
                return binarySearch(nums, target, half+1, end);
            } else{
                return binarySearch(nums, target, start, half-1);
            }
        }

    }

}
