package aula09;


public class Aula09 {
    public static void main(String [] args){
        Pessoa [] p = new Pessoa[3];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa("Rafael", 19, 'M');
        p[1] = new Pessoa("Maria", 25, 'F');
        
        l[0] = new Livro(
                "Percy Jackson e o Ladrão de Raios",
                "Rick Riordan",
                320,
                p[0]
                );
        
        l[1] = new Livro(
                "Jogos Vorazes",
                "Suzane Collins",
                350,
                p[1]
        );
        //p1.fazerAniversario();
        
        l[1].abrir();
        l[1].folhear(350);
        l[1].fechar();
        
        l[1].detalhes();
        
       
    }
    
    
    
}
