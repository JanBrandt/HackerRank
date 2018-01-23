/**
 *
 */
package crackingTheCodeInterview;

import java.util.Comparator;

/**
 * @author Jan Brandt
 * @version 0.01 11/14/17
 */
public class Checker implements Comparator<Player> {

  /**
   * 
   */
  public Checker() {
    // TODO Auto-generated constructor stub
  }
  
  public int compare(Player one, Player two) {
    int result;
    if (one.getScore() > two.getScore()) result = 1;
    else if (one.getScore() == two.getScore()) {
      return one.getName().compareTo(two.getName());
    } else result = -1;
    return result;
  }

}
