package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

  public void solution(int[] arr) {

    List<List<Integer>> solutions = new ArrayList<>();

    solution(arr, 0, new ArrayList<>(), solutions);

    System.out.println(solutions);

  }

  private void solution(int[] arr, int index,
                        List<Integer> current,
                        List<List<Integer>> solutions){
    if(index == arr.length){
      solutions.add(new ArrayList<>(current));
      return;
    }
    current.add(arr[index]);
    solution(arr, index + 1, new ArrayList<>(current), solutions);

    current.remove(current.size() -1);
    solution(arr, index+1, new ArrayList<>(current), solutions);
  }
}
