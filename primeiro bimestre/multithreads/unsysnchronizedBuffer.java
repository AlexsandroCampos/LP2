package multithreads.multithreads;

import java.util.*;

public class unsysnchronizedBuffer implements buffer {
	private int buffer = -1;
	private int i = 0;
	private int j = 0;
	private int z = 0;
	private int a = 0;

	private List<Integer> bufferIntArray;
	private List<Double> bufferDoubleArray;
	private List<String> bufferStringArray;

	public unsysnchronizedBuffer() {
		bufferIntArray = new ArrayList<>();
		bufferIntArray.add(0);
		bufferDoubleArray = new ArrayList<>(10);
		bufferDoubleArray.add(0.0);
		bufferStringArray = new ArrayList<>(10);
		bufferStringArray.add("0");
	}

	@Override
	public void putBuffer(int value) throws InterruptedException {
		System.out.printf("Escrita valor do putBuffer: \t\t\t\t%d", value);
		buffer = value;
	}

	@Override
	public int getBuffer() throws InterruptedException {
		System.out.printf("Leitura valor do getBuffer: \t\t\t\t%d", buffer);
		return buffer;
	}

	@Override
	public void putBufferIntArray(int value) throws InterruptedException {
		System.out.printf("Escrita valor do putBufferIntArray: \t\t%d", value);
		bufferIntArray.add(a,value);
		a++;
	}

	@Override
	public int getBufferIntArray() throws InterruptedException {
		int readValue = bufferIntArray.get(i);
		System.out.printf("Leitura valor do getBufferIntArray: \t\t%d", readValue);
		if(i != 10) {
			if(bufferIntArray.size()-i>1)
				i++;
		}
		return readValue;
	}

	@Override
	public void putBufferDoubleArray(double value) throws InterruptedException {
		System.out.printf("Escrita valor putBufferDoubleArray: \t\t%,.2f", value);
		bufferDoubleArray.add(value);
	}

	@Override
	public double getBufferDoubleArray() throws InterruptedException {
		double readValue = bufferDoubleArray.get(j);
		System.out.printf("Leitura valor do getBufferDoubleArray: \t\t%,.2f", readValue);
		if(j != 10) {
			if(readValue != 0 && bufferDoubleArray.get(j+1) != 0)
				j++;
		}
		return readValue;
	}

	@Override
	public void putBufferStringArray(String value) throws InterruptedException {
		System.out.printf("Escrita valor do putBufferStringArray: \t\t%s", value);
		bufferStringArray.add(value);
	}

	@Override
	public int getBufferStringArray() throws InterruptedException {
		int actualValue;
		System.out.printf("Leitura valor do getBufferStringArray: \t\t%s", bufferStringArray.get(z));
		if(bufferStringArray.get(z) == null)
			actualValue = 0;
		else {
			actualValue = Integer.parseInt(bufferStringArray.get(z));
			if(z != 10) {
				if(actualValue != 0 &&  bufferStringArray.get(z) != null)
					z++;
			}
		}
		return actualValue;
	}

}
