package myExamples.adventureGame;

/**
 * Created by robert.chisholm on 19/03/2015.
 */
public class Warrior implements Character {

    @Override
    public int health() {
        return 120;
    }

    @Override
    public int strength() {
        return 10;
    }

    @Override
    public int intelligence() {
        return 3;
    }

    @Override
    public int magic() {
        return 1;
    }

    @Override
    public int swords() {
        return 10;
    }

    @Override
    public int bows() {
        return 3;
    }
}
