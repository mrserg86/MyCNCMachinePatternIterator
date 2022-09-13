public class Plant {

    MillWorkshop millWorkshop;

    public Plant(MillWorkshop millWorkshop) {
        this.millWorkshop = millWorkshop;
    }

    public void printDescription() {
        Iterator millWorkshopIterator = millWorkshop.createIterator();
        System.out.println("MillWorkshop");
        printDescription(millWorkshopIterator);
    }

    private void printDescription(Iterator iterator) {
        while(iterator.hasNext()) {
            WorkshopItem workshopItem = iterator.next();
            System.out.println("Название цеха " + workshopItem.getName());
            System.out.println("Количество станков " + workshopItem.getAmountOfMachines());
            System.out.println("Энергопотребление " + workshopItem.getEnergyConsumption());
            System.out.println("Военная продукция " + workshopItem.isMilitary());
        }
    }

}
