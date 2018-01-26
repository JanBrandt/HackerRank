package implementations;

import java.util.Arrays;
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
    //System.out.println(Arrays.toString(chars));
    for (int j = 0; j < chars.length - 1; j++) {
      for (int j2 = j + 1; j2 < chars.length; j2++) {
        String toRemove = "[^" + chars[j] + chars[j2] + "]";
        //System.out.println(toRemove);
        String aktString = workS.replaceAll(toRemove, "");
        //System.out.println(aktString);
        if (isValidTwoCharacterString(aktString)) {
          if (aktString.length() > result) {
            result = aktString.length();
          }
        }
      }
    }
    return result;
  }

  /**
   * @param s The String that is to be tested.
   * @return Returns true if s is valid, otherwise false
   */
  private static boolean isValidTwoCharacterString(final String s) {
    boolean result = true;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i - 1) == s.charAt(i)) {
        result = false;
        break;
      }
    }
    return result;
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
