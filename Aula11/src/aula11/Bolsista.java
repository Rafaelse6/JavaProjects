package aula11;
public class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void RenovarBolsa(){
        
        System.out.println("Renovando bolsa de " + this.getNome());
    
    }
    
    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }
}
