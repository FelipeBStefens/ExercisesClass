
public class Employee_Project {
    
    private Employee employee;
    private Project project;
    
    public Employee_Project(Employee employee, Project project) {

        this.employee = employee;
        this.project = project;

        employee.allProjects.add(project);
        project.allEmployees.add(employee);
    }

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }
}
