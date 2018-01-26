package algorithms.implemenations;

/**
 * @author Jan Brandt
 * @version 0.9 23/01/2018
 *
 */
public class ClimbingLeaderboard {
  
  public int[] climbingLeaderboard(int[] scores, int[] alice) {
    int[] result = new int[alice.length];
    
    int[] shrinkedScores = shrinkScores(scores);
    
    for (int i = 0; i < alice.length; i++) {
      int toSearch = alice[i];
      int index;
      if (toSearch > shrinkedScores[0]) {
        index = 0;
      } else if (toSearch < shrinkedScores[shrinkedScores.length-1]) {
        index = shrinkedScores.length;
      } else {
        int lowerBound = shrinkedScores.length-1;
        if (i != 0) lowerBound = result[i-1];
        index = binSearch(shrinkedScores, toSearch, lowerBound);
      }
      result[i] = index + 1; 
    }
    return result;
  }
  
  private int binSearch(int[] scores, int alice, int lowerBound) {
    int upper = 0;
    int lower = lowerBound;
    while (lower - upper > 1) {
      int index = (lower + upper)/2;
      if (scores[index] < alice) {
        lower = index;
      } else if (scores[index] > alice) {
        upper = index;
      } else {
        upper = index;
        break;
      }
    }
    if(scores[upper] != alice) upper++;
    return upper;
  }
  
  private int[] shrinkScores(int[] scores) {
    int diffScores = 1;
    int lastScore = scores[0];
    for (int i = 1; i< scores.length; i++) {
      if (scores[i] < lastScore) {
        diffScores++;
        lastScore = scores[i];
      }
    }
    int[] result = new int[diffScores];
    result[0] = scores[0];
    int index = 0;
    for (int i = 1; i< scores.length; i++) {
      if (scores[i] < result[index]) {
        index++;
        result[index] = scores[i];
      }
    }
    return result;
  }

}
