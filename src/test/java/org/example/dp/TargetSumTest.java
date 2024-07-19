package org.example.dp;

import org.example.dp.sum.HowTargetSum_Memo;
import org.example.dp.sum.HowTargetSum_Recursion;
import org.example.dp.sum.HowTargetSum_Tabulation;
import org.example.dp.sum.Shortest_HowTargetSum_Recursion;
import org.example.dp.sum.Shortest_HowTargetSum_Tabulation;
import org.example.dp.sum.TargetSumExists_Memo;
import org.example.dp.sum.TargetSumExists_Recursion;
import org.example.dp.sum.TargetSumExists_Tabulation;
import org.junit.Test;

import java.util.Arrays;

public class TargetSumTest {

  /**
   * 2. return the combination [] for target sum
   */
  @Test
  public void combination_TargetSum() {
    int[] arr = {2, 3, 4};
    int target = 7;
    //RECURSION: find one of the combination for targetsum
    HowTargetSum_Recursion recursion = new HowTargetSum_Recursion();
    int[] result = recursion.solution(target, arr);
    System.out.println(Arrays.toString(result));

    //MEMO: find one of the combination for targetsum
    HowTargetSum_Memo memo = new HowTargetSum_Memo();
    Integer[] resultMemo = memo.solution(target, arr);
    System.out.println(Arrays.toString(resultMemo));

    //TABULATION: find one of the combination for targetsum
    HowTargetSum_Tabulation tabulation = new HowTargetSum_Tabulation();
    int[] resultTab = tabulation.solution(target, arr);
    System.out.println(Arrays.toString(resultTab));
  }

  @Test
  public void shortestLengthCombinationForTargetSum(){

    int[] arr = {2, 3, 4};
    int target = 7;

    //TABULATION: find one of the shortest combination for targetsum
    Shortest_HowTargetSum_Tabulation shortest_howTargetSum_tabulation = new Shortest_HowTargetSum_Tabulation();
    int[] result1 = shortest_howTargetSum_tabulation.solution(target, arr);
    System.out.println(Arrays.toString(result1));

    //RECURSION: find one of the shortest combination for targetsum
    Shortest_HowTargetSum_Recursion recursion = new Shortest_HowTargetSum_Recursion();
    int[] result2 = recursion.solution(target, arr);
    System.out.println(Arrays.toString(result2));


  }
  /**
   * 1. target sum exists
   */
  @Test
  public void targetSumExists()
  {
    int[] arr = {2, 3, 4};
    int target = 7;

    //RECURSION: targetSum exists
    TargetSumExists_Recursion targetSumExists_recursion = new TargetSumExists_Recursion();
    boolean flag = targetSumExists_recursion.solution(target, arr);
    System.out.println(flag);

    //MEMO: targetSum exists
    TargetSumExists_Memo memo = new TargetSumExists_Memo();
    flag = memo.solution(target, arr);
    System.out.println(flag);

    //TABULATION: targetSum exists
    TargetSumExists_Tabulation tabulation = new TargetSumExists_Tabulation();
    flag = tabulation.solution(target, arr);
    System.out.println(flag);
  }
}