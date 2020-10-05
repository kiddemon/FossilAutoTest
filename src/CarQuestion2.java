

public class CarQuestion2 implements Runnable{
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

    public static void main(String args[]){
        CarQuestion2 toyotaCar = new CarQuestion2();
        toyotaCar.max_speed = 100;
        CarQuestion2 bmwCar = new CarQuestion2();
        bmwCar.max_speed = 200;
        Thread t1 =new Thread(toyotaCar);
        Thread t2 =new Thread(bmwCar);
        t1.start();
        t2.start();
    }
}

