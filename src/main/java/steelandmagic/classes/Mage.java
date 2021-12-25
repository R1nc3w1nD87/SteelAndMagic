package steelandmagic.classes;

import steelandmagic.weapons.Weapon;

public class Mage extends RoleImpl {

    public Mage(String name) {
        super(name);
        super.setLifePoints(175);
        super.setMaxLifePoints(175);
        super.setWeapon(Weapon.Staff);
    }

}