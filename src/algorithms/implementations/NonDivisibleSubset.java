package algorithms.implementations;

/**
 * @author Jan Brandt
 * @version 0.9 26/01/2018
 */
public final class NonDivisibleSubset {

  /** Private constructor prevents class from being instanced. */
  private NonDivisibleSubset() { }

  /**
   * @param k The number the sum of two members of the subset may not be
   * divisible by.
   * @param arr Array of numbers to choose subset of.
   * @return The size of the calculated subset of arr.
   */
  public static int nonDivisibleSubset(final int k, final int[] arr) {
    int result = 0;
    int[] remainders = new int[k];
    for (int i = 0; i < arr.length; i++) {
      remainders[arr[i] % k]++;
    }
    if (remainders[0] > 0) {
      result++; //Max one item with remainder zero
    }
    for (int i = 1; i <= remainders.length / 2; i++) {
      if ((2 * i) % k == 0) {
        //If remainders is k/2, also only one item may be added
        if (remainders[i] > 0) {
          result++;
        }
      } else {
        int max = Math.max(remainders[i], remainders[k - i]);
        result += max;
      }
    }
    return result;
  }

}
