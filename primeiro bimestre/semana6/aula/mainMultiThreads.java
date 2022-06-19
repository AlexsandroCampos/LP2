import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class mainMultiThreads {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadRun = Executors.newCachedThreadPool();
        buffer sharedLocation = new unsysnchronizedBuffer();

        System.out.printf("Thread runing\t\tValue\t" + "sum write\tSum read\n");
        System.out.println("-------------------------");
        threadRun.execute(new writterBuffer(sharedLocation));
        threadRun.execute(new readerBuffer(sharedLocation));
        threadRun.shutdown();
        threadRun.awaitTermination(1, TimeUnit.MINUTES);
    }
}
