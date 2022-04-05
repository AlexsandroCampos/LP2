public class Pessoa{
  private String nome;
  private Integer idade;
  
  public Pessoa(){
    this.nome = "";
    this.idade = 0;
  }

  public Pessoa(String nome, Integer idade){
    this.nome = nome;
    this.idade = idade;
  }

  public Pessoa(String nome){
    this.nome = nome;
  }

  public Pessoa(Integer idade){
    this.idade = idade;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public Integer getIdade(){
    return this.idade;
  }

  public void setIdade(Integer idade){
    this.idade = idade;
  }

   public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        
        if(obj == null){
          return false;
        }

        if(getClass() != obj.getClass()){
          return false;
        }

        Pessoa other = (Pessoa) obj;
        if(nome == null){
          if(other.nome != null){
            return false;
          }
        }

        else if(!nome.equals(other.nome)){
          return false;
        }

        if(idade == null){
          if(other.idade != null){
            return false;
          }
        }

        else if(!idade.equals(other.idade)){
          return false;
        }

        return true;
    }

     public int hashCode(){
      int resultado = 1;
      resultado =  resultado + ((nome == null) ? 0 : nome.hashCode());
      resultado =  resultado + ((idade == null) ? 0 : idade.hashCode());
      return resultado;
  }

  
}