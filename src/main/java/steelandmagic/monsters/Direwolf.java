package steelandmagic.monsters;

public class Direwolf extends MonsterImpl {

    public Direwolf() {
        super.setLifePoints(60);
    }

    @Override
    public String getName() {
        return "direwolf";
    }

    @Override
    public int getDamage() {
        return 10;
    }
}
