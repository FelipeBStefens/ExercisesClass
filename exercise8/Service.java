package exercise8;

public class Service {
    
    private String type;
    private int quantityPeople;
    private Status status;

    public Service(String type, int quantityPeople, ServiceOrder serviceOrder) {

        this.type = type;
        this.quantityPeople = quantityPeople;
        serviceOrder.allServices.add(this);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantityPeople() {
        return quantityPeople;
    }

    public void setQuantityPeople(int quantityPeople) {
        this.quantityPeople = quantityPeople;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
