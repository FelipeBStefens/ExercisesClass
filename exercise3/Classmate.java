package exercise3;

import java.util.ArrayList;

public class Classmate {

    private String name;
    private int age;
    private String id;
    private String date;
    public ArrayList<Classmate_Class> classmateClass = new ArrayList<>();

    public Classmate(String name, int age, String id, String date) {

        setName(name);
        setAge(age);
        setId(id);
        setDate(date);  
    }

    public void addClasss(Classs classs) {

        Classmate_Class classmate_Class = new Classmate_Class(this, classs);
        classmateClass.add(classmate_Class);
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
        while (age < 0) {
            System.out.println("Invalid value, put again...");
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}