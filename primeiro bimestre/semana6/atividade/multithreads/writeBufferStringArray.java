package multithreads.multithreads;

import java.security.SecureRandom;

public class writeBufferStringArray implements Runnable{
	private static final SecureRandom
	generator = new SecureRandom();
	private final buffer sharedLocation;
	public writeBufferStringArray(buffer sharedLocation) {
		this.sharedLocation = sharedLocation;
	}
	public void run() {
		int sum = 0;
		for (int count =1;count <=10;count++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sharedLocation.putBufferStringArray(count);
				sum+=count;
				System.out.printf("\t\t\t%d\n",sum);
				}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();				
			}			
		}
		System.out.printf("%n%s %d%n%s%n",
				"Escrita do total de valores: ",
				sum, "Escrita finalizada!");
	}

}
