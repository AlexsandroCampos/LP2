package multithreads.multithreads;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.*;

public class mainMultiThreads {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService threadRun = Executors.newCachedThreadPool();
		buffer sharedLocation = new unsysnchronizedBuffer();

		List<Double> _listDouble = Arrays.asList(1.6,5.3,3.1,4.3,5.3,6.8,7.8,5.7,3.0,1.8);
		List<Integer> _listInteger = Arrays.asList(2,4,1,7,3,5,9,6,8,10);
		List<String> _listString = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
		
		System.out.printf("Thread running\t\t\t\t\t\t\t\tValue\t " + "Sum write\tSum read\n");
		System.out.println("-------------------------------------------------------------------------------------------");
//		threadRun.execute(new writeBuffer(sharedLocation));
//		threadRun.execute(new readBuffer(sharedLocation));
		threadRun.execute(new writeBufferIntArray(sharedLocation, _listInteger));
		threadRun.execute(new readBufferIntArray(sharedLocation));
//		threadRun.execute(new writeBufferDoubleArray(sharedLocation, _listDouble));
//		threadRun.execute(new readBufferDoubleArray(sharedLocation));
//		threadRun.execute(new writeBufferStringArray(sharedLocation));
//		threadRun.execute(new readBufferStringArray(sharedLocation));
		threadRun.shutdown();
		threadRun.awaitTermination(1, TimeUnit.MINUTES);
	}

}
