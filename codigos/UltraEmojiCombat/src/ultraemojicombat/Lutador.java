package ultraemojicombat;


public class Lutador{
    //methods
    private String nome, nacionalidade, categoria, tipoAtaque;
    
    private int idade, vitorias, derrotas, empates, vida;
    
    private double altura, peso;
    
    private boolean ataque;
    
    
    //constructor
    public Lutador(String no, String na, int id, double h, double p, int v, int d, int e){
        this.setVida(100);
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(h);
        this.setPeso(p);
        
        
        this.setVitorias(v);
        this.setDerrotas(d);
        this.setEmpates(e);
       
    }
    //methods
    public void apresentar(){
        System.out.println("-----------------------------------------");
        System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR: " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.printf("Com %d anos e %.2fm\n", this.getIdade(), this.getAltura());
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void status(){
        System.out.printf("%s é um peso %s\n", this.getNome(), this.getCategoria());
        System.out.printf("Ganhou %d vezes\n", this.getVitorias());
        System.out.printf("Perdeu %d vezes\n", this.getDerrotas());
        System.out.printf("Empatou %d vezes\n", this.getEmpates());
        System.out.println(getVida() + " pontos de vida");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
   
    
    public void atacar(String tipoAtaque){
        setAtaque(true);
        setTipoAtaque(tipoAtaque);
        
        
    }
    
    public void sofrerDano(int d){
        this.setVida(this.getVida() - d);
    }
       
    //especial methods
    //gettters
    public int getVida(){
        return vida;
    }
    
    public String getTipoAtaque(){
        return tipoAtaque;
    }

    public boolean getAtaque() {
        return ataque;
    }
    
    
    public String getNome(){
        return(nome);
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public String getCategoria(){
        return(categoria);
    }

    public int getIdade() {
        return idade;
    }
    
    
    
    public int getVitorias(){
        return vitorias;
        
    }
    
    public int getDerrotas(){
        return derrotas;
    }
    
    public int getEmpates(){
        return empates;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double getPeso(){
        return(this.peso);
    }
    
    //settters
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public void setNome(String no){
        this.nome = no;
    }
    
    public void setNacionalidade(String na){
        this.nacionalidade = na; 
    }
    
    private void setCategoria(){
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        }else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido!";
        }
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    
    public void setVitorias(int v){
        this.vitorias = v;
    }
    
    public void setDerrotas(int d){
        this.derrotas = d;
    }
    
    public void setEmpates(int e){
        this.empates = e;
    }
    
    public void setAltura(double h){
        this.altura = h;
    }
    
    public void setPeso(double p){
        this.peso = p;
        this.setCategoria();
    }

    public void setAtaque(boolean ataque) {
        this.ataque = ataque;
    }
    
    private void setTipoAtaque(String ta){
        this.tipoAtaque = ta;
    }
    

}