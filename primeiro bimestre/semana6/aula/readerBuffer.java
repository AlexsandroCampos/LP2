import java.security.SecureRandom;

/**
 * readerBuffer
 */
public class readerBuffer implements Runnable{
    private static final SecureRandom generator = new SecureRandom();
    private final buffer sharedLocation;

    public readerBuffer(buffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }

    public void run() {
        int sum = 0;
        for (int count = 0; count <= 10; count++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                sum += sharedLocation.getBuffer();
                System.out.printf("\t\t\t%2d%n", sum);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.printf("%n%s %d%n%s%n", "Leitura do total de valores: ", sum, "leitura finalizada");
    }
    
}