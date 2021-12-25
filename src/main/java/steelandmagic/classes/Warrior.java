package steelandmagic.classes;


import steelandmagic.weapons.Weapon;

public class Warrior extends RoleImpl {

    public Warrior(String name) {
        super(name);
        super.setLifePoints(200);
        super.setMaxLifePoints(200);
        super.setWeapon(Weapon.Sword);
    }

}