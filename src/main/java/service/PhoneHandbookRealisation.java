package service;

import model.Person;

import java.util.ArrayList;

//Реализация методов работы с коллекцией таких как добавление пользователя и т.д.
public class PhoneHandbookRealisation implements IphoneHandbookRepository {
    @Override
    //Не совсем понимаю, как получать входные параметры, то есть аргументы для метода добавления информации
    //потому что у меня должен быть инициализирован конструктор
    //Одно дело я вызову в мейне метод, там у меня уже обьект будет
    //а при реализации тестить просто на заданных переменных?
    //сейчас пока просто входные параметры кладу в array List1
    //    TODO: http://www.oracle.com/technetwork/java/codeconvtoc-136057.html
//    TODO: http://translatedby.com/you/java-code-conventions/into-ru/?page=2
    public void addUser(String name, String surname, int year) {
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person(name, surname, year));
        for (Person str : personList) {
            System.out.println(str + " тестовый вывод ссылки на обьект");

        }
    }
}





