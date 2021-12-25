package steelandmagic;

import steelandmagic.battle.Battle;
import steelandmagic.classes.*;
import steelandmagic.monsters.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Role warrior = new Warrior("Arthur");
        Monster goblin = new Goblin();
        Battle battle = new Battle();

        battle.engageMonster(warrior, goblin);

        List<Monster> dungeon = new ArrayList<>();

        fillDungeon(dungeon);

        battle.engageDungeon(warrior, dungeon);
    }

    private static void fillDungeon(List<Monster> dungeon) {
        dungeon.add(new Goblin());
        dungeon.add(new Goblin());
        dungeon.add(new Goblin());
        dungeon.add(new Goblin());
        dungeon.add(new Goblin());
        dungeon.add(new Imp());
        dungeon.add(new Imp());
        dungeon.add(new Imp());
        dungeon.add(new Imp());
        dungeon.add(new Imp());
        dungeon.add(new Imp());
        dungeon.add(new Direwolf());
        dungeon.add(new Direwolf());
        dungeon.add(new Direwolf());
            }
        }