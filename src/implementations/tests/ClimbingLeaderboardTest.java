package implementations.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import implementations.ClimbingLeaderboard;

public class ClimbingLeaderboardTest {

  @Test
  public void testClimbingLeaderboardSample() {
    int[] scores = {100,100,50,40,40,20,10};
    int[] alice = {5,25,50,120};
    ClimbingLeaderboard cl = new ClimbingLeaderboard();
    int[] results = {6,4,2,1};
    assertArrayEquals(results, cl.climbingLeaderboard(scores,alice));
  }
  
  @Test
  public void testClimbingLeaderboardSimple() {
    int[] scores = {100};
    int[] alice = {1};
    ClimbingLeaderboard cl = new ClimbingLeaderboard();
    int[] results = {2};
    assertArrayEquals(results, cl.climbingLeaderboard(scores,alice));
    
    scores[0] = 100;
    alice[0] = 101;
    results[0] = 1;
    assertArrayEquals(results, cl.climbingLeaderboard(scores,alice));
  }
  
  @Test
  public void testClimbingLeaderboardSequenz() {
    int[] scores = {100,100,100,99};
    int[] alice = {1,100,150};
    ClimbingLeaderboard cl = new ClimbingLeaderboard();
    int[] results = {3,1,1};
    assertArrayEquals(results, cl.climbingLeaderboard(scores,alice));
  }

}
