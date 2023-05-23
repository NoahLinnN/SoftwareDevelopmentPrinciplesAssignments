import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void createNewCarWithValidLicencePlateGivesNoException() {
        new Car("123-AB-1",40,1/20.0);
    }

    @Test
    void newCarHasFullTank(){
        Car car = new Car("123-AB-1",40,1/20.0);
        assertEquals(40,car.getFuel());
    }

    @Test
    void carWhenDriving50kmConsumes5LiterOfFuel(){
        Car car = new Car("123-AB-1",40,1/10.0);
        car.drive(50);
        assertEquals(35,car.getFuel());
    }

    @Test
    void carWithEmptyTankCannotDrive() {
        Car car = new Car("123-AB-1",50,1/10.0);
        car.drive(50);
        car.drive(1);
//        Check if
//        assertThrows(IllegalStateException.class, ()->{
//            car.drive(10);
//        });
    }


}
