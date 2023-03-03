package utils;

import models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static String EMPLOYEE_PATH = "src/data/employee.csv";
    public static String CUSTOMER_PATH = "src/data/customer.csv";
    public static String ROOM_PATH = "src/data/room.csv";
    public static String HOUSE_PATH = "src/data/house.csv";
    public static String VILLA_PATH = "src/data/villa.csv";
    public static String BOOKING_PATH = "src/data/booking.csv";

    public static void writeFile(String path, List<String> list, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (String string : list) {
                writer.write(string);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void writeEmployeeListToCSV(List<Employee> employeeList, boolean append) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : employeeList) {
            strings.add(employee.getInforToCSV());
        }
        writeFile(EMPLOYEE_PATH, strings, append);
    }

    public static List<Employee> readEmployeeListFromCSV() {
        List<String> strings = readFile(EMPLOYEE_PATH);
        List<Employee> employeeList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < strings.size(); i++) {
            arr = strings.get(i).split(",");
            Employee employee = new Employee(arr[0], arr[1], Boolean.parseBoolean(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static void writeCustomerListToCSV(List<Customer> customersList, boolean append) {
        List<String> strings = new ArrayList<>();
        for (Customer customer : customersList) {
            strings.add(customer.getInforToCSV());
        }
        writeFile(CUSTOMER_PATH, strings, append);
    }

    public static List<Customer> readCustomerListFromCSV() {
        List<String> strings = readFile(CUSTOMER_PATH);
        List<Customer> customerList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < strings.size(); i++) {
            arr = strings.get(i).split(",");
            Customer customer = new Customer(arr[0], arr[1], Boolean.parseBoolean(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
            customerList.add(customer);
        }
        return customerList;
    }
    public static List<Villa> readVillaListFromCSV() {
        List<String> list = readFile(VILLA_PATH);
        List<Villa> villaList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Villa villa = new Villa(arr[0], arr[1], Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),arr[5],Integer.parseInt(arr[6]),arr[7],Double.parseDouble(arr[8]),Integer.parseInt(arr[9]));
            villaList.add(villa);
        }
        return villaList;
    }

    public static List<House> readHouseListFromCSV() {
        List<String> list = readFile(HOUSE_PATH);
        List<House> houseList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            House house = new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]) ,arr[7], Integer.parseInt(arr[8]));
            houseList.add(house);
        }
        return houseList;
    }

    public static List<Room> readRoomListFromCSV() {
        List<String> list = readFile(ROOM_PATH);
        List<Room> roomList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Room room = new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]) , arr[7]);
            roomList.add(room);
        }
        return roomList;
    }
    public static List<Booking> readBookingListFromCSV() {
        List<String> list = readFile(BOOKING_PATH);
        List<Booking> bookingList = new ArrayList<>();
        String[] arr = null;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Booking booking = new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            bookingList.add(booking);
        }
        return bookingList;
    }
    public static void writeVillaListToCSV(List<Villa> villaList, boolean append){
        List<String> strings = new ArrayList<>();
        for (Villa villa: villaList) {
            strings.add(villa.getInforToCSV());
        }
        writeFile( VILLA_PATH,strings, append);
    }

    public static void writeHouseListToCSV(List<House> houseList, boolean append){
        List<String> strings = new ArrayList<>();
        for (House house: houseList) {
            strings.add(house.getInforToCSV());
        }
        writeFile( HOUSE_PATH,strings, append);
    }

    public static void writeRoomListToCSV(List<Room> roomList, boolean append) {
        List<String> strings = new ArrayList<>();
        for (Room room: roomList) {
            strings.add(room.getInforToCSV());
        }
        writeFile(ROOM_PATH,strings,  append);
    }
    public static void writeBookingListToCSV(List<Booking> bookingList, boolean append) {
        List<String> strings = new ArrayList<>();
        for (Booking booking: bookingList) {
            strings.add(booking.getInforToCSV());
        }
        writeFile( BOOKING_PATH,strings, append);
    }
}
