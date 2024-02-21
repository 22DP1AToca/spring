package rvt.Exercises.EnumIterator;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    List<Person> employeeList = new ArrayList<Person>();

    public void add(Person personToAdd){
        employeeList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        for (Person person : peopleToAdd) {
            employeeList.add(person);
        }
    }

    public void print(){
        for (Person person : employeeList) {
            System.out.println(person.toString());
        }
    }

    public void print(Education education){

    }
}



