package CarQuestion4;

import java.util.concurrent.Exchanger;
import java.util.logging.Logger;

/**
 *
 */
public class InterleavedRunnable implements Runnable {

    ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private final String name;

    private final Exchanger<Boolean> exchanger;

    private Boolean state;
    private int max_speed;
    /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public InterleavedRunnable(String name, Exchanger<Boolean> exchanger, Boolean state, int max_speed) {
        this.name = name;
        this.exchanger = exchanger;
        this.state = state;
        this.max_speed = max_speed;
    }

    ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    //------------------------ Implements: Runnable

    @Override
    public void run() {
        try {
            for(int i = 0; i< 10; i++)
            while (true) {
                if (state) {
//                    Logger.getLogger(getClass().getName()).info(name + " is running");
                    System.out.println("Max speed equal " + max_speed);
                }
                state = exchanger.exchange(state);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(name).info("Interrupted");
        }
    }

    //------------------------ Overrides:

    //---------------------------- Abstract Methods -----------------------------

    //---------------------------- Utility Methods ------------------------------

    //---------------------------- Property Methods -----------------------------     

}