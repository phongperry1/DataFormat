
package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Manager {
    public String checkInputString() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String result = sc.nextLine().trim();
            if(result.isEmpty()) {
                System.err.println("Not empty");
            } else {
                return result;
            }
        }
                
    }
    
    public String checkInputPhone() {
        Scanner sc = new Scanner(System.in);
        String PHONE_VALID = "^[0-9]{10}$";
        while(true) {
            try {
                int phoneCheck = Integer.parseInt(sc.nextLine());
                String resultCheck = String.valueOf(phoneCheck);
                if(!resultCheck.matches(PHONE_VALID)) {
                    System.err.println("Phone number must be 10 digits");
                } else {
                    return resultCheck;
                }
            } catch (NumberFormatException e) {
                System.out.print("Phone number: ");
                System.err.println("Phone number must be number");
            }
        }
    }
    
    public String checkInputDate() {
        while(true) {
            try {
                String dataCheck = checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataCheck);
                return dataCheck;
            } catch (ParseException e) {
                System.out.print("Date: ");
                System.err.println("Date to correst format(dd/MM/yyyy)");
                
            }
        }
    }
    
    
    public String checkInputEmail() {
        String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$"; 
        while (true) {            
            String emailCheck = checkInputString();
            if(!emailCheck.matches(EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }
}
