package character;

public abstract class Character {
    private String name;
    private int level, hp, mp, exp,gold,offense_power;

    public Character(String name, int level, int hp, int mp, int exp, int gold, int offense_power) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.mp = mp;
        this.exp = exp;
        this.gold = gold;
        this.offense_power = offense_power;
    }

    public abstract int attack();
}
