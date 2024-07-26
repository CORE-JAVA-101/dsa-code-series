package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class KCombination {
  public String[] solution(int[] arr, int k) {
    List<List<Integer>> list = new ArrayList<>();
    traverse(list, new ArrayList<>(), arr, 0, k);
    System.out.println(list);
    return null;
  }

  public void traverse(List<List<Integer>> output,
                                      List<Integer> current,
                                      int[] arr,
                                      int index,
                                      int k) {

    if (current.size() == k) {
      output.add(new ArrayList<>(current));
    }

    if(index > arr.length-1){
      System.out.println(current);
      return;
    }
    else {
      current.add(arr[index]); // inclusion
      traverse(output, current, arr, index + 1, k);

      current.remove(current.size()-1); // exclusion
      traverse(output, current, arr, index + 1, k);
    }
  }
}

