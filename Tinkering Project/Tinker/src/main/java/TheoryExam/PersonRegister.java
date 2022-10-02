package TheoryExam;

import java.util.ArrayList;

public class PersonRegister {

    static int nonConstant = 5;
    static ArrayList<Person> persons = new ArrayList<>();

    //The parameter can be non-constant
    public static void createList(int numberDesired){
        Person newPerson = new Person(1, "t");
        newPerson.setNonConstantTo6();
        for(int i = 0; i < nonConstant; i++){
            persons.add(new Person(1, "A"));
        }

    }

    public static void listAllPersons2()
    {
        int index = 0;
        while (index < persons.size())
        {
            Person person = persons.get(index);
            System.out.println( person.getName());

            index++;
        }
    }

    public static void main(String[] args) {
        createList(1);
        listAllPersons2();
    }

}
