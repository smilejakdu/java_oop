package character;

public class Warrior extends Character {
    private int rage;

    public Warrior(String name, int level, int hp, int mp, int exp, int gold,int offense_power, int rage) {
        super(name, level, hp, mp, exp, gold,offense_power);
        this.rage = rage;
    }

    @Override
    public int attack() {
        return 0;
    }
}
