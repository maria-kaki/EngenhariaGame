package Service;

import domain.Player;

public class ScoreService {

    public void addPoints(Player player, int points) {
        int newScore = player.getScore() + points;
        player.setScore(newScore);
    }
}
