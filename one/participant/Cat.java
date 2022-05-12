package lessones.one.participant;

public class Cat implements Skills {

    private int maxRun;
    private int maxJump;
    private boolean resultJump;
    private boolean resultRun;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        resultJump = true;
        resultRun = true;
    }
    @Override
    public boolean resultJump() {
        return resultJump;
    }
    @Override
    public boolean resultRun() {
        return resultRun;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println("пробежал");
            resultRun = true;
        } else resultRun = false;
    }

    @Override
    public void jump(int high) {
        System.out.println("перепрыгнул");
        if (high <= maxJump) {
            resultJump = true;
        } else resultJump = false;
    }

    @Override
    public boolean result() {
        return resultRun && resultJump;
    }
}
