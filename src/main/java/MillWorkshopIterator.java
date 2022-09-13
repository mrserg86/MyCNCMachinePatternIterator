public class MillWorkshopIterator  implements Iterator {

    WorkshopItem[] items;
    int position = 0;

    public MillWorkshopIterator(WorkshopItem[] items) {
        this.items = items;
    }

    public WorkshopItem next() {
        WorkshopItem workshopItem = items[position];
        position = position + 1;
        return workshopItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

}
