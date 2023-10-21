

package View;

import Controller.Manager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
    
    
    public static void main(String[] args) {
        Manager mn = new Manager();
        System.out.print("Phone Number : ");
        String phone = mn.checkInputPhone();
        System.out.print("Date: ");
        String date = mn.checkInputDate();
        System.out.print("Email: ");
        String email = mn.checkInputEmail();
    }
}
