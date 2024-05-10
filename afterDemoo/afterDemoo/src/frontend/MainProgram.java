/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frontend;
import backend.UserControl;
import java.util.Scanner;
/**
 *
 * @author CanhDev
 */
public class MainProgram {

    public static void main(String[] args) {
        int chon;
        UserControl.DefaultList();
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1. Them User");
            System.out.println("2. In danh sach");
            System.out.println("3. In thong tin chi tiet nhan vien");
            System.out.println("4. Xoa nhan vien theo id");
            System.out.println("5. Login");
            System.out.println("6. Exit");
            System.out.print("Nhap lua chon: ");
            chon = s.nextInt();
            //
            switch(chon){
                case 1: UserControl.AddUser(); break;
                case 2: UserControl.printDS(); break;
                case 3: UserControl.Detail(); break;
                case 4: UserControl.removeUser(); break;
                case 5: UserControl.login(); break;
                case 6: 
                    System.out.println("Exiting program...");
                    break;
            }
        }while(chon !=6);
    }
    
}
