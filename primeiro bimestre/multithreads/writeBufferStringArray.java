package multithreads.multithreads;

import java.security.SecureRandom;
import java.util.*;

public class writeBufferStringArray implements Runnable{
	private List<String> listString = new ArrayList<>();
	private static final SecureRandom
	generator = new SecureRandom();
	private final buffer sharedLocation;
	public writeBufferStringArray(buffer sharedLocation, List<String> _listString) {
		listString.addAll(_listString);
		this.sharedLocation = sharedLocation;
	}
	public void run() {
		int sum = 0;
		for (int count = 0;count < 10;count++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sharedLocation.putBufferStringArray(listString.get(count));
				int actualValue = Integer.parseInt(listString.get(count));

				sum+=actualValue;
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
