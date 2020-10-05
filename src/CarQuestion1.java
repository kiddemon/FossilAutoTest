public class CarQuestion1 {
    int wheel = 4;
    int doors = 4;
    int seats = 5;
    int max_speed;
    public void run(){
        for(int i =0; i< 10; i++){
            System.out.println("Max speed equal " + max_speed);
        }
    }

    public void info(){
        System.out.println("wheel equal " + wheel);
        System.out.println("doors equal " + doors);
        System.out.println("seats equal " + seats);
        System.out.println("Max speed equal " + max_speed);
    }

    public static void main(String[] args) {
        CarQuestion1 toyotaCar = new CarQuestion1();
        toyotaCar.max_speed = 100;
        toyotaCar.run();
        CarQuestion1 bmwCar = new CarQuestion1();
        bmwCar.max_speed = 200;
        bmwCar.run();
    }
}
