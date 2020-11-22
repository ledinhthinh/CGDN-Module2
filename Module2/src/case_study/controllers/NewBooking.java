package case_study.controllers;

import case_study.commons.FileUntil;
import case_study.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewBooking {

    public static void addNewBooking() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/case_study/data/Booking.csv"), true));
        boolean check = true;
        Customer.showInformationOfCustomer();
        List<Customers> list = new ArrayList<>();
        List<ServicesAbstract> servicesAbstractList = new ArrayList<>();
        List<String[]> list1 = FileUntil.readFile("src/case_study/data/Customer.csv");
        for (String[] c : list1) {
            Customers customers = new Customers(c[0], c[1], c[2], c[3], c[4], c[5], c[6], c[7], c[8]);
            list.add(customers);
        }
        while (check) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Id Customer to booking: ");
            String idCus = scanner.nextLine();
            for (Customers c : list) {
                if (idCus.equals(c.getNumId())) {
                    System.out.println("1.Booking Villa.");
                    System.out.println("2.Booking House.");
                    System.out.println("3.Booking Room.");
                    int num = scanner.nextInt();
                    boolean isNumber = true;
                    if (num < 1 || num > 3) {
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
                            Service.showAllVilla();
                            List<Villa> villaList = new ArrayList<>();
                            List<String[]> listVilla = FileUntil.readFile("src/case_study/data/Villa.csv");
                            for (String[] e : listVilla) {
                                Villa villa = new Villa(e[0], e[1], e[2], e[3], e[4], e[5], e[6], e[7]);
                                villaList.add(villa);
                            }
                            System.out.println("Enter Id villa to booking: ");
                            scanner.nextLine();
                            String idSerVilla = scanner.nextLine();
                            for (Villa p : villaList) {
                                if (idSerVilla.equals(p.getId())) {
                                    bufferedWriter.write("Name: " + c.getName() + ','+" ID: " + c.getNumId() +','+ " Birthday: " + c.getBirth() +','+ " Gender: " + c.getGender() +','+ " Phone: " + c.getPhone()
                                            + ','+"Email: " + c.getEmail() +','+ " Address: " + c.getAddress() + ','+" Kind customer: " + c.getKindCustomer() +','+ " Service object: " + c.getServiceObject() +','+ p.toString()+"\n");

                                }
                            }
                            System.out.println("Successfully booked!!!");
                            break;
                        }
                        case 2: {
                            Service.showAllHouse();
                            List<House> houseList = new ArrayList<>();
                            List<String[]> listHouse = FileUntil.readFile("src/case_study/data/House.csv");
                            for (String[] e : listHouse) {
                                House house = new House(e[0], e[1], e[2], e[3], e[4], e[5], e[6], e[7]);
                                houseList.add(house);
                            }
                            System.out.println("Enter Id house to booking: ");
                            scanner.nextLine();
                            String idSerHouse = scanner.nextLine();
                            for (House p : houseList) {
                                if (idSerHouse.equals(p.getId())) {
                                    bufferedWriter.write("Name: " + c.getName() + ','+" ID: " + c.getNumId() +','+ " Birthday: " + c.getBirth() +','+ " Gender: " + c.getGender() +','+ " Phone: " + c.getPhone()
                                            + ','+"Email: " + c.getEmail() +','+ " Address: " + c.getAddress() + ','+" Kind customer: " + c.getKindCustomer() +','+ " Service object: " + c.getServiceObject() +','+ p.toString()+"\n");

                                }
                            }
                            System.out.println("Successfully booked!!!");
                            break;
                        }

                        case 3: {
                            Service.showAllRoom();
                            List<Room> roomList = new ArrayList<>();
                            List<String[]> listRoom = FileUntil.readFile("src/case_study/data/Room.csv");
                            for (String[] e : listRoom) {
                                Room room = new Room(e[0], e[1], e[2], e[3], e[4], e[5], e[6], e[7]);
                                roomList.add(room);
                            }
                            System.out.println("Enter Id room to booking: ");
                            scanner.nextLine();
                            String idSerRoom = scanner.nextLine();
                            for (Room p : roomList) {
                                if (idSerRoom.equals(p.getId())) {
                                    bufferedWriter.write("Name: " + c.getName() + ','+" ID: " + c.getNumId() +','+ " Birthday: " + c.getBirth() +','+ " Gender: " + c.getGender() +','+ " Phone: " + c.getPhone()
                                            + ','+"Email: " + c.getEmail() +','+ " Address: " + c.getAddress() + ','+" Kind customer: " + c.getKindCustomer() +','+ " Service object: " + c.getServiceObject() +','+ p.toString()+"\n");

                                }
                            }
                            System.out.println("Successfully booked!!!");
                            break;
                        }

                    }
                }
            }
            check = false;
        }
        bufferedWriter.close();
    }
}
