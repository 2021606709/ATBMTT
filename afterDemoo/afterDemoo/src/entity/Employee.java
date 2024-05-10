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
public class Employee extends User {
    private String ProSkill;
    public Employee(){
        
    }
    public Employee(int id, String FullName, String Email, String Password, String ProSkill){
        super(id, FullName, Email, Password);
        this.ProSkill = ProSkill;
    }
    @Override
    public void importNew(){
        super.importNew();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ky nang chuyen mon: ");
        this.ProSkill = s.nextLine();
    }
    @Override
    public void printTitle(){
        super.printTitle();
        System.out.printf(" | %20s%n", "ProSkill");
    }
    @Override
    public void printData(){
        super.printData();
        System.out.printf(" | %20s%n", this.ProSkill);
    }
}
