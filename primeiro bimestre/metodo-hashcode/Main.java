class Main {
  public static void main(String[] args) {
    Carro c1 = new Carro("Honda", "vermelho");
    Carro c2 = new Carro("Civic", "cinza");
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
  }
}