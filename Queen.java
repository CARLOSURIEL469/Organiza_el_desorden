public class Queen extends Character {

    @Override
    public void introduce() {
        System.out.println("I am the Queen of this land!");
    }

    public void crouch() {
        System.out.println("*The Queen jumps...*");
    }

    public void run() {
        System.out.println("*The Queen runs...*");
    }

}