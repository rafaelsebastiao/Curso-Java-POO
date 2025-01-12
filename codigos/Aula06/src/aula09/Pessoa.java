package aula09;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    
    
    
    public Pessoa(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public void fazerAniversario(){
       this.setIdade(this.getIdade() + 1);
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    
    
}
