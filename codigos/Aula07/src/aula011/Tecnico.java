package aula011;

public final class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar(){
        System.out.println("Praticando...");
        
    }
    
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int rp) {
        this.registroProfissional = rp;
    }
    
    @Override
    public String toString(){
        return "Aluno{" + "nome="+ getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() +   ", matricula=" + getMatricula() + ", curso=" + getCurso() + ", registro profissional= " + registroProfissional +'}';
    }
    
    
}
