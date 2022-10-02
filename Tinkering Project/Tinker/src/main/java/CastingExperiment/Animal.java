package CastingExperiment;

public abstract class Animal extends Actor{
    public void makeNoise(){
        System.out.println("Animal noise!");
    }
    private void secretMethod(){
    }
    public abstract void specialAttack();

}
