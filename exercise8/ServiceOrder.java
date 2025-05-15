package exercise8;

import java.util.ArrayList;

public class ServiceOrder {
    
    private double price;
    private int quantityService;
    public ArrayList<Service> allServices = new ArrayList<>();

    public ServiceOrder(double price, int quantityService) {

        this.price = price;
        this.quantityService = quantityService;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityService() {
        return quantityService;
    }

    public void setQuantityService(int quantityService) {
        this.quantityService = quantityService;
    }
}
