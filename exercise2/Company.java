package exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {

    private Scanner scanner = new Scanner(System.in);
    private String name;
    private double capital;
    public static ArrayList<Employee> allEmployee = new ArrayList<>();
    
    public Company(String name, double capital) {

        setName(name);
        setCapital(capital);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {

        while (capital < 0) {
            System.out.println("Invalid value, put again...");
            capital = scanner.nextDouble();
        }
        this.capital = capital;
    }

    public void printAllEmployees() {

        System.out.println("Company : " + name);
        for (int i = 0; i < allEmployee.size(); i++) {
            System.out.printf("Employee : %s%n", allEmployee.get(i).getName());
        }
    }
}