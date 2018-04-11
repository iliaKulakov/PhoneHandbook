import java.util.ArrayList;

public class Person {
    int year; String name; String surname;
    // Сделал отдельный класс для хранения информации в справочнике, инициализирую
    public Person(String name, int year, String surname) {
        this.name = name;
        this.year = year;
        this.surname=surname;
        ArrayList<Person> PersonList = new ArrayList<Person>();

    }
    ArrayList<Person> PersonList = new ArrayList<Person>();

    //Вопрос метод добавления инфы в коллекцию надо вне этого класса делать?
    //Дальше как я понял мне к коллекции надо применить метод hash для поиска жэлементов
    //А потом привязать метод добавления информации к кнопке создания, которая выбирается с клавиатуры
    public void Addperson (String name,int year,String surname) {
        PersonList.add(new Person(this.name, this.year,this.surname));
        for (Person str : PersonList) {
            System.out.println(str); //тестовый вывод ссылки на обьект
        }
    } //Addperson
}



