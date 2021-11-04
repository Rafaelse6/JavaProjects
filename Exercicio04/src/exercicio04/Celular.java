
package exercicio04;


public class Celular {
    private String modelo;
    private String cor;
    private int bateria;
    
    /*public Celular(String modelo, String cor, int bateria){  Método construtor
        
        this.modelo = modelo;
        this.cor = cor;
        this.bateria = bateria;
        
    }*/
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getCor(String cor){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public int getBateria(){
       return this.bateria;
    }
    
    public void setBateria(int bateria){
        this.bateria = bateria;
    }
    
   public void status(){
       System.out.println("O modelo do celular é: " + this.getModelo());
       System.out.println("A bateria do celular está em: " + this.getBateria());
       System.out.println("A cor do celular é: " + this.getCor(cor));
   }
  
}
