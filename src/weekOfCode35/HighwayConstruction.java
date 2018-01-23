package weekOfCode35;

public class HighwayConstruction {

  public HighwayConstruction() {
    // TODO Auto-generated constructor stub
  }
  
  public int highwayConstruction(long n, int k) {
    int result = 0;
    for (int i = 2; i <= n-1; i++) {
      result += Math.pow(i,k);
    }
    return result;
  }

}
