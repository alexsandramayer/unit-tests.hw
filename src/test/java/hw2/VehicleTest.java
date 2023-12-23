package hw2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    @DisplayName("Экземпляр объекта Car также является экземпляром транспортного средства")
    void testInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Объект Car создается с 4-мя колесами")
    void testNumberOfWheels() {
        Car car = new Car("Toyota", "Camry", 2020);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    @DisplayName("Объект Car развивает скорость 60 в режиме тестового вождения")
    void testTestDriveSpeed() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    @DisplayName("В режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0)")
    void testParkingSpeed() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }


    @Test
    @DisplayName("Объект Motorcycle создается с 2-мя колесами.")
    void testNumWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    @DisplayName("Объект Motorcycle развивает скорость 75 в режиме тестового вождения")
    void testTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    @DisplayName("В режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).")
    void testParking() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}