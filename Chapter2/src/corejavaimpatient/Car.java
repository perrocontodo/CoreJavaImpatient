/*
9. Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to
drive by a given number of miles, to add a given number of gallons to the gas tank, and to get the current distance from
the origin and fuel level. Specify the fuel efficiency (in miles/gallons) in the constructor. Should this be an
immutable class? Why or why not?
*/


package corejavaimpatient;

class Car {
    private final Integer fuelEfficiency; // we only set fuelEfficiency once, that's why it's a "final" variable
    private Integer milesCounter;
    private Double gasTankLevel;

    Car(Integer fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        milesCounter = 0;
        gasTankLevel = 100.0; // assuming a 100 gallon tank to start
        System.out.printf("Car started. 0 miles driven. Gas tank full (100 gallons). You reported %d of " +
                "fuel efficiency (miles per gallon)\n", fuelEfficiency);
    }

    void Drive(Integer milesToDrive) {
        if (gasTankLevel * fuelEfficiency >= milesToDrive) {
            milesCounter += milesToDrive;
            gasTankLevel -= milesToDrive / fuelEfficiency;
        } else {
            System.out.println("Don't have enough gas to drive that distance\n");
        }
    }

    void AddGas(Integer gallonsOfGas) {
        if (gasTankLevel + gallonsOfGas <= 100) {
            gasTankLevel += gallonsOfGas;
        } else {
            System.out.println("Gas tank can hold no more than 100 gallons");
        }

    }

    void GetStats() {
        System.out.printf("Miles driven so far: %d\n", milesCounter);
        System.out.printf("Gallons in the tank: %f\n", gasTankLevel);
    }
}
