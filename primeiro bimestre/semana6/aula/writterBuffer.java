import java.security.SecureRandom;

public class writterBuffer implements Runnable{
    private static final SecureRandom generator = new SecureRandom();
    private final buffer sharedLocation;

    public writterBuffer(buffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }

    public void run() {
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                sharedLocation.putBuffer(count);
                sum += count;
                System.out.printf("\t\n%2", sum);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Escrita do buffer realizada! \n");
    }
}
