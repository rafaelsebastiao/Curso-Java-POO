package aula011;


public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }
    
    
    //especial methods
    public final int getMatricula(){
        return(matricula);
    }
    
    public final void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public final String getCurso() {
        return curso;
    }

    public final void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString(){
        return "Aluno{" + "nome="+ getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() +   ", matricula=" + matricula + ", curso=" + curso + '}';

    }
    
  
   
    
}
