package crackingTheCodeInterview;

public class Player {
  private String name;
  private int score;

  public Player() {
    this.name = "Not named";
    this.score = 0;
  }
  
  public Player(String n, int s) {
    this.name = n;
    this.score = s;
  }
  
  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

}
