package exercise2;

import java.util.Scanner;

public class Main {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Create a new Company!!");
        System.out.println("Put the name:");
        String name = scanner.next();
        System.out.println("Put the capital:");
        double capital = scanner.nextDouble();

        Company company = new Company(name, capital);
        System.out.println("Company created!!");

        for (int i = 0; i < 3; i++) {

            System.out.println("\nCreate a new Employee:");
            System.out.println("Put the name:");
            String nameEmployee = scanner.next();
            System.out.println("Put the salary:");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(nameEmployee, salary, company);
            System.out.println("The Employee was created!");
            System.out.println("The name of the employee company is " + employee.getCompany().getName());
        }

        System.out.println("\n\n The company and all the employees are:");
        company.printAllEmployees();
    }
}
