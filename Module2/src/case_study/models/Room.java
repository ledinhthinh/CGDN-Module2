package case_study.models;

import java.util.Scanner;

public class Room extends ServicesAbstract {
    private int temp = 1;
    private String bonusServiceFree;

    public Room() {
    }

    public Room(String id, String nameServices, double areaUsing, double payRent, int peopleCapacity, String typeRent, String bonusServiceFree) {
        super(id, nameServices, areaUsing, payRent, peopleCapacity, typeRent);
        this.bonusServiceFree = bonusServiceFree;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getBonusServiceFree() {
        return bonusServiceFree;
    }

    public void setBonusServiceFree(String bonusServiceFree) {
        this.bonusServiceFree = bonusServiceFree;
    }

    @Override
    public void addNewService() {
        String id = String.valueOf(getTemp());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name service: ");
        String nameService = scanner.nextLine();
        System.out.println("Enter area using: ");
        double areaUsing = scanner.nextDouble();
        System.out.println("Enter pay for rent: ");
        double payRent = scanner.nextDouble();
        System.out.println("Enter capacity of people: ");
        int capacityPeople = scanner.nextInt();
        System.out.println("Enter type of rent: ");
        String typeRent = scanner.nextLine();
        System.out.println("Enter bonus service free: ");
        String bonusService = scanner.nextLine();
        Room room = new Room(id,nameService,areaUsing,payRent,capacityPeople,typeRent,bonusService);
        //getArrayRoom.add(room);
    }

    @Override
    public void editService() {

    }

    @Override
    public void deleteService() {

    }

    @Override
    public void searchService() {

    }

    @Override
    public void sortService() {

    }

    @Override
    public void showInfo() {

    }
}
