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


    }
}