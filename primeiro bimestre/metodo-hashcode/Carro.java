public class Carro{
  private String modelo;
  private String cor;

  public Carro(){
    this.modelo ="";
    this.cor ="";
  }

   public Carro(String modelo, String cor){
    this.modelo = modelo;
    this.cor = cor;
  }

  public int hashCode(){
    final int prime = 31;
    int resultado = 1;
    resultado = prime * resultado + ((modelo == null) ? 0 : modelo.hashCode());
    resultado = prime * resultado + ((cor == null) ? 0 : cor.hashCode());
    return resultado;
  }
}