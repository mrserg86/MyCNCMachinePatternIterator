public class MillWorkshop {

    static final int MAX_ITEMS = 20;
    int numberOfItems = 0;
    WorkshopItem[] workshopItems;

    public MillWorkshop(int numberOfItems, WorkshopItem[] workshopItems) {
        this.numberOfItems = numberOfItems;
        this.workshopItems = workshopItems;
    }

    public Iterator createIterator() {
        return new MillWorkshopIterator(workshopItems);
    }

}
