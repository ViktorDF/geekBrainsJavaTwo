package lessones.one.obstacles;

import lessones.one.participant.Skills;
import lessones.one.participant.Team;

public class Treadmill extends Obstacles{
    private int lengthTreadmill;

    public Treadmill(int lengthTreadmill) {
        this.lengthTreadmill = lengthTreadmill;
    }

    @Override
    public void doSkill(Skills sk) {
            sk.run(lengthTreadmill);
    }
}
