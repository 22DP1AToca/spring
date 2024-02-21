package rvt.Exercises.EnumIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Part2
        Person anna = new Person("Anna", Education.PHD);
        System.out.println(anna);

        System.out.println();

        //Part 3
        Employee employee1 =  new Employee();
    
        Person kika = new Person("Kika", Education.BA);
        List<Person> person = new ArrayList<Person>();
        person.add(kika);
        person.add(anna);

        employee1.add(anna);
        employee1.add(person);

        employee1.print();

    }
}
