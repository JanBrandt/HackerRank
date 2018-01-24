package implementations.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import implementations.NonDivisibleSubset;

public class NonDivisibleSubsetTest {

  @Test
  public void testNonDivisibleSubsetSample() {
    NonDivisibleSubset nds = new NonDivisibleSubset();
    int[] array= {1,7,2,4};
    int k = 3;
    int result = nds.nonDivisibleSubset(k, array);
    assertEquals("Sample 1", 3, result);
  }

}
