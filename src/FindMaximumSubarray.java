/**
 *
 * @author Patrick Mulvihill
 * CMPT 438: Algorithms
 * Dr. Tian
 * Project 3
 * pmulvihill01@manhattan.edu
 * https://github.com/PatMulvihill/LinearMaxSubArray
 * This program solves the maximum sub-array problem in 0(n) time.
 * The linear approach consists of iterating through the entire array starting at
 * index 0 and ending at index n.  Along the way, we must keep track of the maximum
 * sub-array seen so far.  We eventually return that sum.
 */

import java.util.Arrays;

public class FindMaximumSubarray {
    
    public static int findMaximumSubarray(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    
    public static void main(String[] args) {
        FindMaximumSubarray fmsa = new FindMaximumSubarray();
        
        int[] dataArr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubArray = fmsa.findMaximumSubarray(dataArr1);
        System.out.println("data array = " + Arrays.toString(dataArr1));
        System.out.println("The Maximum subarray for the above data array is: " + maxSubArray);
        
        int[] dataArr2 = {-4, -2, -7, -4, -8, -6, -2, -9, -1, -3, -4};
        maxSubArray = fmsa.findMaximumSubarray(dataArr2);
        System.out.println("\ndata array = " + Arrays.toString(dataArr2));
        System.out.println("The Maximum subarray for the above data array is: " + maxSubArray);
        
        int[] dataArr3 = {-4, -2, -7, -4, -8, 0, -2, -9, -1, -3, -4};
        maxSubArray = fmsa.findMaximumSubarray(dataArr3);
        System.out.println("\ndata array = " + Arrays.toString(dataArr3));
        System.out.println("The Maximum subarray for the above data array is: " + maxSubArray);
        
        int[] dataArr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        maxSubArray = fmsa.findMaximumSubarray(dataArr4);
        System.out.println("\ndata array = " + Arrays.toString(dataArr4));
        System.out.println("The Maximum subarray for the above data array is: " + maxSubArray);
    }
}
