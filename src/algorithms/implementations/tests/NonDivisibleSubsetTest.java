package algorithms.implementations.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import algorithms.implementations.NonDivisibleSubset;

/**
 * @author Jan Brandt
 * @version 0.9 27/01/2018
 */
public class NonDivisibleSubsetTest {

  /** Test-sample from HackerRank. */
  @Test
  public void testNonDivisibleSubsetSample() {
    int[] array = {1, 7, 2, 4};
    int k = 3;
    int result = NonDivisibleSubset.nonDivisibleSubset(k, array);
    assertEquals("Sample 1", 3, result);
  }

  /** Simple testcases. */
  @Test
  public void testNonDivisibleSubsetSimple() {
    int[] array = {3};
    int k = 3;
    int result = NonDivisibleSubset.nonDivisibleSubset(k, array);
    assertEquals("Simple tests 1", 1, result);
    int[] array2 = {3, 6, 7, 8};
    k = 3;
    result = NonDivisibleSubset.nonDivisibleSubset(k, array2);
    assertEquals("Simple tests 1", 2, result);
    int[] array3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    k = 10;
    result = NonDivisibleSubset.nonDivisibleSubset(k, array3);
    assertEquals("Simple tests 1", 6, result);
  }

}
