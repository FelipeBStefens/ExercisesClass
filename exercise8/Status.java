package exercise8;

public class Status {
    
    private boolean completed;
    private String dataStart;
    private String dataFinal;
    private Service service;

    public Status(boolean completed, String dataStart, String dataFinal, Service service) {

        this.completed = completed;
        this.dataStart = dataStart;
        this.dataFinal = dataFinal;
        this.service = service;
        service.setStatus(this);
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDataStart() {
        return dataStart;
    }

    public void setDataStart(String dataStart) {
        this.dataStart = dataStart;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
