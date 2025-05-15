import java.util.ArrayList;

public class Department {
    
    private String nameDepartment;
    private String company;
    public ArrayList<Employee> allEmployees = new ArrayList<>();

    public Department(String nameDepartment, String company) {
        this.nameDepartment = nameDepartment;
        this.company = company;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}