package algorithms.implementations.tests;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import algorithms.implementations.ClimbingLeaderboard;

/**
 * @author Jan Brandt
 * @version 1.0 27/01/2018
 * Contains the tests for the ClimbingLeaderboard-Problem from HackerRank
 */
public class ClimbingLeaderboardTest {

  /** Test from HackerRank. */
  @Test
  public void testClimbingLeaderboardSample() {
    int[] scores = {100, 100, 50, 40, 40, 20, 10};
    int[] alice = {5, 25, 50, 120};
    int[] results = {6, 4, 2, 1};
    assertArrayEquals("Sample 1", results,
                      ClimbingLeaderboard.climbingLeaderboard(scores, alice));
  }

  /** Simple tests of edgeCases. */
  @Test
  public void testClimbingLeaderboardSimple() {
    int[] scores = {100};
    int[] alice = {1};
    int[] results = {2};
    assertArrayEquals("Simple test 1", results,
          ClimbingLeaderboard.climbingLeaderboard(scores, alice));

    scores[0] = 100;
    alice[0] = 101;
    results[0] = 1;
    assertArrayEquals("Simple test 2", results,
          ClimbingLeaderboard.climbingLeaderboard(scores, alice));
  }

  /** Small test with 3 entrys. */
  @Test
  public void testClimbingLeaderboardSequenz() {
    int[] scores = {100, 100, 100, 99};
    int[] alice = {1, 100, 150};
    int[] results = {3, 1, 1};
    assertArrayEquals("Simple test 3", results,
          ClimbingLeaderboard.climbingLeaderboard(scores, alice));
  }
}
