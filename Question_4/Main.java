package Question_4;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford");
        MotorCycle motorcycle1 = new MotorCycle("Suzuki");

        car1.startEngine();
        System.out.println();
        motorcycle1.startEngine();
    }
}
