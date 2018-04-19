package service;
import model.Person;
import java.util.ArrayList;
public final class SingleArrayListCollection {
        public static ArrayList<Person> personList2 = new ArrayList<>();
        private static SingleArrayListCollection _instance = null;

        private SingleArrayListCollection() {
        }

        public static  SingleArrayListCollection getInstance() {
            if (_instance == null)
                _instance = new SingleArrayListCollection();
            return _instance;
        }



    }







