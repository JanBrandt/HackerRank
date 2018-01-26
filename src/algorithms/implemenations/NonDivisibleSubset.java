package algorithms.implemenations;

/**
 * @author Jan Brandt
 * @version 0.1 24/01/2018
 *
 */
public class NonDivisibleSubset {
  
  public static int nonDivisibleSubset(int k, int[] arr) {
    int result = 0;
    int[] remainders = new int[k];
    for (int i = 0; i < arr.length; i++) {
      remainders[arr[i]%k]++;
    }
    if (remainders[0] > 0) result++; //Max one item with remainder zero
    for (int i = 1; i <= remainders.length/2; i++) {
      if ((2*i)%k == 0) { //If remainders is k/2, also only one item may be added
        if (remainders[i]> 0) result++;
      } else {
        int max = Math.max(remainders[i], remainders[k-i]);
        result += max;
      }
    }
    return result;
  }

}
