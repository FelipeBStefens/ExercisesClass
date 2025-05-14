package exercise2;

import java.util.Scanner;

public class Employee {
    
    private Scanner scanner = new Scanner(System.in);
    private String name;
    private double salary;
    private Company company;

    public Employee(String name, double salary, Company company) {

        setName(name);
        setSalary(salary);
        setCompany(company);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        while (salary < 0) {
            System.out.println("Invalid value, put again...");
            salary = scanner.nextDouble();
        }
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        Company.allEmployee.add(this);
        this.company = company;
    }
}
