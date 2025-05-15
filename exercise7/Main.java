import java.util.Scanner;

public class Main {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Put a new Department:");
        System.out.println("Put the Name");
        String nameDepartment = scanner.next();
        System.out.println("Put the company");
        String company = scanner.next();

        Department department = new Department(nameDepartment, company);
        System.out.println("The Department was created!\n");

        Project[] projects = new Project[4];
        for (int i = 0; i < 2; i++) {

            System.out.println("Create a new Employee:");
            System.out.println("Create the name");
            String name = scanner.next();
            System.out.println("Create the age");
            int age = scanner.nextInt();
            System.out.println("Create the cpf");
            String cpf = scanner.next();

            Employee employee = new Employee(name, age, cpf, department);
            System.out.println("The employee was created!\n");

            for (int j = 0; j < 2; j++) {

                System.out.println("Create a project for this employee:");
                System.out.println("Put the Name");
                String nameProject = scanner.next(); 
                System.out.println("Put the Type");
                String type = scanner.next();
                System.out.println("Put the initialData");
                String initialData = scanner.next();

                projects[2 * i + j] = new Project(nameProject, type, initialData);
                System.out.println("The project was created");
                Employee_Project connection = new Employee_Project(employee, projects[j]);
            }
        }

        System.out.println("Departments name : " + department.getNameDepartment());
        for (int i = 0; i < department.allEmployees.size(); i++) {
            System.out.printf("All the %d employee projects:%n", i + 1);
            for (int j = 0; j < department.allEmployees.get(i).allProjects.size(); j++) {
                System.out.println(
                    department.allEmployees.get(i).allProjects.get(j).getNameProject());
            }
        }
        for (int i = 0; i < projects.length; i++) {
            System.out.printf("All the %d project employees:%n", i + 1);
            for (int j = 0; j < projects[i].allEmployees.size(); j++) {
                System.out.println(
                    projects[i].allEmployees.get(j).getName());
            }
        }
    }
}
