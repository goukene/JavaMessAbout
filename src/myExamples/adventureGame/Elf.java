package myExamples.adventureGame;
/**
 * Created by robert.chisholm on 19/03/2015.
 */
public class Elf implements Character {

    @Override
    public int health() {
        return 80;
    }

    @Override
    public int strength() {
        return 5;
    }

    @Override
    public int intelligence() {
        return 9;
    }

    @Override
    public int magic() {
        return 2;
    }

    @Override
    public int swords() {
        return 3;
    }

    @Override
    public int bows() {
        return 10;
    }
}
