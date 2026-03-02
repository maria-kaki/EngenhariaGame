package domain;

public class Player {
    private String name;
    private int score;

    public Player(String name){
        this.name = name;
        this.score = 0;
    }

    public void addScore(int points){
        score += points;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }
}
