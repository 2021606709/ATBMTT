/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frontend;
import utils.Datavalidator;
/**
 *
 * @author CanhDev
 */
public class testData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String email = "test1@gmail.com";
        String pass = "Emp1@12345";
        System.out.println(Datavalidator.isValidEmail(email));
        System.out.println(Datavalidator.isValidPassword(pass));
    }
    
}
