package case_study.controllers;

import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
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
                  //  showAllNameVillaNotDuplicate();
                    break;
                }
                case 5: {
                  //  showAllNameHouseNotDuplicate();
                    break;
                }
                case 6: {
                   // showAllNameRoomNotDuplicate();
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
        System.out.println("Enter name: ");
        room.setNameServices(scanner.nextLine());
        System.out.println("Enter area: ");
        room.setAreaUsing(scanner.nextLine());
        System.out.println("Enter pay rent: ");
        room.setPayRent(scanner.nextLine());
        System.out.println("Enter max people: ");
        room.setPeopleCapacity(scanner.nextLine());
        System.out.println("Enter kind service: ");
        room.setTypeRent(scanner.nextLine());
        System.out.println("Enter free service room: ");
        room.setFreeService(scanner.nextLine());
        roomList.add(room);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/case_study/data/Room.csv"),true));
            for (Room line:roomList) {
                bufferedWriter.write(line.toString()+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewVilla() {
        Villa villa = new Villa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id villa: ");
        villa.setId(scanner.nextLine());
        System.out.println("Enter name: ");
        villa.setNameServices(scanner.nextLine());
        System.out.println("Enter area: ");
        villa.setAreaUsing(scanner.nextLine());
        System.out.println("Enter pay rent: ");
        villa.setPayRent(scanner.nextLine());
        System.out.println("Enter max people: ");
        villa.setPeopleCapacity(scanner.nextLine());
        System.out.println("Enter kind service: ");
        villa.setTypeRent(scanner.nextLine());
        System.out.println("Enter free service room: ");
        villa.setFreeService(scanner.nextLine());
        villaList.add(villa);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/case_study/data/Villa.csv"),true));
            for (Villa line:villaList) {
                bufferedWriter.write(line.toString()+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewHouse() {
        House house = new House();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id villa: ");
        house.setId(scanner.nextLine());
        System.out.println("Enter name: ");
        house.setNameServices(scanner.nextLine());
        System.out.println("Enter area: ");
        house.setAreaUsing(scanner.nextLine());
        System.out.println("Enter pay rent: ");
        house.setPayRent(scanner.nextLine());
        System.out.println("Enter max people: ");
        house.setPeopleCapacity(scanner.nextLine());
        System.out.println("Enter kind service: ");
        house.setTypeRent(scanner.nextLine());
        System.out.println("Enter free service room: ");
        house.setFreeService(scanner.nextLine());
        houseList.add(house);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/case_study/data/House.csv"),true));
            for (House line:houseList) {
                bufferedWriter.write(line.toString()+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void showAllVilla() throws IOException{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/case_study/data/Villa.csv")));
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

    }
    public static void showAllHouse() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/case_study/data/House.csv")));
        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

    }
    public static void showAllRoom() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/case_study/data/Room.csv")));
        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

    }
}
