package classesObjectMethods.Car;

import java.time.Year;
import java.util.concurrent.ThreadLocalRandom;

public class Car {
    private String make;
    private String model;
    private Year modelYear;

    private Integer chassi = ThreadLocalRandom.current().nextInt(100, 1000);

    public Car(String make, String model, Year modelYear) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
//     this.chassi = chassi;
    }

    /* The key is to generate a toString() method that prints all the properties */
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear + '\'' +
                ", chassi=" + chassi +
                '}';
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "X", Year.of(2020));
        System.out.println(myCar);

    }
}