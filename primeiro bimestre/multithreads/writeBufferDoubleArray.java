package multithreads.multithreads;

import java.security.SecureRandom;
import java.util.*;

public class writeBufferDoubleArray implements Runnable {
	private List<Double> listDouble = new ArrayList<>();
	private static final SecureRandom
	generator = new SecureRandom();
	private final buffer sharedLocation;
	public writeBufferDoubleArray(buffer sharedLocation, List<Double> _listDouble) {
		listDouble.addAll(_listDouble);
		this.sharedLocation = sharedLocation;
	}
	public void run() {
		double sum = 0.0;
		for (int count = 0;count < 10;count++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sharedLocation.putBufferDoubleArray(listDouble.get(count));
				sum+=listDouble.get(count);
				System.out.printf("\t\t\t%,.2f\n",sum);
				}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();				
			}			
		}
		System.out.printf("%n%s %,.2f%n%s%n",
				"Escrita do total de valores: ",
				sum, "Escrita finalizada!");
	}
}
