/**
 * Solution for https://www.hackerrank.com/challenges/abbr/problem
 * Status: not fully functional due to timeouts
 */
package algorithms.dynamicProgramming;

/**
 * @author Jan Brandt
 * @version 1.1 11/30/17
 *
 */
public class Abbreviation {

  public boolean abbreviation(final String a, final String b) {
    if (b.length() > a.length()) return false;
    if (b.length() == 0) {
      if (a.toLowerCase().equals(a)) {
        return true;
      } else {
        return false;
      }
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
