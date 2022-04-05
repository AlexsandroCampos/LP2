public class Main {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("Alex", 17,  "SP3044297", 8.0);
    Aluno a2 = new Aluno("Alex", 18,  "SP3044297", 8.0);
    System.out.println(a1.getNome());
    System.out.println(a1.equals(a2));
    System.out.println(a1.hashCode());
    System.out.println(a2.hashCode());
  }
}