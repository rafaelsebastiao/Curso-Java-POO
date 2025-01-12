package aula011;


public final class Bolsista extends Aluno {
    private double bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de: "+ this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.printf("%s é bolsista! Pagamento facilitado!\n", this.getNome());
    }
    
    @Override
    public String toString(){
       return "Aluno Bolsista{" + "nome="+ getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() +   ", matricula=" + getMatricula() + ", curso=" + getCurso() + ", bolsa=" + getBolsa() + '}';
    }
   
    //especial methods
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    
}
