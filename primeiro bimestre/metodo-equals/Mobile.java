public class Mobile{
  
    private String marca;
    private String modelo;
  
    public Mobile(){
      this.marca = "";
      this.modelo ="";
    }
  
    public Mobile(String marca, String modelo){
      this.marca = marca;
      this.modelo = modelo;
    }
  
    public String getMarca(){
      return this.marca;
    }
  
    public void setMarca(String marca){
      this.marca = marca;
    }
  
      public String getModelo(){
      return this.modelo;
    }
  
    public void setModelo(String modelo){
      this.modelo = modelo;
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

        Mobile other = (Mobile) obj;
        if(modelo == null){
          if(other.modelo != null){
            return false;
          }
        }

        if(marca == null){
          if(other.marca != null){
            return false;
          }
        }

        return true;
    }
      
}
  
    