package model;
import java.util.Comparator;
import java.util.Objects;

public class PersonComparator implements Comparator<Person> {


        public int compare(Person p1, Person p2){
            return p1.getName().compareTo(p2.getName());
        }
    }



