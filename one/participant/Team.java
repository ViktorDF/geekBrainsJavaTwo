package lessones.one.participant;

import java.util.Random;

public class Team {

    private String nameTeam;
    private Skills[] participant;

    public Team(String nameTeam, Skills ... participant) {
        this.nameTeam = nameTeam;
        this.participant = participant;
    }

    public void showResults() {
        for (Skills s: participant) {
            if (s.result())
            System.out.println("Участник " +
                    s.getClass().getSimpleName() +
                    " прошел полосу перпятсивий");
        }
    }

    public void showResultsAll() {
        for (Skills s: participant) {
            System.out.println("Участник " +
                    s.getClass().getSimpleName() +
                    ":\nРезультат преодоления дорожки: " + s.resultRun() +
                    "\nРезультат преодоления стены: " + s.resultJump());
        }
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public Skills[] getParticipant(){
        return participant;
    }
}
