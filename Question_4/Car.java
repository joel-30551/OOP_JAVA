package Question_4;
public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }
    
    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("The car is ready to drive.");
    }
}
