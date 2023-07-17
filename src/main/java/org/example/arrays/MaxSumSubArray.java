package org.example.arrays;

public class MaxSumSubArray {

  public int solution(int[] input) {
    int currSum = input[0];
    int maxSum = input[0];
    for (int num : input) {
      currSum = currSum + num;
      if (currSum < 0) {
        currSum = 0;
      }
      maxSum = Math.max(currSum, maxSum);
    }
    return maxSum;
  }
}
