package service;

import models.House;
import models.Room;
import models.Villa;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String showListFacilityMaintenance() {
        return null;
    }

    @Override
    public void showList() {
        int index = 0;
        System.out.println("Display Facility List");
        List<Villa> villaList = ReadAndWriteFile.readVillaListFromCSV();
        for (int i = 0; i < villaList.size(); i++) {
            System.out.println((index + 1) + "." + villaList.get(i));
            index++;
        }
        List<Room> roomList = ReadAndWriteFile.readRoomListFromCSV();
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println((index + 1) + "." + roomList.get(i));
            index++;
        }
        List<House> houseList = ReadAndWriteFile.readHouseListFromCSV();
        for (int i = 0; i < houseList.size(); i++) {
            System.out.println((index + 1) + "." + houseList.get(i));
            index++;
        }
    }

    @Override
    public void add() {
        int facilityOption = 0;
        while (true) {
            try {
                System.out.println("1.\tAdd New Villa\n" +
                        "2.\tAdd New House\n" +
                        "3.\tAdd New Room\n" +
                        "4.\tBack to menu\n");
                facilityOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nError: Could not parst option to number!\nTry again!\n");
                continue;
            }
            if (facilityOption < 1 && facilityOption >4) {
                System.out.println("\nError: Invalid number.\nTry agian!\n");
                continue;
            }
            break;
        }
        if (facilityOption == 4) {
            return;
        }
        System.out.println("Id:");
        String id = scanner.nextLine();
        System.out.println("Service name:");
        String serviceName = scanner.nextLine();
        double usableArea;
        System.out.println("Usable area");
        usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Rental cost:($)");
        double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Max people");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Rental type:(year or month or day or hour)");
        String rentalType = scanner.nextLine();
        int numberOfUses = 0;
        if(facilityOption == 1){
            System.out.println("Room standard:");
            String roomStandard = scanner.nextLine();
            System.out.println("Pool area: m2");
            double poolArea = Double.parseDouble(scanner.nextLine());
            System.out.println("Number of floor");
            int numberOfFloors = Integer.parseInt(scanner.nextLine());
            Villa villa = new Villa(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType, 0 ,roomStandard, poolArea, numberOfFloors);
            List<Villa> villaList = new ArrayList<>();
            villaList.add(villa);
            ReadAndWriteFile.writeVillaListToCSV(villaList,true);

        } else if (facilityOption == 2){
            System.out.println("Room standard:");
            String roomStandard = scanner.nextLine();
            System.out.println("Number of floors:");
            int numberOfFloors = Integer.parseInt(scanner.nextLine());
            House house = new House(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType, 0 ,roomStandard, numberOfFloors);
            List<House> houseList = new ArrayList<>();
            houseList.add(house);
            ReadAndWriteFile.writeHouseListToCSV(houseList,true);
        } else if (facilityOption == 3) {
            System.out.println("Free service included:");
            String freeServiceIncluded = scanner.nextLine();
            Room room = new Room(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType, numberOfUses ,freeServiceIncluded);
            List<Room> roomList = new ArrayList<>();
            roomList.add(room);
            ReadAndWriteFile.writeRoomListToCSV(roomList,true);
        }
    }
}
