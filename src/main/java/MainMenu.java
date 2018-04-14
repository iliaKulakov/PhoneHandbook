import java.util.*;
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

    //    TODO: Почему не реализовал?

    @Override
    public void interactWithMenu() {

        Scanner sc1 = new Scanner(System.in);
            int create=1; boolean exit=false;

            do{ printMenu(); //вызываю печать меню от AbstractMenu
                System.out.println(" - Ввод пункта меню с клавиатуры: ");

                int command = sc1.nextInt();//
                switch (command) {
                    case 1:
                        System.out.println("Вы ввели число 1");
                        exit=true;
                        break;
                    case 2:
                        System.out.println("Вы ввели число 2");
                        exit=true;
                        break;
                    case 3:
                        System.out.println("Вы ввели число 3");
                        exit=true;
                        break;
                    default:
                        System.out.println("Ошибка! Повторите выбор меню: ");
                        exit=false;
                        break;
                }//switch
            }while (exit!=true);
            //do while
    }//interactWithMenu(
}//public class MainMenu extends AbstractMenu