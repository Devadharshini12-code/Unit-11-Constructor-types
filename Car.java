// Copy constructor 
class Car {
    String model;
    int year;

    // Parameterized constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }

    // Copy constructor
    Car(Car c) {
        model = c.model;
        year = c.year;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        Car car2 = new Car(car1);  // Using copy constructor

        System.out.println("Original Car:");
        car1.display();

        System.out.println("Copied Car:");
        car2.display();
    }
}