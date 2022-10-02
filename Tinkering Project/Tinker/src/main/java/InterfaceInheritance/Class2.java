package InterfaceInheritance;

public interface Class2 {
    void somethingElseClass2();
    boolean againTrueOrFalseButDifferentClass2();
    void getS();
    default void getB(){
        System.out.println("Yeah yeah");
    }
}
