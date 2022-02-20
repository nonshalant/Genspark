public class Human {
    int strength;
    int health;

    //constructor
    public Human(){
        strength = (int) Math.floor(Math.random() * 50);
        health = 100;
    }

    public Human(int strength, int health){
        this.strength = strength;
        this.health = health;
    }

    public int getStrength(){
        return strength;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Goblin attack(Goblin goblin){
        goblin.setHealth(getHealth() - this.strength);
        return goblin;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
