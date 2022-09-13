public class Runner {

    public static void main(String[] args) {
        WorkshopItem workshopItem1 = new WorkshopItem("Цех производства картера", 10, 1000, true);
        WorkshopItem workshopItem2 = new WorkshopItem("Цех Михалыча", 5, 500, false);
        WorkshopItem[] workshopItems = {workshopItem1,workshopItem2};
        MillWorkshop millWorkshop = new MillWorkshop(2, workshopItems);

        Plant tulamash = new Plant(millWorkshop);

        tulamash.printDescription();
    }

}
