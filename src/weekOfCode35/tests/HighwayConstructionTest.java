package weekOfCode35.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import weekOfCode35.HighwayConstruction;

public class HighwayConstructionTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Test
  public void testHighwayConstructionSample() {
    HighwayConstruction hc = new HighwayConstruction();
    assertEquals("Sample fails", 13, hc.highwayConstruction(4, 2));
  }

}
