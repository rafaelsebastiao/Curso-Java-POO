package aula011;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento(double aum){
        this.setSalario(this.getSalario() + aum);
        System.out.println("Salário aumentado com sucesso!");
        System.out.println("Salário antigo: " + (this.getSalario() - aum));
        System.out.println("Novo salário: " + this.getSalario());
        
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome="+ getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() +   ", especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
    
 
    
}
