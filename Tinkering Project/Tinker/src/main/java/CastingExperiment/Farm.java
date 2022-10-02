package CastingExperiment;

import Quicksort.Quicksort;
import Quicksort.Quicksort.*;

public class Farm {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();

        Dog myPup = new Puppy();

//        Puppy pup = new Dog(); Doesn't work

        Dog pup = new Puppy();
        Puppy pupper = (Puppy) pup;

        myPuppy.welp();
        myPup.makeNoise();
//        Dog myDog = new Dog();
//        Animal yourDog = (Animal) myDog;
//        Cat myCat = new Cat(4);
//        Actor anActor = new Cat(3);
//        //Puppy pup = (Puppy) new Dog();
//        Dog puppyDog = new Puppy();
//        yourDog.specialAttack();
//        //Animal a = new Animal();
//        //Since Animal is an abstract class, it cannot be instantiated.
//        Animal myAnimal = new Cat(4);

//        Cat yourCat = new Animal();

        /**
         * Testing out how to use packages in other packages, using my quicksort program.
         */
//        double[] arrayToBeSorted = {5.0, 2.0, 3.0, 4.0};
//        for (int i = 0; i < arrayToBeSorted.length; i++) {
//            System.out.println(Quicksort.quickSort(arrayToBeSorted).get(i));
//        }

    }

    public static void printNoise(Animal animal){
        animal.makeNoise();
        if(animal instanceof Dog){
            System.out.println(((Dog) animal).runSpeed());
        }
        else if(animal instanceof Cat){
            System.out.println(((Cat) animal).getNumLegs());
        }
    }
}
