package exercise3;

import java.util.ArrayList;

public class Classs {
    
    private String local;
    private int quantityTables;
    private String id;
    public ArrayList<Classmate_Class> classmateClass = new ArrayList<>();

    public Classs(String local, int quantityTables, String id) {

        setLocal(local);
        setQuantityTable(quantityTables);
        setId(id);
    }

    public void addClassmate(Classmate classmate) {

        Classmate_Class classmate_Class = new Classmate_Class(classmate, this);
        classmateClass.add(classmate_Class);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getQuantityTables() {
        return quantityTables;
    }
    
    public void setQuantityTable(int quantityTables) {
        this.quantityTables = quantityTables;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
