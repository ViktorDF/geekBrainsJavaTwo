package lessones.one.obstacles;

import lessones.one.participant.Skills;
import lessones.one.participant.Team;

public class Wall extends Obstacles{
    private int highWall;

    public Wall(int highWall) {
        this.highWall = highWall;
    }

    @Override
    public void doSkill(Skills sk) {
            sk.jump(highWall);
    }
}
