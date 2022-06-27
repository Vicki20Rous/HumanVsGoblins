public class Humans {
    Goblins goblins = new Goblins();
    private int health = 100;
    private int strength = 100;

    public Humans() {

    }

    public Humans(int health, int strength) {
        this.health = health;
        this.strength = strength;

    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

   @Override
    public String toString () {
        return "Humans";
   }
}
