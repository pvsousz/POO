public class livro implements Publicacao {
    private String titulo;
    private String autor;
    private int   totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    

 

    public livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "livro \n[titulo=" + titulo + "\n autor=" + autor + ", totPaginas=" + totPaginas + "\n pagAtual=" + pagAtual + ", aberto=" + aberto + "\n leitor=" + leitor + "]";


    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getTotPaginas() {
        return totPaginas;
    }


    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }


    public int getpagAtual() {
        return pagAtual;
    }


    public void setpagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }


    public boolean getAberto() {
        return aberto;
    }


    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }


    public Pessoa getLeitor() {
        return leitor;
    }


    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    @Override
    public void abrir() {
       this.setAberto(false);
    }


    @Override
    public void fechar() {
      
    }


    @Override
    public void folhear(int pagina) {
        this.getpagAtual();
        
    }


    @Override
    public void avancarPag() {
        this.setpagAtual(this.getpagAtual() + 1);
    }


    @Override
    public void voltarPag() {
      this.setpagAtual(this.getpagAtual() - 1);
    }


}
