package lessones.one.obstacles;

import lessones.one.participant.Skills;
import lessones.one.participant.Team;

public class Course {

    Obstacles[] obstacles;

    public Course(Obstacles... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        Skills[] pp = team.getParticipant();
        System.out.println("Команда " + team.getNameTeam() + " проходит полосу препятсвий");
        for (Skills p : pp) {
            System.out.println("Участник " + p.getClass().getSimpleName() + ":");
            for (Obstacles o : obstacles) {
                o.doSkill(p);
                if (!p.result()) break;
            }
            System.out.println();
        }
    }
}
