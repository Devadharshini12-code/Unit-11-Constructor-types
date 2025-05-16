// Parameters constructor 
class Employee {
    String name;
    int id;

    // Parameterized constructor
    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101);
        emp1.display();
    }
}
