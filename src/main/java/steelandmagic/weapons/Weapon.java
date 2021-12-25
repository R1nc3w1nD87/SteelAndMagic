package steelandmagic.weapons;

public enum Weapon {
    Sword(10),
    Staff(15),
    Dagger(20);

    private final int damage;

    Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
}
