package org.example.dp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MaxProductSubArrayTest {


  private int[] input;
  private int expectedValue;

  public MaxProductSubArrayTest(int[] input, int expectedValue) {
    this.input = input;
    this.expectedValue = expectedValue;
  }


  @Parameterized.Parameters(name = "Test case {index}: input={0}, expected={1}")
  public static Collection<Object[]> data1() {
    return Arrays.asList(new Object[][]{
        {new int[]{1, 2, 3, -2, -8,}, 96},
        {new int[]{1, 2, 3, -2, 8,}, 8},
        {new int[]{1, 2, 3, 0, 2, 3, 4}, 24},
        {new int[]{-1, -2, -3}, 6},
        {new int[]{0, 0, 0, 2, 3}, 6},
    });
  }


  @Test
  public void solution() {
    MaxProductSubArray subArray = new MaxProductSubArray();
    int result = subArray.solution(input);
    Assert.assertEquals(result, expectedValue);
  }

}