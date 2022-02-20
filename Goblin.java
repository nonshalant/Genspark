import java.awt.*;

public class Goblin extends Component {
     int strength;
     int health;

    //Constructor
    public Goblin(int strength, int health){
        this.strength =strength;
        this.health = health;
    }

    public Goblin(){
        strength = (int) Math.floor(Math.random() * 100);
        health = 200;
     }

    public int getStrength(){
        return strength;
    }

    public int getHealth(){
        return health;
    }

    public void setStrength(int str){
        this.strength =str;
    }

    public void setHealth(int hp){
        this.health = hp;
    }

    public Human attack(Human person){
        person.setHealth(getHealth() - this.strength);
        return person;
    }

    @Override
    public String toString() {
        return super.toString();
    }
};



