package aula011;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public final void fazerAniversario(){
        idade++;
    }
    
    public final String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final int getIdade() {
        return idade;
    }

    public final void setIdade(int idade) {
        this.idade = idade;
    }

    public final String getSexo() {
        return sexo;
    }

    public final void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "Visitante{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    
    
}
