
import java.time.Instant;
import java.time.Year;
import java.util.Scanner;

import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter_Your_Student_Name: ");
        String name = scanner.next();

        System.out.print("Enter_Phone_Number: ");
        int no = Integer.parseInt(scanner.next());

        System.out.print("Enter_Your_Email: ");
        String email = scanner.next();

        System.out.print("Enter_ID_Number: ");
        String ID = scanner.next();

        System.out.print("Enter_User_Name: ");
        String user = scanner.next();

        System.out.print("Enter_Your_Password: ");
        String password = scanner.next();


        System.out.println("--------------------------------");
        String formattedName = String.format("Student name is %s", name);
        String phoneNumber = String.format("Phone Number is %d", no);
        String myEmail = String.format("Email is %s", email);
        String myNumber = String.format("ID Number is %s", ID);

//        print and display string

        System.out.println(formattedName);
        System.out.println(phoneNumber);
        System.out.println(myEmail);
        System.out.println(myNumber);


    }
}