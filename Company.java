import java.util.Scanner;
import java.io.Console;

public class Company {
    static Scanner sc = new Scanner(System.in);
    static Console console = System.console();

    static double price;

    static Enclosure[] enclosure = new Enclosure[10];
    static Dog dogFill = new Dog("Ben", 5, "Lyubo", "Border-Collie", "N/A", "Female");
    static Dog emptyDog = new Dog("Empty", 0, "Empty", "Empty", "Empty", "Empty");

    static {
        enclosure[0] = new Enclosure(1, dogFill, 6, 7.00, true);
        enclosure[1] = new Enclosure(2, dogFill, 6, 7.00, true);
        enclosure[2] = new Enclosure(3, dogFill, 6, 7.00, true);
        enclosure[3] = new Enclosure(4, dogFill, 6, 7.00, true);
        enclosure[4] = new Enclosure(5, dogFill, 6, 7.00, true);
        enclosure[5] = new Enclosure(6, dogFill, 6, 7.00, true);
        enclosure[6] = new Enclosure(7, dogFill, 6, 7.00, true);
        enclosure[7] = new Enclosure(8, dogFill, 0, 0.00, false);
        enclosure[8] = new Enclosure(9, dogFill, 6, 7.00, true);
        enclosure[9] = new Enclosure(10, dogFill, 6, 7.00, true);
    }

    public static void bookAnEnclosure() {
        String dogName, dogBreed, dogNotes, dogGender, dogOwnerName;
        int nonOccupiedEnclosure, dogDaysIn, dogAge;
        double enclosurePrice;

        Dog dog = new Dog();

        if (searchEmptyEnclosure() == 999) {
            System.out.println("All enclosures are currently occupied...Please try again later.");
        } else {
            nonOccupiedEnclosure = searchEmptyEnclosure();

            System.out.println("Enclosure " + nonOccupiedEnclosure + " is avaliable");
            System.out.println("-------------------------------");
            System.out.println("----------------Barking Mad Kennel Details---------------");

            System.out.println("Please Enter the number of days the Dog is staying: ");
            dogDaysIn = Integer.parseInt(console.readLine());
            enclosure[nonOccupiedEnclosure].setDaysIn(dogDaysIn);

            System.out.println("Please Enter price of the enclosure it is staying in: ");
            enclosurePrice = Double.parseDouble(console.readLine());
            enclosure[nonOccupiedEnclosure].setPrice(enclosurePrice);

            System.out.println("-------------------------------");
            System.out.println("----------------Dog Details---------------");

            System.out.println("Enter the Dog's name: ");
            dogName = console.readLine();
            dog.setDogName(dogName);

            System.out.println("Enter the Dog's age: ");
            dogAge = Integer.parseInt(console.readLine());
            dog.setDogAge(dogAge);

            System.out.println("Enter the name of the Dog's Owner: ");
            dogOwnerName = console.readLine();
            dog.setOwnerName(dogOwnerName);

            System.out.println("Enter the Breed: ");
            dogBreed = console.readLine();
            dog.setBreed(dogBreed);

            System.out.println("Enter the Dogs Gender: ");
            dogGender = console.readLine();
            dog.setGender(dogGender);

            System.out.println("Enter Notes about the dog: ");
            dogNotes = console.readLine();
            dog.setGeneralNotes(dogNotes);

            enclosure[nonOccupiedEnclosure].setDogDetails(dog);

            enclosure[nonOccupiedEnclosure].setOccupied(true);

            for (int i = 0; i < enclosure.length; i++) {
                System.out.println(enclosure[i].toString());
            }

            System.out.println("The dogs details have successfully been added to the Barking Mad Kennel system");
            System.out.println("Please inform the customer that their total bill will be: "
                    + calculatePrice(dogDaysIn, enclosurePrice));
        }
    }

    public static int searchEmptyEnclosure() {
        for (int i = 0; i < enclosure.length; i++) {
            if (enclosure[i].getOccupied() == false) {
                return i;
            }
        }
        return 999;
    }

    static double calculatePrice(int daysin, double enclosurePrice) {
        price = daysin * enclosurePrice;
        return price;
    }

    public static void ViewDogDetails() {
        System.out.println("Please enter the enclosure number you want the dogs details retreived from: ");
        int choice = Integer.parseInt(console.readLine());

        System.out.println(enclosure[choice - 1].toString());
    }

    public static void RemoveDog() {

        System.out.println("Please enter the enclosure number of the dog you want removed: ");
        int enclosureSelect = Integer.parseInt(console.readLine());

        enclosure[enclosureSelect - 1] = new Enclosure(enclosureSelect, emptyDog, 0, 0, false);

        for (int i = 0; i < enclosure.length; i++) {
            System.out.println(enclosure[i].toString());
        }
    }

    public static void ExitProgram() {
        System.out.println("You are now exiting the Barking Mad Kennels program...Goodbye...");
        System.exit(0);
    }
}
