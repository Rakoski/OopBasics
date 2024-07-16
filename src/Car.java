public class Car {
    String model;
     int year;

    public Car() {
        this("unknown", 1977);
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
//        this.display();
    }

    public void display() {
        System.out.println("Car year = " + year);
        System.out.println("Car model = " + model);
    }

}
