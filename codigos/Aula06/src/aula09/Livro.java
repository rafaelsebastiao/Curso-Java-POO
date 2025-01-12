package aula09;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
   
    //constructor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.leitor = leitor;
        this.aberto = false;
        
        
        
    }
    
    
    
    //imprime detals about books
    public void detalhes(){
        System.out.println("================");
        System.out.println("    Detalhes");
        System.out.println("================");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
       
        
        System.out.println("Aberto? " + this.getAberto());
        
        System.out.println("Leitor: " + this.getLeitor().getNome());
        System.out.println("Idade: " + this.getLeitor().getIdade());
        System.out.println("Sexo: " + this.getLeitor().getSexo());
        
    }
    
    
    
    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
       setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.getAberto()){
            this.setPagAtual(this.getPagAtual() + p);
        }else{
            System.out.println("Não é possível folhear! O livro está fechado!");
        }
       
    }

    @Override
    public void avancarPag() {
        if(this.getAberto()){
            this.setPagAtual(getPagAtual() + 1);
            System.out.println("Página avançada com sucesso!");
        }else{
            System.out.println("Não é possível avançar! O livro está fechado!");
        }
       
    }

    @Override
    public void voltarPag() {
        if(this.getAberto()){
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Página voltada com sucesso!");
        }else{
             System.out.println("Não é possível voltar! O livro está fechado!");
        }
        
    }
    
    
    
    //especial methods
    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    
    
    
    //setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    
    
}
