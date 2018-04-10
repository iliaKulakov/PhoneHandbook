import java.util.Scanner;
import java.util.ArrayList;

public class MainMenu extends AbstractMenu {

    public MainMenu() {
        super();
        initMenuItems();
    }
    private void initMenuItems() {
        this.items.add("Create");
        this.items.add("Search");
        this.items.add("Sort");
    }
    @Override
    public void interactWithMenu() {
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            String s11;
            s11 = sc.nextLine();
            System.out.println(s11);
            switch (s11) {
                case "1":  System.out.println("Создать пользователя ");
                //Хочу создать отдельный класс для создания пользователя, или лучше методом прям тут?
                break;
                case "2":  System.out.println("Найти пользователя ");
                break;
                case "3": System.out.println("Сортировка ");
                break;
                default:
                    System.out.println("Повторите корректный ввод пункта меню с клавиатуры ");
                    break;

            }
//TODO: Обработка ввода и вызов метода контроллера
    } //intercatWithMenu
}