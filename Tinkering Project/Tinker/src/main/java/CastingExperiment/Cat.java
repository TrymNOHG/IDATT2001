package CastingExperiment;

import java.time.LocalDate;

public class Cat extends Animal{
    private int numLegs;

    public Cat(int numLegs) {
        this.numLegs = numLegs;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void specialAttack() {
        System.out.println("Sleeps all day");
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }
}
