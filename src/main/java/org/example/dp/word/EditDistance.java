package org.example.dp.word;

public class EditDistance {

  public int solution(String x, String y, int m, int n){
    if(n == 0){
      return m;
    }
    if(m == 0){
      return n;
    }
    if(x.charAt(m-1) == y.charAt(n-1)){
      return solution(x, y, m-1, n-1);
    }

    int deleteFromSecond = solution(x, y, m, n-1 );
    int deleteFromFirst = solution(x, y, m-1, n);
    int replaceInBoth = solution(x, y, m-1,n-1);
    int minValue = Math.min(deleteFromFirst, deleteFromSecond);
    minValue = Math.min(minValue, replaceInBoth);
    return 1 + minValue;
  }
}
