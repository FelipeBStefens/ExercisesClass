package exercise1;

public class Classmate {

    private final Address address;
    private final String name;
    private final int yearsOld;
    private final String classroom;

    public Classmate(Address address, String name, int yearsOld, String classroom) {

        this.address = address;
        this.name = name;
        this.yearsOld = yearsOld;
        this.classroom = classroom;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public String getClassroom() {
        return classroom;
    }
}