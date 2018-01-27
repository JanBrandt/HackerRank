package algorithms.strings.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import algorithms.strings.CaesarChiffre;

/**
 * @author Jan Brandt
 * @version 0.5 27/01/2018
 * Test for the utility-class CaesarChiffre.
 */
public class CaesarChiffreTest {

  /**
   * Sample-test from HackerRank.
   */
  @Test
  public void testCaesarCipheSample() {
    String input = "middle-Outz";
    final int k = 2;
    String result = CaesarChiffre.caesarCipher(input, k);
    String output = "okffng-Qwvb";
    assertEquals("Sample", output, result);
  }

  /**
   * Tests for edgeCases (start, end of alphabet, non-alphabet chars).
   */
  @Test
  public void testCaesarCipheEdgeCases() {
    String input = "a";
    final int k = 26;
    String result = CaesarChiffre.caesarCipher(input, k);
    String output = "a";
    assertEquals("Sample", output, result);

    input = "Z";
    final int l = 3;
    result = CaesarChiffre.caesarCipher(input, l);
    output = "C";
    assertEquals("Sample", output, result);

    input = "ijk";
    final int m = 1858;
    result = CaesarChiffre.caesarCipher(input, m);
    output = "uvw";
    assertEquals("Sample", output, result);

    input = ".-,/";
    final int n = 17;
    result = CaesarChiffre.caesarCipher(input, n);
    output = ".-,/";
    assertEquals("Sample", output, result);
  }

}
