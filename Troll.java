public class Troll extends Character {

    @Override
    public void introduce() {
        System.out.println("I am a Troll, the enemy of this land!");
    }

    public void crouch() {
        System.out.println("*The Troll jumps...*");
    }

    public void run() {
        System.out.println("*The Troll runs...*");
    }

}