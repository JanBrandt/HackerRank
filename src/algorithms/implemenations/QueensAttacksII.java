package algorithms.implemenations;

import java.util.*;
import java.awt.Point;

public class QueensAttacksII {

    static int queensAttack(int n, int k, int r_q, int c_q, HashSet<Point> obstacles) {
      int result = 0;
      int posX = r_q;
      int posY = c_q;
      int[][] move = {{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
      int moveX;
      int moveY;
      for (int i = 0; i<8; i++) {
          moveX = move[i][0];
          moveY = move[i][1];
          posX = r_q;
          posY = c_q;
          boolean border = false;
          while (!border) {
              posX += moveX;
              posY += moveY;
              if (posX < 1 || posX > n) border = true;
              else if (posY < 1 || posY > n) border = true;
              else if (obstacles.contains(new Point(posX, posY))) border = true;
              else result++;
          }
      }
      return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int r_q = in.nextInt();
        int c_q = in.nextInt();
        HashSet<Point> obstacles = new HashSet<Point>();
        for(int obstacles_i = 0; obstacles_i < k; obstacles_i++){
            int x = in.nextInt();
            int y = in.nextInt();
            obstacles.add(new Point(x,y));
        }
        int result = queensAttack(n, k, r_q, c_q, obstacles);
        System.out.println(result);
        in.close();
    }
}

