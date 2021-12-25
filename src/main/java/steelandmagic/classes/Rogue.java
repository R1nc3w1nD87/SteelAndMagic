package steelandmagic.classes;

import steelandmagic.weapons.Weapon;

public class Rogue extends RoleImpl {

    public Rogue(String name) {
        super(name);
        super.setLifePoints(150);
        super.setMaxLifePoints(150);
        super.setWeapon(Weapon.Dagger);
    }

}