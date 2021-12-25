package steelandmagic.monsters;

public class Imp extends MonsterImpl {

    public Imp(){
        super.setLifePoints(40);
    }

    @Override
    public String getName() {
        return "imp";
    }

    @Override
    public int getDamage() {
        return 8;
    }
}
