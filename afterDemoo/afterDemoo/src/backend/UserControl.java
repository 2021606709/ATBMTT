/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import utils.Datavalidator;

import entity.User;
import entity.Employee;
import entity.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CanhDev
 */
public class UserControl {
    public static List<User> userList = new ArrayList<>();
    
    public static void DefaultList(){
        Employee emp1 = new Employee(1, "e1", "test1@gmail.com", "Emp1@12345", "sql");
        userList.add(emp1);
        Employee emp2 = new Employee(2, "e2", "test2@gmail.com", "Emp2@12345", "java");
        userList.add(emp2);
        Employee emp3 = new Employee(3, "e3", "test3@gmail.com", "Emp3@12345", "c#");
        userList.add(emp3);
        Manager m1 = new Manager(4, "m1", "test4@gmail.com", "Emp4@12345", 8);
        userList.add(m1);
        Manager m2 = new Manager(5, "m2", "test5@gmail.com", "Emp5@12345", 10);
        userList.add(m2);
    }
    public static boolean checkId(int id){
        for(int i = 0; i < userList.size(); i++){
            if(userList.get(i).getId() == id){
                return false;
            }
        }
        return true;
    }
    public static void AddUser(){
        int chon;
        Scanner s = new Scanner(System.in);
        System.out.println("1. employee, 2. Manager");
        chon = s.nextInt();
        do{
            switch(chon){
                case 1: 
                    Employee emp = new Employee();
                    emp.importNew();
                    if(checkId(emp.getId())) {
                        userList.add(emp);
                        return;
                    }
                    else{
                        System.out.println("Da ton tai nhan vien nay");
                    }
                    break;
                case 2:
                    Manager m = new Manager();
                    m.importNew();
                    if(checkId(m.getId())) {
                        userList.add(m);
                        return;
                    }
                    else{
                        System.out.println("Da ton tai quan ly nay");
                    }
                    break;
            }
        }while(chon !=3);
    }
    public static void printDS(){
        System.out.println("Xuat Danh sach");
        Employee emp = new Employee();
        System.out.printf("%n Danh sach nhan vien :");
        System.out.println("");
        emp.printTitle();
        for(User user : userList){
            if(user instanceof Employee){
                emp = (Employee) user;
                emp.printData();
            }
        }
        Manager m = new Manager();
        System.out.printf("%n Danh sach quan ly :");
        System.out.println("");
        m.printTitle();
        for(User user : userList){
            if(user instanceof Manager){
                m = (Manager) user;
                m.printData();
            }
        }
    }
    public static void Detail(){
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap id muon tim: ");
        int idF = s.nextInt();
        for(User user : userList){
            if(user.getId() == idF){
                if(user instanceof Employee){
                    System.out.println((Employee) user);
                    count++;
                }
                else if(user instanceof Manager){
                    System.out.println((Manager) user);
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("Khong ton tai nhan vien co id: " + idF);
        }
    }
    public static void removeUser(){
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap id cua nhan vien muon xoa: ");
        int idF = s.nextInt();
        for(int i = 0; i < userList.size(); i++){
            if(userList.get(i).getId() == idF){
                userList.remove(i);
                count++;
            }
        }
        if(count == 0) System.out.println("Khong ton tai nhan vien co id: " + idF);
        else System.out.println("Xoa thanh cong");
    }
    public static void login(){
        Scanner scanner = new Scanner(System.in);

        // Đăng nhập
        System.out.println("Dang nhap");
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Mat khau: ");
        String password = scanner.nextLine();

        boolean isValidEmail = Datavalidator.isValidEmail(email);
        boolean isValidPassword = Datavalidator.isValidPassword(password);
        
        boolean checkData = false;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getEmail().equals(email) && userList.get(i).getPassword().equals(password)) {
                    checkData = true;
                    break;
            }
        }

        if (isValidEmail && isValidPassword && checkData) {
            System.out.println("Dang nhap thanh cong.");
        } else {
            System.out.println("Email hoac mat khau khong hop le.");
        }
    }
}
