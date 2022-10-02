package InterfaceInheritance;

public interface Class1 {
    void somethingClass1();
    boolean trueOrFalseClass1();
    void getS();
    default void getB(){
        System.out.println("yo yo");
    }

}
