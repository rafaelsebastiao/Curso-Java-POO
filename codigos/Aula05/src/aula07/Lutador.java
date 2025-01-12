package aula07;

public final class Lutador{
    //methods
    private String nome, nacionalidade, categoria;
    
    private int idade, vitorias, derrotas, empates;
    
    private double altura, peso;
    
    
    //constructor
    public Lutador(String no, String na, int id, double h, double p, int v, int d, int e){
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
    
    
    
    //especial methods
    //gettters
    public String getNome(){
        return(this.nome);
    }
    
    public String getNacionalidade(){
        return(this.nacionalidade);
    }
    
    public String getCategoria(){
        return(this.categoria);
    }
    
    public int getIdade(){
        return(this.idade);
    }
    
    public int getVitorias(){
        return(this.vitorias);
        
    }
    
    public int getDerrotas(){
        return(this.derrotas);
    }
    
    public int getEmpates(){
        return(this.empates);
    }
    
    public double getAltura(){
        return(this.altura);
    }
    
    public double getPeso(){
        return(this.peso);
    }
    
    //settters
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


}