public class Livro {
    String editora;
    String titulo;
    int numerodepagina;
    String autor;
    boolean aberto;

    void statusLivro(){
        System.out.println("Status do livro: " + this.aberto);
    }

    void abrirLivro(){
        this.aberto = true;


    }

    void fecharLivro(){
        this.aberto = false;

    }

    void lerLivro(){

        if(aberto == true){
            System.out.println("Consigo ler o livro pois está aberto");
        }else{
            System.out.println("Não consigo ler o livro pois está fechado");
        }

    }


    
}
