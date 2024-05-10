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
public class Manager extends User {
    private int ExpInYear;
    public Manager(){
        
    }
    public Manager(int id, String FullName, String Email, String Password, int ExpInYear){
        super(id, FullName, Email, Password);
        this.ExpInYear = ExpInYear;
    }
    @Override
    public void importNew(){
        super.importNew();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so nam da quan ly: ");
        this.ExpInYear = s.nextInt();
    }
    @Override
    public void printTitle(){
        super.printTitle();
        System.out.printf(" | %20s%n", "ExpInYear");
    }
    @Override
    public void printData(){
        super.printData();
        System.out.printf(" | %20d%n", this.ExpInYear);
    }
    @Override
    public String toString(){
        return super.toString() + ", ExpInYear: " + this.ExpInYear;
    }
}
