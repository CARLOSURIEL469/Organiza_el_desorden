public class Knight extends Character {

    @Override
    public void introduce() {
        System.out.println("I am the Kngiht of this land!");
    }

    @Override
    public void crouch() {
        System.out.println("*The Knight jumps...*");
    }

    public void run() {
        System.out.println("*The Knight runs...*");
    }

}