public class App {
    public static void main(String[] args) throws Exception {
        Livro c1 = new Livro();
        c1.autor = "José Leopoldino";
        c1.editora = "Caras";
        c1.numerodepagina = 256;
        c1.titulo = "Reflexões sobre a vida";
        c1.aberto = false;
        c1.statusLivro();
        c1.abrirLivro();
        c1.statusLivro();
        c1.lerLivro();
        c1.fecharLivro();
        c1.lerLivro();

        Livro c2 = new Livro();
        c2.abrirLivro();
        c2.lerLivro();
        c2.statusLivro();

    }
}
