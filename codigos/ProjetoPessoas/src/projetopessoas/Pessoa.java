package projetopessoas;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    
    public String getNome(){
        return (nome);
    }
    
    public int getIdade(){
        return(idade);
    }
    
    public char getSexo(){
        return(sexo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    
    
    
}
