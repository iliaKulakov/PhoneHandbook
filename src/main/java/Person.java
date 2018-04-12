import java.util.ArrayList;

public class Person {
    int year;
    String name;
    String surname;

    //    TODO: Коллекцию тут хранить не надо, это должно быть отдельное место. Данный класс должен содержать только 1 запись об абоненете. Например создать интерфейс IPhoneHandbookRepository и создать его реализацию в другом классе имплементируя методы интерфейса. И метод "addPerson" должен уйтиот сюда. Так же необходимо сделать все поля приватными и сделать для них getter. Что на ходу никто не мог менять поля данной записи.
    ArrayList<Person> personList = new ArrayList<Person>();

    // Сделал отдельный класс для хранения информации в справочнике, инициализирую
    public Person(String name, int year, String surname) {
        this.name = name;
        this.year = year;
        this.surname=surname;
        ArrayList<Person> personList = new ArrayList<Person>();

    }

    //Вопрос метод добавления инфы в коллекцию надо вне этого класса делать?
    //Дальше как я понял мне к коллекции надо применить метод hash для поиска жэлементов
    //А потом привязать метод добавления информации к кнопке создания, которая выбирается с клавиатуры
//    TODO: http://www.oracle.com/technetwork/java/codeconvtoc-136057.html
//    TODO: http://translatedby.com/you/java-code-conventions/into-ru/?page=2
    public void addPerson(String name, int year, String surname) {
        personList.add(new Person(this.name, this.year, this.surname));
        for (Person str : personList) {
            System.out.println(str); //тестовый вывод ссылки на обьект
        }
    } //addPerson
}



