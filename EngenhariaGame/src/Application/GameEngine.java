package Application;

import domain.Mission;
import domain.Player;
import Service.BasicMissionValidatorService;
import Service.AdvancedMissionValidatorService;

public class GameEngine {
    private BasicMissionValidatorService validator;
    private AdvancedMissionValidatorService validadorAdvanced;

    public GameEngine(){
        this.validator = new BasicMissionValidatorService();
        this.validadorAdvanced = new AdvancedMissionValidatorService();
    }

    public boolean executeMission(Player player, Mission mission){
        boolean sucess = validator.validate(mission);
        boolean sucess_advanced = validadorAdvanced.validate(mission);

        if (sucess_advanced){
            player.addScore(mission.getDifficulty() * 20);
        }
        else if (sucess){
            player.addScore(mission.getDifficulty() * 10);
        }
        else {
            player.addScore(-5);
        }

        return sucess;
    }
}
