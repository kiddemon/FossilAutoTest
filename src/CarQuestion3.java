/*Why is the order of outputs in 2 and 1 different?: b/c it's running without synchronized method is used to lock an object for any shared resource.*/

public class CarQuestion3 implements Runnable{
    int wheel = 4;
    int doors = 4;
    int seats = 5;
    int max_speed;
    public synchronized void run(){
    }

    public void info(){
        System.out.println("wheel equal " + wheel);
        System.out.println("doors equal " + doors);
        System.out.println("seats equal " + seats);
        System.out.println("Max speed equal " + max_speed);
    }

    public static void main(String args[]){
        CarQuestion3 car = new CarQuestion3();
        ThreadedSend t1 = new ThreadedSend(100, car);
        ThreadedSend t2 = new ThreadedSend(200, car);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}

class ThreadedSend extends Thread
{
    int max_speed;
    CarQuestion3  sender;

    ThreadedSend(int maxspeed, CarQuestion3 obj)
    {
        max_speed = maxspeed;
        sender = obj;
    }

    public void run()
    {
        synchronized(sender)
        {
            for(int i =0; i< 10; i++){
                System.out.println("Max speed equal " + max_speed);
            }
        }
    }
}
