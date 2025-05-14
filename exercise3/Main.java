package exercise3;

import java.util.Scanner;

public class Main {
    
    public static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        
        Classs[] classes = new Classs[2];
        System.out.println("Put new classes");
        for (int i = 0; i < 2; i++) {
            System.out.println("Put the local");
            String local = scanner.next();
            System.out.println("Put the Quantity of Tables");
            int quantityTables = scanner.nextInt();
            System.out.println("Put the id");
            String id = scanner.next();

            classes[i] = new Classs(local, quantityTables, id);
        }
        
        Classmate[] classmates = new Classmate[3];
        System.out.println("Put new classemate");
        for (int i = 0; i < 3; i++) {
            System.out.println("Put the name");
            String name = scanner.next();
            System.out.println("Put the age");
            int age = scanner.nextInt();
            System.out.println("Put the id");
            String id = scanner.next();
            System.out.println("Put the date");
            String date = scanner.next();

            classmates[i] = new Classmate(name, age, id, date);

            while (true) {
                System.out.println("""
                        1 - Leave;
                        2 - Add a new class for this classmate;
                        """);
                int menu = scanner.nextInt();

                if (menu == 1) {
                    break;
                }
                else if (menu == 2) {
                    System.out.println("Put the id of this class:");
                    String idClass = scanner.next();
                    if (getClassById(classes, idClass) == null) {
                        System.out.println("Invalid value, put again...");
                    }
                    else {
                        classmates[i].addClasss(getClassById(classes, id));
                    }
                }
                else {
                    System.out.println("Invalid value...");
                }
            }
        }

        System.out.println("All the classes for every classmate:"); 
        for (Classmate classmate : classmates) {
            for (int i = 0; i < classmate.classmateClass.size(); i++) {
                System.out.printf("The %d° class%nLocal : %s%nQuantity Tables : %d%nId : %s%n",
                    i + 1, classmate.classmateClass.get(i).getClasss().getLocal(), 
                    classmate.classmateClass.get(i).getClasss().getQuantityTables(),
                    classmate.classmateClass.get(i).getClasss().getId());
            }
        }
        
        System.out.println("All the classmates for every class:"); 
        for (Classs classs : classes) {
            for (int i = 0; i < classs.classmateClass.size(); i++) {
                System.out.printf("The %d° class%nName : %s%nAge : %d%nId : %s%nDate : %s%n",
                    i + 1, classs.classmateClass.get(i).getClassmate().getName(), 
                    classs.classmateClass.get(i).getClassmate().getAge(),
                    classs.classmateClass.get(i).getClassmate().getId(),
                    classs.classmateClass.get(i).getClassmate().getDate());
            }
        }
    }

    public static Classs getClassById(Classs[] classes, String id) {

        for (Classs classs : classes) {
            if (classs.getId().equals(id)) {
                return classs;
            }
        }
        return null;
    }

    public static Classmate getClassmateById(Classmate[] classmates, String id) {

        for (Classmate classmate : classmates) {
            if (classmate.getId().equals(id)) {
                return classmate;
            }
        }
        return null;
    }
}
