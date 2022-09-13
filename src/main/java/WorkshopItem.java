public class WorkshopItem {

    String name;
    int amountOfMachines;
    int energyConsumption;
    boolean military;

    public WorkshopItem(String name, int amountOfMachines, int energyConsumption, boolean military) {
        this.name = name;
        this.amountOfMachines = amountOfMachines;
        this.energyConsumption = energyConsumption;
        this.military = military;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfMachines() {
        return amountOfMachines;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public boolean isMilitary() {
        return military;
    }
}
