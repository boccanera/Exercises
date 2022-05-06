package classesObjectMethods.Car;

import java.time.Year;
import java.util.concurrent.ThreadLocalRandom;

public class xcar {
    private String make;
    private String model;
    private Year modelYear;

    public xcar(String make, String model, Year modelYear) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
    }

    /* The key is to generate a toString() method that prints all the properties */
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }

    public static void main(String[] args) {
        xcar myXcar = new xcar("Tesla", "X", Year.of(2020));
        System.out.println(myXcar);
    }
}
