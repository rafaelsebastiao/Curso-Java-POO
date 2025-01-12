package ultraemojicombat;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    
    //metodos públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else{
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    public void atualizaLuta(){
        if(getAprovada()){
            if(getDesafiado().getAtaque()){
                //Analizar tipo de ataque
                if(getDesafiado().getTipoAtaque().equals("soco")){
                    getDesafiante().sofrerDano(20);
                }else if(getDesafiado().getTipoAtaque().equals("chute")){
                    getDesafiante().sofrerDano(40);
                }
                
                getDesafiado().setAtaque(false);
            }else if(getDesafiante().getAtaque() ){
                //Analizar tipo de ataque
                if(getDesafiante().getTipoAtaque().equals("soco")){
                    getDesafiado().sofrerDano(20);
                }else if(getDesafiante().getTipoAtaque().equals("chute")){
                    getDesafiado().sofrerDano(20);
                }
                
                
                getDesafiante().setAtaque(false);
            }
            
            if(getDesafiado().getVida() <= 0){
                System.out.println("Vitória do " + getDesafiante().getNome());
            }else if(getDesafiante().getVida() <= 0){
                System.out.println("Vitória do " + getDesafiado().getNome());
            }
            
        }
    }
    
    public void lutar(){
        if(getAprovada()){
            System.out.println("### DESAFIADO ###");
            getDesafiado().apresentar();
            
            System.out.println("### DESAFIANTE ###");
            getDesafiante().apresentar();
            
            
            
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    //métodos especiais
    //getters
    public Lutador getDesafiante() {
        return desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    //settters
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
