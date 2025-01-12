package praticandoclasses;
        
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Métodos personalizados
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + (this.getStatus() ? "Aberta" : "Fechada" ) );
        System.out.println("-----------------------------");
    }
    
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
       if(this.getTipo() == "cc"){
          this.setSaldo(50);
      }else if(this.getTipo() == "cp"){
          this.setSaldo(150);
      }
      
    System.out.println("Conta aberta com sucesso!");
       
    }
   
    public void fecharConta(){
       if(this.getSaldo() > 0){
           System.out.println("Conta não pode ser fechada porque possui dinheiro!");
       }else if(this.getSaldo() < 0){
           System.out.println("Conta não pode ser fechada porque possui débito!");
       }else{
           this.setStatus(false);
       }   System.out.println("Conta fechada com sucesso!");
    }
   
    
    public void depositar(double valor){
        if(this.getStatus()){
            this.setSaldo(getSaldo() + valor);
            System.out.println("Debosito realizado com sucesso na conta de " + this.getDono() );
        }else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }
        
    }
    
    public void sacar(double valor){
        if(this.getStatus() ){
            if(valor <= this.getSaldo()){
              this.setSaldo(getSaldo() - valor);  
            }else{
                System.out.println("Erro! Saldo insuficiente!");
            }
            
        }else{
            System.out.println("Erro! Conta não encontrada!");
        }
        
    }
    
    public void pagarMensal(){
        
        if(this.getStatus()){
            if(this.getTipo() == "cc"){
                this.sacar(12);
            }else if(getTipo() == "cp"){
                this.sacar(20);
            }        
        }else{
            System.out.println("Erro! Conta não encontrada!");
        }
    }
    
    
    //Métodos especiais
    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    
    public int getNumConta(){
        return(this.numConta);
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public String getTipo(){
        return(this.tipo);
    }
    
    public void setTipo(String t){
       this.tipo = t;
    }
   
    public String getDono(){
       return(this.dono);
    }
   
    public void setDono(String d){
       this.dono = d;
    }
   
    public double getSaldo(){
       return(this.saldo);
    }
   
    public void setSaldo(double s){
       this.saldo = s;
    }
   
    public boolean getStatus(){
       return(this.status);
    }
   
    public void setStatus(boolean s){
        this.status = s;
    }
   
   
   
    
    
    
    
    
    
    
    
    
}
