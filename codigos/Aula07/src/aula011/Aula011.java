package aula011;

public class Aula011 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();
        
        a1.setNome("Mariana");
        a1.setIdade(17);
        a1.setSexo("F");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        
        b1.setNome("Myke");
        b1.setIdade(22);
        b1.setSexo("M");
        b1.setMatricula(1112);
        b1.setCurso("Eletrônica");
        b1.setBolsa(12.5);
        
        t1.setNome("Marcos");
        t1.setIdade(25);
        t1.setSexo("M");
        t1.setMatricula(1113);
        t1.setCurso("Informática");
        t1.setRegistroProfissional(5443);
        
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
        
        a1.pagarMensalidade();
        t1.pagarMensalidade();
        b1.pagarMensalidade();
        
    }
    
  
    
}
