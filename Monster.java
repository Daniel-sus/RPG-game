public class Monster extends Character {
    int expToGive;

    public Monster(int stamina, int mana, int hp, int exp) {
        super(stamina, mana, hp, "monster");
        this.expToGive = exp;
    }

    public void getStats() {
        super.getStats();
    }
}
