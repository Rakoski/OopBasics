package primeiro;

public class Car {
    String model;
    static String dono;
     int year;

    public Car() {
        this("Gol", "Mateus");
    }

    public Car(String model, String dono) {
        this.model = model;
        dono = dono;
        this.display();
    }

    public void display() {
        System.out.println("primeiro.Car year = " + year);
        System.out.println("primeiro.Car model = " + model);
        System.out.println("primeiro.Car owner = " + dono);
    }

}
