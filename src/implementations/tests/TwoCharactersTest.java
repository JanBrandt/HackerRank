package implementations.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import implementations.TwoCharacters;

/**
 * @author Jan Brandt
 * Tests for Class TwoCharacter, providing tests and Sample from HackerRank
 */
public class TwoCharactersTest {


  /**
   * Sample from HackerRank for minimal test.
   */
  @Test
  public void testTwoCharactersSample() {
    String s = "beabeefeab";
    int result = TwoCharacters.twoCharacters(s);
    assertEquals("Sample 1", 5, result);
  }

}
