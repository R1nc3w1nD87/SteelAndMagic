package steelandmagic.monsters;

public abstract class MonsterImpl implements Monster {
    private int lifePoints;
    private int actionPoints = 10;

    protected void setLifePoints(int points){
        this.lifePoints = points;
    }

    @Override
    public void resetActionPoints() {
        this.actionPoints = 10;
    }

    @Override
    public boolean canAct() {
        return actionPoints > 0;
    }

    @Override
    public void takeActionPoints(int points) {
        this.actionPoints = actionPoints - points;
    }

    @Override
    public boolean isAlive() {
        return lifePoints > 0;
    }

    @Override
    public void takeLifePoints(int points) {
        this.lifePoints = lifePoints - points;
    }
}
