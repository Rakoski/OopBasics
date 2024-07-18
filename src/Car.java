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
        System.out.println("Car year = " + year);
        System.out.println("Car model = " + model);
        System.out.println("Car owner = " + dono);
    }

}
