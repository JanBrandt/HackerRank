/**
 * Class to solve the problem CeasarChiffre from HackerRank.
 * https://www.hackerrank.com/challenges/caesar-cipher-1/problem
 */
package algorithms.strings;

/**
 * @author Jan Brandt
 * @version 0.1 27/01/2018
 *
 */
public final class CaesarChiffre {
  final static int ALPHABET_LENGTH = 26;

  /**
   * Private constructor to prevent instancing.
   */
  private CaesarChiffre() { }

  public static String caesarCipher(final String s, final int k) {
    String result = "";
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] > 64 && chars[i] < 91) {
        chars[i] += k;
        while (chars[i] >= 91) {
          chars[i] -= ALPHABET_LENGTH;
        }
      } else if (chars[i] > 96 && chars[i] < 123) {
        chars[i] += k;
        while (chars[i] >= 123) {
          chars[i] -= ALPHABET_LENGTH;
        }
      }
      result += chars[i];
    }
    return result;
}

}
