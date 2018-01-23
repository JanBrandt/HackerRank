package projectEuler.tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import projectEuler.SumOfMultiplesOf3And5;

public class TestSumOfMultiplesOf3And5 {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Test
  public void testSumOfMultiplesOf3And5Sample() {
    SumOfMultiplesOf3And5 sum = new SumOfMultiplesOf3And5();
    int result = sum.sumOfMultiplesOf3And5(10);
    assertEquals("Sample 1 from HackerRank", 23, result);
    result = sum.sumOfMultiplesOf3And5(100);
    assertEquals("Sample 2 from HackeRank", 2318, result);
  }

}
