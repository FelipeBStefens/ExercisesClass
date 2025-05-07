package exercise1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Classmate> allClassmates = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("""
            1 - Connect a new classmate;
            2 - Find the address with the classmate;
            3 - Leave;
            """);
            int value = scanner.nextInt();

            if (value == 1) {

                System.out.println("Put the new address:");
                System.out.println("Put the country"); 
                String country = scanner.next();
                System.out.println("Put the city");
                String city = scanner.next();
                System.out.println("Put the street");
                String street = scanner.next();
                System.out.println("Put the cep");
                String cep = scanner.next();
                System.out.println("Put the number");
                String number = scanner.next();
                Address address = new Address(country, city, street, cep, number);

                System.out.println("Put the name:");
                String name = scanner.next();
                System.out.println("Put the years old:");
                int yearsOld = scanner.nextInt();
                System.out.println("Put the classroom:");
                String classroom = scanner.next();

                Classmate classmate = new Classmate(address, name, yearsOld, classroom);
                allClassmates.add(classmate);

                System.out.println("The classmate has been added!!");
            }
            else if (value == 2) {
                System.out.println("Put the new address:");
                System.out.println("Put the country"); 
                String country = scanner.next();
                System.out.println("Put the city");
                String city = scanner.next();
                System.out.println("Put the street");
                String street = scanner.next();
                System.out.println("Put the cep");
                String cep = scanner.next();
                System.out.println("Put the number");
                String number = scanner.next();
                Address address = new Address(country, city, street, cep, number);


                boolean bool = true;
                for (Classmate classmate : allClassmates) {
                    if (address.getCountry().equalsIgnoreCase(classmate.getAddress().getCountry()) && 
                        address.getCity().equalsIgnoreCase(classmate.getAddress().getCity()) &&
                        address.getStreet().equalsIgnoreCase(classmate.getAddress().getStreet()) && 
                        address.getCep().equalsIgnoreCase(classmate.getAddress().getCep()) &&
                        address.getNumber().equalsIgnoreCase(classmate.getAddress().getNumber())) {
                            
                        bool = false;

                        System.out.printf("""
                        You found the classmate!!
                        Name : %s
                        Years old : %d
                        Classroom : %s
                        """, classmate.getName(), classmate.getYearsOld(), classmate.getClassroom());
                    }
                }

                if (bool) {
                    System.out.println("You cannot found the classmate...");
                }
            }
            else if (value == 3) {
                System.out.println("Leaving the code, goodbye!");
                break;
            }
            else {
                System.out.println("Invalid value...");
            }
        }

        scanner.close();
    }
}
