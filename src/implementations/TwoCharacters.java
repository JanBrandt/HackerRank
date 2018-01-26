package implementations;

/**
 * @author Jan Brandt
 * @version 0.01 25/01/2018
 *
 */
public final class TwoCharacters {
  static final int SHIFT = 97;
  static final int NUMLETTERS = 26;

  /**
   * No constructor for this class.
   */
  private TwoCharacters() {
  }

  /**
   * @param s Given String for the problem, should be reduced to an alternating
   * two-character-String
   * @return Returns the length of the longest valid string or 0 if no solution
   * is possible
   */
  public static int twoCharacters(final String s) {
    int result = 0;
    if (s.length() < 2) {
      return result;
    }
    int[][] chars = new int[NUMLETTERS][NUMLETTERS];
    int[][] count = new int[NUMLETTERS][NUMLETTERS];
    char[] word = s.toCharArray();
    for (int i = 0; i < word.length; i++) {
      int characterAsInt = (int) word[i] - SHIFT;

      for (int row = 0; row < NUMLETTERS; row++) {
        if (chars[characterAsInt][row] == word[i]) {
          count[characterAsInt][row] = -1;
        } else if (count[characterAsInt][row] != -1) {
          count[characterAsInt][row]++;
          chars[characterAsInt][row] = word[i];
        }
      }

      for (int line = 0; line < NUMLETTERS; line++) {
        if (chars[line][characterAsInt] == word[i]) {
          count[line][characterAsInt] = -1;
        } else if (count[line][characterAsInt] != -1) {
          count[line][characterAsInt]++;
          chars[line][characterAsInt] = word[i];
        }
      }
    }
    for (int i = 0; i < count.length; i++) {
      for (int j = 0; j < count.length; j++) {
        result = Math.max(result, count[i][j]);
      }
    }
    return result;
  }

}
