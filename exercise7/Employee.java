import java.util.ArrayList;

public class Employee {

    private String name;
    private int age;
    private String cpf;
    public ArrayList<Project> allProjects = new ArrayList<>();

    public Employee(String name, int age, String cpf, Department department) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        department.allEmployees.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

