import java.util.ArrayList;

public class Project {

    private String nameProject;
    private String type;
    private String initialData;
    public ArrayList<Employee> allEmployees = new ArrayList<>();

    public Project(String nameProject, String type, String initialData) {
        this.nameProject = nameProject;
        this.type = type;
        this.initialData = initialData;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInitialData() {
        return initialData;
    }

    public void setInitialData(String initialData) {
        this.initialData = initialData;
    }
}