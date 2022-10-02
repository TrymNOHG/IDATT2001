package Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRegister implements Iterable<Student>{
    private List<Student> studentList;

    public StudentRegister() {
        this.studentList = new ArrayList<>();
        this.studentList.add(new Student("Trym", 19));
        this.studentList.add(new Student("Sarah", 20));
        this.studentList.add(new Student("Eirik", 30));
        this.studentList.add(new Student("Leon", 23));
        this.studentList.add(new Student("Tomas", 20));
    }

    /**
     * Method to test stream.anyMatch
     * @param age
     * @return
     */
    public boolean checkIfThereIsAStudentByAge(int age){
        return this.studentList.stream().anyMatch(student -> student.getAge() == age);
    }

    /**
     * Method to test stream.filter()
     * @param lowerBound
     * @param higherBound
     * @return
     */
    public List<Student> filterTheListByAgeInterval(int lowerBound, int higherBound){
        return this.studentList.stream().filter(student -> student.getAge() >= lowerBound && student.getAge() <= higherBound).toList();
    }

    /**
     * Method to test stream.map()
     * @return
     */
    public List<String> mapAllNamesOfStudent(){
        //The lambda can also be written using to colons:
        /*
                return this.studentList.stream().map(Student::getName).toList();
         */
        return this.studentList.stream().map(student -> student.getName()).toList();
    }

    /**
     * Method to test stream. .reduce()
     * @return
     */
    public Integer reduceListToOldestAge(){
        return this.studentList.stream().map(student -> student.getAge()).reduce(Math::max).get();
    }

    //Could I use stream to find the biggest difference in ages (I would most likely need reduce last). (Hint, filter first and then first and last).
    //Could I find the smallest difference?
    //What are all the ages multiplied? (Hint: use reduce)

    @Override
    public Iterator<Student> iterator() {
        return null;
    }
}
