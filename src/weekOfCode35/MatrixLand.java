package weekOfCode35;

import java.util.Arrays;

public class MatrixLand {
  private int[][] A1;
  private int m1;
  private int n1;
  
  public MatrixLand(int[][] A) {
    this.A1 = A;
    n1 = A.length;
    m1 = A[0].length;
  }
  
  public int calc() {
    return matrixLand(A1, n1, m1);
  }
  
  public int matrixLand(int[][] A, int n, int m) {
    int[][] Path = new int[n][m];
    for(int A_i = 0; A_i < n; A_i++){
      for(int A_j = 0; A_j < m; A_j++){
          // Erste Zeile ausfüllen
          if (A_i == 0) {
            if (A_j == 0) {
              Path[A_i][A_j] = A[A_i][A_j];

            } else {
              Path[A_i][A_j] = Path[A_i][A_j-1] + A[A_i][A_j];

              int j = A_j;
              while (j>0) {
                if (Path[A_i][j] > Path[A_i][j-1]) {
                  Path[A_i][j-1] = Path[A_i][j];
                }
                j--;
              }
            }
          } else { //ab 2. Zeile
            nextPathLine(A[A_i], Path[A_i-1], Path[A_i]);
          }
        }
        //printZeile(Path[A_i]);
    }
    int max = Integer.MIN_VALUE;
    for(int A_j = 0; A_j < m; A_j++){
      if (max < Path[n-1][A_j]) max = Path[n-1][A_j];
    }
    return max;
  }
  
  public void printZeile(int[] Zeile) {
    System.out.println(Arrays.toString(Zeile));
  }
  
  private int bestInterval(int[] A, int min, int max) {
    int aktMax = Integer.MIN_VALUE;
    if (min == 0) {
      int sum = 0;
      for(int i = max; i >= 0;i--) {
        sum += A[i];
        aktMax = sum > aktMax ? sum : aktMax;
      }
    } else {
      int sum = 0;
      for(int i = min; i < max;i++) {
        sum += A[i];
        aktMax = sum > aktMax ? sum : aktMax;
      }
    }
    return aktMax;
  }
  
  public void nextPathLine(int[] A, int[] Path, int[] nextLine) {
    int size = A.length;
    for (int i = 0; i<size; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = 0; j<size; j++) {
        int sum =  Path[j];
        if (i == j) {
          sum += A[i];
          int left = bestInterval(A, 0, i-1);
          int right = bestInterval(A, i+1, size);
          sum = sum + left + right;
        } else if (i < j) {
          for (int k = i; k<=j;k++) {
            sum += A[k]; 
          }
          int left = bestInterval(A, 0, i-1);
          int right = bestInterval(A, j+1, size);
          sum = sum + left + right;
        } else if (i > j) {
          for (int k = i; k>=j;k--) {
            sum += A[k]; 
          }
          int left = bestInterval(A, 0, j-1);
          int right = bestInterval(A, i+1, size);
          sum = sum + left + right;
        }
        max = sum > max ? sum : max;
      }
      nextLine[i] = max;
    }
  }
  
}
