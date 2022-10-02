package Streams;

public class StreamTest {
    public static void main(String[] args) {
        StudentRegister studentRegister = new StudentRegister();

        System.out.println("Is there a 30 year old student should be true: "
                + studentRegister.checkIfThereIsAStudentByAge(30));
        System.out.println("Is there a 0 year old student should be false: "
                + studentRegister.checkIfThereIsAStudentByAge(0));

        System.out.println(studentRegister.filterTheListByAgeInterval(0, 20));

        for(String name : studentRegister.mapAllNamesOfStudent()){
            System.out.println(name + ", ");
        }

    }
}
