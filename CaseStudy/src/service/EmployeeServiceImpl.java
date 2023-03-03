package service;

import models.Employee;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void edit() {
       List<Employee> employeeList = ReadAndWriteFile.readEmployeeListFromCSV();
       showList();
       int index;
       while (true){
           try{
               System.out.println("Choose employee to edit");
               index = Integer.parseInt(scanner.nextLine());
           }catch (Exception e){
               System.out.println("Could not parse to number");
               continue;
           }
           if (index <=0||index>employeeList.size()){
               System.out.println("Invalid employee.Try again");
               continue;
           }
           break;
       }
        System.out.println("Position");
       String position =scanner.nextLine();
       double salary ;
       while (true){
           try{
               System.out.println("Salary");
               salary = Integer.parseInt(scanner.nextLine());
           }catch (Exception e){
               System.out.println("Could not parse to number");
               continue;
           }
           if (index <=0){
               System.out.println("Invalid salary.Try again");
               continue;
           }
           break;
       }
       employeeList.get(index-1).setPosition(position);
       employeeList.get(index-1).setSalary(salary);
       ReadAndWriteFile.writeEmployeeListToCSV(employeeList,false);
    }
    @Override
    public void showList() {
        List<Employee> employeeList = ReadAndWriteFile.readEmployeeListFromCSV() ;
        System.out.println("\nDisplay Employee  List:");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println((i+1)+"."+employeeList.get(i));
        }
        System.out.println();
    }
    @Override
    public void add() {
        System.out.println("Add new Employee:");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Birthday:");
        String birthday = scanner.nextLine();
        System.out.println("Sex: (true or false)");
        String sexString = scanner.nextLine();
        Boolean sex = Boolean.parseBoolean(sexString.toLowerCase()) ;
        System.out.println("Identify Card");
        String identifyCard = scanner.nextLine();
        System.out.println("Phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Employee code:");
        String employeeCode = scanner.nextLine();
        System.out.println("Qualification:");
        String qualification = scanner.nextLine();
        System.out.println("Position:");
        String position = scanner.nextLine();
        System.out.println("Salary:");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(name,birthday,sex,identifyCard,phoneNumber,email,employeeCode,qualification,position,salary);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        ReadAndWriteFile.writeEmployeeListToCSV(employeeList,true);
    }
}
