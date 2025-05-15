package exercise8;

import java.util.Scanner;

public class Main {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Create a new Service Order:");
        System.out.println("Put the price");
        double price = scanner.nextDouble();
        System.out.println("Put the quantity of services");
        int quantityService = scanner.nextInt();

        ServiceOrder serviceOrder = new ServiceOrder(price, quantityService);
        System.out.println("The service order was created!!");

        for (int i = 0; i < 2; i++) {

            System.out.println("Create a new Service:");
            System.out.println("Put the type of the service");
            String type = scanner.next();
            System.out.println("put the quantity of people of the service");
            int quantityPeople = scanner.nextInt();

            Service service = new Service(type, quantityPeople, serviceOrder);
            System.out.println("The service was created!!");

            System.out.println("Put a status of that service:");
            System.out.println("It's completed?");
            boolean isCompleted = scanner.nextBoolean();
            System.out.println("Put the initial data of the service");
            String initialData = scanner.next();
            System.out.println("Put the final data of the service");
            String finalData = scanner.next();

            Status status = new Status(isCompleted, initialData, finalData, service);
            System.out.println("The status of that service was created!!");
        }

        System.out.printf("""
                Service order:
                Price %f;
                Quantity Service %d;
                """, serviceOrder.getPrice(), serviceOrder.getQuantityService());

        for (Service service : serviceOrder.allServices) {
            System.out.printf("""
                    Service :
                    Type %s
                    Quantity People %d
                    Status :
                    Is completed %b
                    Initial Data %s
                    Final Data %s
                    """, service.getType(), service.getQuantityPeople(), 
                    service.getStatus().isCompleted(), service.getStatus().getDataStart(),
                    service.getStatus().getDataFinal());
        }
    }
}
