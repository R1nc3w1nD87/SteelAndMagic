package steelandmagic.monsters;

public interface Monster {

    String getName();

    int getDamage();

    void resetActionPoints();

    boolean isAlive();

    boolean canAct();

    void takeLifePoints(int points);

    void takeActionPoints(int points);
}