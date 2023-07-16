package org.example.arrays;

public class MaxProductSubArray {

  public int solution(int[] input) {

    if(input.length == 0)
      return 0;

    int result = input[0];

    int currentMax =1, currentMin = 1;

    for (int num : input) {
      if (num == 0) {
        currentMin = 1;
        currentMax = 1;
        continue;
      }

      int temp =currentMin;
      currentMin = findMin(num * currentMax, num * currentMin, num);
      currentMax = findMax(num * currentMax, num * temp, num);
      result =findMax(result, currentMin, currentMax);
    }

    return result;
  }

  private static int findMax(int x, int y, int z){
    int r = Math.max(x,y);
    return Math.max(r,z);
  }


  private static int findMin(int x, int y, int z){
    int r = Math.min(x,y);
    return Math.min(r,z);
  }
}
