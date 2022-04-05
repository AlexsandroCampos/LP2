public class Aluno extends Pessoa{
  private String prontuario;
  private Double ira;

  public Aluno(){
    super();
    this.prontuario = "";
    this.ira = 0.0;
  }
  
  public Aluno(String nome, Integer idade, String prontuario, Double ira){
    super(nome, idade);
    this.prontuario = prontuario;
    this.ira = ira;
  }
  
  public String getProntuario(){
    return this.prontuario;
  }

  public void setProntuario(String prontuario){
    this.prontuario = prontuario;
  }

  public Double getIra(){
    return this.ira;
  }

  public void setIdade(Double ira){
    this.ira = ira;
  }

  public boolean equals(Object obj){
    if(!super.equals(obj)){
      return false;
    }

    else{
      if(this == obj){
        return true;
    }
    
    if(obj == null){
      return false;
    }

    if(getClass() != obj.getClass()){
      return false;
    }

    Aluno other = (Aluno) obj;
    if(prontuario == null){
      if(other.prontuario != null){
        return false;
      }
    }

    else if(!prontuario.equals(other.prontuario)){
      return false;
    }

    if(ira == null){
      if(other.ira != null){
        return false;
      }
    }

    else if(!ira.equals(other.ira)){
      return false;
    }

    return true;

    }
      
  }

 public int hashCode(){
  int resultado = 1;
  resultado = resultado + ((prontuario == null) ? 0 : prontuario.hashCode());
  resultado = resultado + ((ira == null) ? 0 : ira.hashCode());
   resultado = resultado + super.hashCode();
  return resultado;
  }
    
}