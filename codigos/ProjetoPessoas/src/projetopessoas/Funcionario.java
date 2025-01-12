package projetopessoas;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public Funcionario(){
        this.trabalhando = false;
    }
    
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
}
