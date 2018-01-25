package implementations;

import java.util.HashSet;

/**
 * @author Jan Brandt
 * @version 0.01 25/01/2018
 *
 */
public final class TwoCharacters {

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
    int i = 1;
    String workS = s;
    while (i < workS.length() - 1) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        Character c = s.charAt(i);
        workS = workS.replace(c.toString(), "");
        i = 0;
      }
      i++;
    }
    Character[] chars = getCharacters(workS);
    if (isValidTwoCharacterString(workS)) {
      if (workS.length() > result) {
        result = workS.length();
      }
    }
    System.out.println(workS);
    return result;
  }

  /**
   * @param s The String that is to be tested.
   * @return Returns true if s is valid, otherwise false
   */
  private static boolean isValidTwoCharacterString(final String s) {
    return false;
  }

  /**
   * @param s Given String which characters are counted
   * @return An Array of Characters, which are contained in s
   */
  private static Character[] getCharacters(final String s) {
    HashSet<Character> chars = new HashSet<Character>();
    for (int i = 0; i < s.length(); i++) {
      chars.add(s.charAt(i));
    }
    Character[] result = new Character[chars.size()];
    chars.toArray(result);
    return result;
  }

}
