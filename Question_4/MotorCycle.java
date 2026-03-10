package Question_4;
public class MotorCycle extends Vehicle {

    public MotorCycle(String brand) {
        super(brand);
    }
    
    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("Motorcycle is ready to ride.");
    }
}
