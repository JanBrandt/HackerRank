package algorithms.implementations;

import java.awt.Point;
import java.util.HashSet;

/**
 * @author Jan Brandt
 * @version 0.9 27/01/2018
 */
public final class QueensAttacksII {

 /** Private constructor prevents class from beeing instanced. */
private QueensAttacksII() { }
    /**
     * @param n Size of the board
     * @param rowQueen Row-position of the queen
     * @param columnQueen Column-position of the queen
     * @param obstacles Set of obstacles that hinder the queen
     * @return Number of fields the queen can be moved to.
     */
    static int queensAttack(final int n, final int rowQueen,
                            final int columnQueen,
                            final HashSet<Point> obstacles) {
      int result = 0;
      int posX = rowQueen;
      int posY = columnQueen;
      int[][] move = {{1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1},
                      {0, -1}, {1, -1}};
      int moveX;
      int moveY;
      for (int i = 0; i < 8; i++) {
          moveX = move[i][0];
          moveY = move[i][1];
          posX = rowQueen;
          posY = columnQueen;
          boolean border = false;
          while (!border) {
              posX += moveX;
              posY += moveY;
              if (posX < 1 || posX > n) {
                border = true;
              } else if (posY < 1 || posY > n) {
                border = true;
              } else if (obstacles.contains(new Point(posX, posY))) {
                border = true;
              } else {
                result++;
              }
          }
      }
      return result;
    }

}

