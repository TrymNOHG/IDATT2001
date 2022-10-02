package CastingExperiment;

public class Dog extends Animal implements Canine{
    @Override
    public String runSpeed() {
        return "A dog's average run speed is around 10 km per hour.";
    }

    @Override
    public void makeNoise(){
        //super.makeNoise();
        //This super of the abstract method will call the abstract methods purpose in here.
        System.out.println("Woof woof");
    }

    @Override
    public void specialAttack() {
        System.out.println("Cheer up people");
    }

}
