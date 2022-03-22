public class Main {
    public static void main(String[] args) {
    
      Mobile mobile1 = new Mobile("Apple", "G50");
      Mobile mobile2 = new Mobile("Motorola", "G50");

      System.out.println(mobile1.equals(mobile2));
    }
  }