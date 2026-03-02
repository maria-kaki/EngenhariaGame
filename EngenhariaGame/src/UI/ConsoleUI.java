package UI;

import Application.GameEngine;
import domain.Player;
import domain.Mission;

public class ConsoleUI {

    public static void main(String[] args) {

        Player player = new Player("Maria Clara");
        GameEngine gameEngine = new GameEngine();

        System.out.println("Score inicial: " + player.getScore());

        Mission mission1 = new Mission("Missão Fácil", 4);
        boolean result1 = gameEngine.executeMission(player, mission1);

        System.out.println("Missão: " + mission1.getName());
        System.out.println("Sucesso: " + result1);
        System.out.println("Score atual: " + player.getScore());

        Mission mission2 = new Mission("Missão Média", 5);
        boolean result2 = gameEngine.executeMission(player, mission2);

        System.out.println("\nMissão: " + mission2.getName());
        System.out.println("Sucesso: " + result2);
        System.out.println("Score atual: " + player.getScore());

        Mission mission3 = new Mission("Missão Difícil", 7);
        boolean result3 = gameEngine.executeMission(player, mission3);

        System.out.println("\nMissão: " + mission3.getName());
        System.out.println("Sucesso: " + result3);
        System.out.println("Score final: " + player.getScore());
    }
}
