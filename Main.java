import java.util.Scanner;
import java.io.Console;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Console console = System.console();
    public static void main(String[] args) {

        while (true) {
                    System.out.println("\n-------------------------------");
                    System.out.println("Welcome to Barking Mad Kennels - This is the MAIN MENU");
                    System.out.println("-------------------------------");
                    System.out.println("Please choose one of the following options below to proceed with the actions");
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.println("\t1. Book a new Enclosure");
                    System.out.println("\t2. Search an Enclosure");
                    System.out.println("\t3. Free an Enclosure");
                    System.out.println("\t4. Exit the application");
                    System.out.print("\n\tEnter your choice : ");
        
                   
                    int choice = Integer.parseInt(console.readLine());

                
        
                    switch (choice) {
                        case 1:
                            Company.bookAnEnclosure();
                            break;
                        case 2:
                            Company.ViewDogDetails();
                            break;
                        case 3:
                            Company.RemoveDog();
                            break;
                        case 4:
                            Company.ExitProgram();
                            break;
                        default:
                            System.out.println("\n\tInvalid Choice selected!");
                    }
                }
        
    }
}
