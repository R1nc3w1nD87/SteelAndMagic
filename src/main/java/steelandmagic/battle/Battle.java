package steelandmagic.battle;

import steelandmagic.classes.Role;
import steelandmagic.monsters.Monster;

import java.util.List;

public class Battle {

    Role role;
    Monster monster;
    List<Monster> dungeon;

    public void engageMonster(Role role, Monster monster) {
        this.role = role;
        this.monster = monster;
        engage(role, monster);
        if (role.isAlive()) {
            System.out.printf("%s has defeated a %s with %d/%d life remaining%n", role.getName(), monster.getName(), role.getLifePoints(), role.getMaxLifePoints());
        }else{
            System.out.printf("%s has been defeated by a %s%n", role.getName(), monster.getName());
        }
    }

    public void engageDungeon(Role role, List<Monster> dungeon) {
        this.role = role;
        this.dungeon = dungeon;
        int i = 0;
        for (Monster monster : dungeon) {
            engage(role, monster);
            i++;
        }
        if (role.isAlive()) {
            System.out.printf("%s has defeated " + i + " monsters with %d/%d life remaining%n", role.getName(), role.getLifePoints(), role.getMaxLifePoints());
        }else{
            System.out.printf("After killing " + (i-1) + " monsters, %s has been defeated by ", role.getName());
            String printResult = "";
                    if (dungeon.get(i-1).getName().charAt(0) == 'a' ||
                         dungeon.get(i-1).getName().charAt(0) == 'e' ||
                         dungeon.get(i-1).getName().charAt(0) == 'u' ||
                         dungeon.get(i-1).getName().charAt(0) == 'i' ||
                         dungeon.get(i-1).getName().charAt(0) == 'o'){
                         printResult = String.format("an %s%n", dungeon.get(i-1).getName());
                    }else{
                         printResult = String.format("a %s%n", dungeon.get(i-1).getName());
                    }
            System.out.print(printResult);
        }

    }

    private void engage(Role role, Monster monster) {
        while (role.isAlive() && monster.isAlive()) {
            if (role.canAct()) {
                monster.takeLifePoints(role.getWeapon().getDamage());
                role.takeActionPoints(5);
                if (monster.canAct()) {
                    role.takeLifePoints(monster.getDamage());
                    monster.takeActionPoints(5);
                }
            }
            nextTurn();
        }
    }

    public void nextTurn() {
        role.resetActionPoints();
        monster.resetActionPoints();
    }
}