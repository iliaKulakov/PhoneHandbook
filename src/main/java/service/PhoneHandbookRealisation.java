package service;

import model.Person;

import java.util.ArrayList;

//Реализация методов работы с коллекцией таких как добавление пользователя и т.д.
public class PhoneHandbookRealisation implements IphoneHandbookRepository {
    ArrayList<Person> personList = new ArrayList<Person>();


    @Override
    //Не совсем понимаю, как получать входные параметры, то есть аргументы для метода добавления информации
    //потому что у меня должен быть инициализирован конструктор
    //Одно дело я вызову в мейне метод, там у меня уже обьект будет
    //а при реализации тестить просто на заданных переменных?
    //сейчас пока просто входные параметры кладу в array List1
    //    TODO: http://www.oracle.com/technetwork/java/codeconvtoc-136057.html
//    TODO: http://translatedby.com/you/java-code-conventions/into-ru/?page=2

    public void addUser(String name, String surname, int year) {
        personList.add(new Person(name, surname, year));
        personList.add(new Person(name, surname, year)); //делает копию элемента для теста
        for (Person str : personList) {
            System.out.println(str + " тестовый вывод ссылки на обьект");


        }//for
    }//addUser

    //Тут пытаюсь сделать поиск по обьектам коллекции - заготовка
    //Когда делаю метод поиска в аргументы метода поиска экземпляры обьекта передавать лучше? уже инициализированные
    public void toSearchForItems() {
        //Для экспериментов решил инициализиовать сперва обьект Person, потом уже инициализированный
        //обьект добавлять в коллекцию (мне показалось это будет возможно чем сделано выше в методе addUser)
        //Создаю три разных обьекта класса Person (чтобы было с чем работать)
        Person personvar1 = new Person("Vihhta", "fgsdgsfd", 1234);
        Person personvar2 = new Person("dsdsds", "чываыаввы", 4536);
        Person personvar3 = new Person("test", "авпвыапыв", 4132);
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(personvar2);
        personList.add(personvar1);
        personList.add(personvar3);
        System.out.println("------------Размер коллекции------------------");
        System.out.println(personList.size());
        //Прохожу по элементам коллекции
        //for (int i=0; i < personList.size(); i++)
        // for (int i=0; i < 3; i++)
        //{
        //разобрался в своей ошибке применял функцию хеш-кода к экземпляру коллекции, а не элементам внутри
        int hCode;
        int hCode1;
        hCode = personvar1.hashCode();
        hCode1 = personvar2.hashCode();
        System.out.println(hCode);
        System.out.println(hCode1);
        //  }
    }//toSearchForItems


    //Застопорился вот тут, на вход для поиска получаю коллекцию
    // думаю что в качестве аргумента еще подавать на вход корректнее для поиска
    public void toSearchItem2(ArrayList<Person> personList) {

        this.personList = personList;

        System.out.println(personList.size());
        // System.out.println(personList.contains());
        String personListString = "";
        for (int i = 0; i < personList.size(); i++) {
            personListString = personListString + personList.get(i) + " ";
            Person object = personList.get(i);// не придумал с утра ничего лучше как просто брать обьект из коллекции
            int hash = object.hashCode();
            System.out.println(hash); //смотрю, что хэши действительно разные


        }
        System.out.println(personListString); //пример печати содержимого обьектов коллекции

    }


}





