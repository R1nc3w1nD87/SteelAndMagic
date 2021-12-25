package steelandmagic.classes;

import steelandmagic.weapons.Weapon;

public abstract class RoleImpl implements Role {

    private int lifePoints;
    private int maxLifePoints;
    private int actionPoints = 10;
    String name;
    Weapon weapon;

    public RoleImpl(String name){
        this.name = name;
    }

    protected void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    protected void setMaxLifePoints(int maxLifePoints){this.maxLifePoints = maxLifePoints;}

    protected void setWeapon(Weapon weapon){this.weapon = weapon;}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void resetActionPoints() {
        actionPoints = 10;
    }

    @Override
    public int getMaxLifePoints(){
        return maxLifePoints;
    }

    @Override
    public int getLifePoints() {
        return lifePoints;
    }

    @Override
    public boolean isAlive() {
        return lifePoints > 0;
    }

    @Override
    public boolean canAct() {
        return actionPoints > 0;
    }

    @Override
    public void takeLifePoints(int points) {
        lifePoints = lifePoints - points;
    }

    @Override
    public void takeActionPoints(int points) {
        actionPoints = actionPoints - points;
    }
}