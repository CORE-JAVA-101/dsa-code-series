package org.example.dp.word;

import org.junit.Test;

public class WordLadderRecursionTest {

  // https://www.enjoyalgorithms.com/blog/edit-distance
  @Test
  public void solution() {
    String x = "cut";
    String y = "cat";
    int result = new EditDistance().solution(x, y, x.length(), y.length());
    System.out.println(result);
  }
}