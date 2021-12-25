package steelandmagic.classes;

import steelandmagic.weapons.Weapon;

public interface Role {

    String getName();

    Weapon getWeapon();

    void resetActionPoints();

    int getLifePoints();

    int getMaxLifePoints();

    boolean isAlive();

    boolean canAct();

    void takeLifePoints(int points);

    void takeActionPoints(int points);
}