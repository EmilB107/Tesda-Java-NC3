/*
    1. Create a base class called Vehicle with the following attributes:
    - make (String): The make of the vehicle.
    - model (String): The model of the vehicle.
    - year (int): The manufacturing year of the vehicle.

    2. Create a derived class called Car that extends the Vehicle class.
    The Car class should have an additional attribute:
    - numberOfDoors (int): The number of doors in the car.

    3. Create an instance of the Car class and set values for its attributes.

    4. Implement a method in the Car class called displayDetails() that prints out
    the details of the car, including the inherited attributes from the Vehicle class.

    Sample output:
    Car Details:
    Make: Toyota
    Model: Camry
    Year: 2022
    Number of Doors: 4
*/
package chapter5.task13;

public class Task13 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 4);

        myCar.displayDetails();
    }
}

class Vehicle {
    private final String make;
    private final String model;
    private final int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private final int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}