package algorithms.strings.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import algorithms.strings.TwoCharacters;

/**
 * @author Jan Brandt
 * Tests for Class TwoCharacter, providing tests and Sample from HackerRank
 */
public class TwoCharactersTest {


  /** Sample from HackerRank for minimal test. */
  @Test
  public void testTwoCharactersSample() {
    String s = "beabeefeab";
    int result = TwoCharacters.twoCharacters(s);
    assertEquals("Sample 1", 5, result);
  }

  /** TestCases with very small Strings.  */
  @Test
  public void testTwoCharactersEdgeCase() {
    String s = "";
    int result = TwoCharacters.twoCharacters(s);
    assertEquals("Edge case 1", 0, result);
    s = "a";
    result = TwoCharacters.twoCharacters(s);
    assertEquals("Edge case 2", 0, result);

    s = "aa";
    result = TwoCharacters.twoCharacters(s);
    assertEquals("Edge case 3", 0, result);

    s = "ab";
    result = TwoCharacters.twoCharacters(s);
    assertEquals("Edge case 4", 2, result);
  }

}
