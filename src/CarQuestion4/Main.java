package CarQuestion4;
import java.util.concurrent.Exchanger;

public class Main {
    ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exchanger<Boolean> exchanger = new Exchanger<Boolean>();
        Thread thread1 = new Thread(new InterleavedRunnable("Thread 1", exchanger, true, 100));
        Thread thread2 = new Thread(new InterleavedRunnable("Thread 2", exchanger, false, 200));
        thread1.start();
        thread2.start();
    }

    //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    //------------------------ Implements:

    //------------------------ Overrides:

    //---------------------------- Abstract Methods -----------------------------

    //---------------------------- Utility Methods ------------------------------

    //---------------------------- Property Methods -----------------------------

}
