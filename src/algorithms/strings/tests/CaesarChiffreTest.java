package algorithms.strings.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import algorithms.strings.CaesarChiffre;

public class CaesarChiffreTest {

  @Test
  public void testCaesarCipheSample() {
    String input = "middle-Outz";
    final int k = 2;
    String result = CaesarChiffre.caesarCipher(input, k);
    String output = "okffng-Qwvb";
    assertEquals("Sample", output, result);
  }

}
