package org.example.dp.sum;

import java.util.ArrayList;
import java.util.List;

public class HowTargetSum_Recursion_UseOnce {

  public List<List<Integer>> solution(int target, int[] inputs) {
    List<List<Integer>> solutionSet = new ArrayList<>();
    List<Integer> currentValues = new ArrayList<>();
    solution(target, inputs, solutionSet, currentValues, 0);
    return solutionSet;
  }

  private void solution(int target,
                        int[] inputs,
                        List<List<Integer>> solutions,
                        List<Integer> currentValues,
                        int position) {
    if (target == 0) {
      solutions.add(new ArrayList<>(currentValues));
      return;
    }

    if (target < 0) {
      return;
    }

    if (position > inputs.length - 1 || inputs[position] > target) {
      return;
    }

    if(position > 0 && inputs[position] == inputs[position-1]){
      return;
    }

    for (int index = position; index < inputs.length; index++) {
      int item = inputs[index];
      int rem = target - item;
      List<Integer> copyValues = new ArrayList<>(currentValues);
      copyValues.add(item);
      solution(rem, inputs, solutions, copyValues, index + 1);
    }
  }
}
