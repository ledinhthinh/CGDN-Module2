package case_study.controllers;

import case_study.commons.FileUntil;
import case_study.commons.RegexService;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.io.*;
import java.util.*;

public class Service extends RegexService {
    static List<Villa> villaList = new ArrayList<>();
    static List<House> houseList = new ArrayList<>();
    static List<Room> roomList = new ArrayList<Room>();

    public static void addNewService() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1.Add New Villa.");
            System.out.println("2.Add New House.");
            System.out.println("3.Add New Room.");
            System.out.println("0.Back to menu.");
            System.out.println("Please enter your selection.");
            int num = scanner.nextInt();
            boolean isNumber = true;
            if (num < 0 || num > 4) {
                System.out.println("Not a Number");
                isNumber = false;
            }
            if (!isNumber) {
                System.out.println("You enter fail. Enter to enter a different number.");
                scanner.nextLine();
                continue;
            }
            switch (num) {
                case 1: {
                    addNewVilla();
                    break;
                }
                case 2: {
                    addNewHouse();
                    break;
                }
                case 3: {
                    addNewRoom();
                    break;
                }
                case 0: {
                    check = false;
                    break;
                }
            }
        }
    }

    public static void showService() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1.Show all Villa.");
            System.out.println("2.Show all House.");
            System.out.println("3.Show all Room.");
            System.out.println("4.Show all Name Villa Not Duplicate.");
            System.out.println("5.Show all Name House Not Duplicate.");
            System.out.println("6.Show All Name Name Not Duplicate.");
            System.out.println("0.Back to menu.");
            int num = scanner.nextInt();
            boolean isNumber = true;
            if (num < 0 || num > 7) {
                System.out.println("Not a Number");
                isNumber = false;
            }
            if (!isNumber) {
                System.out.println("You enter fail. Enter to enter a different number.");
                scanner.nextLine();
                continue;
            }
            switch (num) {
                case 1: {
                    showAllVilla();
                    break;
                }
                case 2: {
                    showAllHouse();
                    break;
                }
                case 3: {
                    showAllRoom();
                    break;
                }
                case 4: {
                    showAllNameVillaNotDuplicate();
                    break;
                }
                case 5: {
                    showAllNameHouseNotDuplicate();
                    break;
                }
                case 6: {
                    showAllNameRoomNotDuplicate();
                    break;
                }
                case 0: {
                    check = false;
                    break;
                }
            }
        }
    }

    public static void addNewRoom() {
        Room room = new Room();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id room: ");
        room.setId(scanner.nextLine());
        while (!checkIdRoom(room.getId())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            room.setId(scanner.nextLine());
        }
        System.out.println("Enter name: ");
        room.setNameServices(scanner.nextLine());
        while (!checkNameSevice(room.getNameServices())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            room.setNameServices(scanner.nextLine());
        }
//        System.out.println("Enter date of birth: ");
//        room.setDateOfBirth(scanner.nextLine());
//        while (!checkDateOfBirth(room.getDateOfBirth())) {
//            System.out.println("Enter incorrect data, please re-enter !!!");
//            room.setDateOfBirth(scanner.nextLine());
//        }
        System.out.println("Enter area: ");
        room.setAreaUsing(scanner.nextLine());
        while (!checkArea(room.getAreaUsing())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            room.setAreaUsing(scanner.nextLine());
        }
        System.out.println("Enter pay rent: ");
        room.setPayRent(scanner.nextLine());
        while (!checkPayRent(room.getPayRent())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            room.setPayRent(scanner.nextLine());
        }
        System.out.println("Enter max people (01-20): ");
        room.setPeopleCapacity(scanner.nextLine());
        while (!checkMaxPeople(room.getPeopleCapacity())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            room.setPeopleCapacity(scanner.nextLine());
        }
        System.out.println("Enter free service ( massage, karaoke, food, drink, car)");
        room.setFreeService(scanner.nextLine());
        while (!checkFreeService(room.getFreeService())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            room.setFreeService(scanner.nextLine());
        }
        System.out.println("Enter type Service:");
        room.setTypeRent(scanner.nextLine());
        while (!checkNameSevice(room.getTypeRent())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            room.setTypeRent(scanner.nextLine());
        }
        System.out.println("Enter number of floors");
        room.setNumberOfFloors(scanner.nextLine());
        while (!checkNumberOfFloors(room.getNumberOfFloors())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            room.setNumberOfFloors(scanner.nextLine());
        }
        roomList.add(room);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/case_study/data/Room.csv"), true));
            for (Room line : roomList) {
                bufferedWriter.write(line.toString() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Successfully entered !!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void addNewVilla() {
        Villa villa = new Villa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id villa: ");
        villa.setId(scanner.nextLine());
        while (!checkIdVilla(villa.getId())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            villa.setId(scanner.nextLine());
        }
        System.out.println("Enter name: ");
        villa.setNameServices(scanner.nextLine());
        while (!checkNameSevice(villa.getNameServices())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            villa.setNameServices(scanner.nextLine());
        }
//        System.out.println("Enter date of birth: ");
//        villa.setDateOfBirth(scanner.nextLine());
//        while (!checkDateOfBirth(villa.getDateOfBirth())) {
//            System.out.println("Enter incorrect data, please re-enter !!!");
//            villa.setDateOfBirth(scanner.nextLine());
//        }
        System.out.println("Enter area: ");
        villa.setAreaUsing(scanner.nextLine());
        while (!checkArea(villa.getAreaUsing())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            villa.setAreaUsing(scanner.nextLine());
        }
        System.out.println("Enter pay rent: ");
        villa.setPayRent(scanner.nextLine());
        while (!checkPayRent(villa.getPayRent())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            villa.setPayRent(scanner.nextLine());
        }
        System.out.println("Enter max people (01-20): ");
        villa.setPeopleCapacity(scanner.nextLine());
        while (!checkMaxPeople(villa.getPeopleCapacity())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            villa.setPeopleCapacity(scanner.nextLine());
        }
        System.out.println("Enter free service ( massage, karaoke, food, drink, car)");
        villa.setFreeService(scanner.nextLine());
        while (!checkFreeService(villa.getFreeService())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            villa.setFreeService(scanner.nextLine());
        }
        System.out.println("Enter type Service:");
        villa.setTypeRent(scanner.nextLine());
        while (!checkNameSevice(villa.getTypeRent())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            villa.setTypeRent(scanner.nextLine());
        }
        System.out.println("Enter number of floors");
        villa.setNumberOfFloors(scanner.nextLine());
        while (!checkNumberOfFloors(villa.getNumberOfFloors())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            villa.setNumberOfFloors(scanner.nextLine());
        }
        villaList.add(villa);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/case_study/data/Villa.csv"), true));
            for (Villa line : villaList) {
                bufferedWriter.write(line.toString() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Successfully entered !!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewHouse() {
        House house = new House();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id House: ");
        house.setId(scanner.nextLine());
        while (!checkIdHouse(house.getId())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            house.setId(scanner.nextLine());
        }
        System.out.println("Enter name: ");
        house.setNameServices(scanner.nextLine());
        while (!checkNameSevice(house.getNameServices())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            house.setNameServices(scanner.nextLine());
        }
//        System.out.println("Enter date of birth: ");
//        house.setDateOfBirth(scanner.nextLine());
//        while (!checkDateOfBirth(house.getDateOfBirth())) {
//            System.out.println("Enter incorrect data, please re-enter !!!");
//            house.setDateOfBirth(scanner.nextLine());
//        }
        System.out.println("Enter area: ");
        house.setAreaUsing(scanner.nextLine());
        while (!checkArea(house.getAreaUsing())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            house.setAreaUsing(scanner.nextLine());
        }
        System.out.println("Enter pay rent: ");
        house.setPayRent(scanner.nextLine());
        while (!checkPayRent(house.getPayRent())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            house.setPayRent(scanner.nextLine());
        }
        System.out.println("Enter max people (01-20): ");
        house.setPeopleCapacity(scanner.nextLine());
        while (!checkMaxPeople(house.getPeopleCapacity())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            house.setPeopleCapacity(scanner.nextLine());
        }
        System.out.println("Enter free service ( massage, karaoke, food, drink, car)");
        house.setFreeService(scanner.nextLine());
        while (!checkFreeService(house.getFreeService())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            house.setFreeService(scanner.nextLine());
        }
        System.out.println("Enter type Service:");
        house.setTypeRent(scanner.nextLine());
        while (!checkNameSevice(house.getTypeRent())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            house.setTypeRent(scanner.nextLine());
        }
        System.out.println("Enter number of floors");
        house.setNumberOfFloors(scanner.nextLine());
        while (!checkNumberOfFloors(house.getNumberOfFloors())) {
            System.out.println("Enter incorrect data, please re-enter !!!");
            house.setNumberOfFloors(scanner.nextLine());
        }
        houseList.add(house);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/case_study/data/House.csv"), true));
            for (House line : houseList) {
                bufferedWriter.write(line.toString() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Successfully entered !!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showAllVilla() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/case_study/data/Villa.csv")));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

    }

    public static void showAllHouse() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/case_study/data/House.csv")));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

    }

    public static void showAllRoom() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/case_study/data/Room.csv")));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

    }

    public static void showAllNameVillaNotDuplicate() {
        Set<String> villaSet = new TreeSet<>();
        List<String[]> listVilla = FileUntil.readFile("src/case_study/data/Villa.csv");
        for (String[] e : listVilla) {
            Villa villa = new Villa(e[0], e[1], e[2], e[3], e[4], e[5], e[6], e[7]);
            villaSet.add(villa.toString());
        }
        for (String p : villaSet) {
            System.out.println(p);
        }
    }

    public static void showAllNameHouseNotDuplicate() {
        Set<String> houseList = new TreeSet<>();
        List<String[]> listHouse = FileUntil.readFile("src/case_study/data/House.csv");
        for (String[] e : listHouse) {
            House house = new House(e[0], e[1], e[2], e[3], e[4], e[5], e[6], e[7]);
            houseList.add(house.toString());
        }
        for (String p : houseList) {
            System.out.println(p);
        }
    }

    public static void showAllNameRoomNotDuplicate() {
        Set<String> roomList = new TreeSet<>();
        List<String[]> listRoom = FileUntil.readFile("src/case_study/data/Room.csv");
        for (String[] e : listRoom) {
            Room room = new Room(e[0], e[1], e[2], e[3], e[4], e[5], e[6], e[7]);
            roomList.add(room.toString());
        }
        for (String p : roomList) {
            System.out.println(p);
        }
    }
}
