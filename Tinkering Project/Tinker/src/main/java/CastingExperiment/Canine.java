package CastingExperiment;

public interface Canine {
    default void wagTail(){
        System.out.println("Tail is wagging!");
    }
    String runSpeed();
}
