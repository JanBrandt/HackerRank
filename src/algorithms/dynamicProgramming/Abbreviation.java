/**
 * Solution for https://www.hackerrank.com/challenges/abbr/problem
 * Status: not fully functional due to timeouts
 */
package algorithms.dynamicProgramming;

/**
 * @author Jan Brandt
 * @version 0.9 27/01/18
 *
 */
public final class Abbreviation {

  /** Private constructor prevents class from beeing instanced. */
  private Abbreviation() { }

  /**
   * @param a Input string 1, that should be abbreviated to b certain rules.
   * @param b Input string 2, target string.
   * @return Returns true if abbreviation is possible, false if not.
   */
  public static boolean abbreviation(final String a, final String b) {
    if (b.length() > a.length()) {
      return false;
    }
    if (b.length() == 0) {
      return a.toLowerCase().equals(a);
    }
    if (Character.toUpperCase(a.charAt(0)) == a.charAt(0)) {
      if (a.charAt(0) == b.charAt(0)) {
        return abbreviation(a.substring(1), b.substring(1));
      } else {
        return false;
      }
    }  else if (Character.toUpperCase(a.charAt(0)) == b.charAt(0)) {
      return abbreviation(a.substring(1), b.substring(1))
             || abbreviation(a.substring(1), b);
    } else if (Character.toUpperCase(a.charAt(0)) != b.charAt(0)) {
      return abbreviation(a.substring(1), b);
    }
    return false;
  }
}
