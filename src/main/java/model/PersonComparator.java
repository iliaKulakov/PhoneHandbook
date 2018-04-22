package model;
import java.util.Comparator;
import java.util.Objects;

public class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            // Для строк и некоторых других классов можно использовать метод compareTo.
            return o1.getName().compareTo(o2.getName());
        }

}

