/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.1";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

//        TODO: Ты быстро переключился к данным но не решил проблему с меню. Давай по заданию разберись с меню и выбери классы для него, уже потом данные.
        MainMenu MenuObject = new MainMenu();
        Person person1= new Person("ilya",1999,"kulakov");
        person1.addPerson("vas", 1222, "asa");

    }

}
