package algorithms.implemenations;

import java.awt.Point;
import java.util.HashSet;

/**
 * @author Jan Brandt
 * @version 0.11 26/01/2018
 *
 */
public class QueensAttacksII {

    static int queensAttack(final int n, final int k, final int r_q,
                            final int c_q, HashSet<Point> obstacles) {
      int result = 0;
      int posX = r_q;
      int posY = c_q;
      int[][] move = {{1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1},
                      {0, -1}, {1, -1}};
      int moveX;
      int moveY;
      for (int i = 0; i < 8; i++) {
          moveX = move[i][0];
          moveY = move[i][1];
          posX = r_q;
          posY = c_q;
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

