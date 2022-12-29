
package aula011;

public class Bolsista extends Aluno {
    private float bolsa;
    protected void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno " + this.nome);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista, pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
            
}
