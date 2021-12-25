package steelandmagic.monsters;

public class Goblin extends MonsterImpl {

    public Goblin(){super.setLifePoints(30);}

    @Override
    public String getName() {
        return "goblin";
    }

    @Override
    public int getDamage() {
        return 5;
    }
}