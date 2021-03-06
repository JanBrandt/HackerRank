package algorithms.implementations;

/**
 * @author Jan Brandt
 * @version 1.0 27/01/2018
 */
public final class ClimbingLeaderboard {

  /** Private constructor prevents class from beeing instanced. */
  private ClimbingLeaderboard() { }

  /**
   * @param scores The leaderboard
   * @param alice The scores alice did
   * @return The placings alice archieved with her scores
   */
  public static int[] climbingLeaderboard(final int[] scores,
                                          final int[] alice) {
    int[] result = new int[alice.length];

    int[] shrinkedScores = shrinkScores(scores);

    for (int i = 0; i < alice.length; i++) {
      int toSearch = alice[i];
      int index;
      if (toSearch > shrinkedScores[0]) {
        index = 0;
      } else if (toSearch < shrinkedScores[shrinkedScores.length - 1]) {
        index = shrinkedScores.length;
      } else {
        int lowerBound = shrinkedScores.length - 1;
        if (i != 0) {
          lowerBound = result[i - 1];
        }
        index = binSearch(shrinkedScores, toSearch, lowerBound);
      }
      result[i] = index + 1;
    }
    return result;
  }

  /**
   * @param scores The highscoreboard
   * @param alice Alice score in the actual round
   * @param lowerBound Alice placing in last round
   * @return The place in highscore Alice archieve with the new score
   */
  private static int binSearch(final int[] scores, final int alice,
                        final int lowerBound) {
    int upper = 0;
    int lower = lowerBound;
    while (lower - upper > 1) {
      int index = (lower + upper) / 2;
      if (scores[index] < alice) {
        lower = index;
      } else if (scores[index] > alice) {
        upper = index;
      } else {
        upper = index;
        break;
      }
    }
    if (scores[upper] != alice) {
      upper++;
    }
    return upper;
  }

  /**
   * @param scores The highscore-table with dublicates
   * @return The highscore-table without dublicates
   */
  private static int[] shrinkScores(final int[] scores) {
    int diffScores = 1;
    int lastScore = scores[0];
    for (int i = 1; i < scores.length; i++) {
      if (scores[i] < lastScore) {
        diffScores++;
        lastScore = scores[i];
      }
    }
    int[] result = new int[diffScores];
    result[0] = scores[0];
    int index = 0;
    for (int i = 1; i < scores.length; i++) {
      if (scores[i] < result[index]) {
        index++;
        result[index] = scores[i];
      }
    }
    return result;
  }

}
