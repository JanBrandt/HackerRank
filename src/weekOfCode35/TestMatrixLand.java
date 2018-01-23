package weekOfCode35;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMatrixLand {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Test
  public void testMatrixLandTrivials() {
    int[][] A = {{1}};
    MatrixLand ML = new MatrixLand(A);
    assertEquals("Failed for Matrix A in Trivials", 1, ML.calc());
    int[][] B = {{1,1}, {1,1}};
    ML = new MatrixLand(B);
    assertEquals("Failed for Matrix B in Trivials", 4, ML.calc());
    int[][] C = {{0,0},{0,1}};
    ML = new MatrixLand(C);
    assertEquals("Failed for Matrix C in Trivials", 1, ML.calc());
    int[][] D = {{0,0,1},{1,0,0}};
    ML = new MatrixLand(D);
    assertEquals("Failed for Matrix D in Trivials", 2, ML.calc() );
    int[][] E = {{0,0,0},{0,1,0}};
    ML = new MatrixLand(E);
    assertEquals("Failed for Matrix E in Trivials", 1, ML.calc() );
  }
  
  @Test
  public void testMatrixSample() {
    int[][] A = {{1, 2, 3, -1, -2},
        {-5, -8, -1, 2, -150},
        {1, 2, 3, -250, 100},
        {1, 1, 1, 1, 20}};
    MatrixLand ML = new MatrixLand(A);
    assertEquals("Sample fails", 37, ML.calc());
  }
  
  @Test
  public void testMatrixLandNegatives() {
    int[][] A = {{-11}};
    MatrixLand ML = new MatrixLand(A);
    assertEquals("Failed for Matrix A in Negatives", -11, ML.calc());
    int[][] B = {{1,-1}, {-1,1}};
    ML = new MatrixLand(B);
    assertEquals("Failed for Matrix B in Negatives", 1, ML.calc());
    int[][] C = {{0,-6},{0,6}};
    ML = new MatrixLand(C);
    assertEquals("Failed for Matrix C in Negatives", 6, ML.calc());
    int[][] D = {{0,0,1},{-1,0,-1}};
    ML = new MatrixLand(D);
    assertEquals("Failed for Matrix D in Negatives", 1, ML.calc() );
    int[][] E = {{-1,-2,-3},{-1,2,3}};
    ML = new MatrixLand(E);
    assertEquals("Failed for Matrix E in Negatives", 3, ML.calc() );
  }
  
  @Test
  public void testMatrixBiggerMatrixes() {
    int[][] A = {{0, 0, -2, 0, 3},
        {-2, -2, 0, 1, 1},
        {2, 20, -5, -5, -5},
        {0, -10, 9, 8, -1}};
    MatrixLand ML = new MatrixLand(A);
    assertEquals("Big 1 fails", 37, ML.calc());
    int[][] B = {{0, -2, 2, 0},
        {0, -2, 20, -10},
        {-2, 0, -5, 9},
        {0, 1, -5, 8},
        {3,1,-5,-1}};
    ML = new MatrixLand(B);
    assertEquals("Big 2 fails", 32, ML.calc());
  }

}
