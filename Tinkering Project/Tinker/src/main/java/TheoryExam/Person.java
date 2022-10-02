package TheoryExam;

public class Person {
    private int height;
    private String name;

    public Person(int height, String name) {
        this.height = height;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNonConstantTo6(){
        PersonRegister.nonConstant = 6;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
