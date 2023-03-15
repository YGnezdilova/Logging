package org.example;
import org.testng.Assert;
import org.testng.annotations.*;

public class CarTest {
    @Test(groups = "create")
    public void testCreateCar() {
        Car testCar =new Car("Honda", "Blue", 1973, 174);
    }

    @Test(groups = "color")
    public void testChangeColorOfCar() {
        Car testCar = new Car("Lexus", "Red", 3456, 200);
        testCar.SetColor("Blue");
    }
    @Test(groups = "color")
    public void testChangeColorToGold() {
        Car testCar = new Car("Mercedes-Benz", "Black", 3982, 200);
        testCar.SetColor("Gold");
    }

}
