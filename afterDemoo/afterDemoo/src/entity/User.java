/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Scanner;

/**
 *
 * @author CanhDev
 */
public class User {
    private int id;
    private String FullName;
    private String Email;
    private String Password;
    
    public User(){
        
    }
    public User(int id, String FullName, String Email, String Password){
        this.id = id;
        this.FullName = FullName;
        this.Email = Email;
        this.Password = Password;
    }
    public String getEmail(){
        return this.Email;
    }
    public String getPassword(){
        return this.Password;
    }
    public int getId(){
        return this.id;
    }
    public void importNew(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap id: ");
        this.id = new Scanner(System.in).nextInt();
        System.out.print("Nhap ten: ");
        this.FullName = s.nextLine();
        System.out.print("Nhap Email: ");
        this.Email = s.nextLine();
        System.out.print("Nhap Password: ");
        this.Password = s.nextLine();
    }
    public void printTitle(){
        System.out.printf("%-10s | %-20s | %20s | %20s", "ID", "FullName", "Email", "Password");
    }
    public void printData(){
        System.out.printf("%-10d | %-20s | %20s | %20s", id, FullName, Email, Password);
    }
    @Override
    public String toString(){
        return "Id: " + id + ", FullName: "+ FullName + ", Email: " + Email + ", Password: " + Password;
    }
}