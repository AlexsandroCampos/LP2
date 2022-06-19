package multithreads.multithreads;

public class unsysnchronizedBuffer implements buffer {
	private int buffer = -1;
	
	public void putBuffer(int value) 
			throws InterruptedException{
		System.out.printf("Escrita valor: \t\t%d", value);
		buffer = value;
	}
	public int getBuffer() throws InterruptedException{
		System.out.printf("Leitura valor: \t\t%d", buffer);
		return buffer;
	}
}
