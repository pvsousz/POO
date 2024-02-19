public class App {
    public static void main(String[] args) throws Exception {
            Pessoa[] p = new Pessoa[2];
            livro [] l = new livro[3];

            p[0] = new Pessoa("Hiroko",22,"M");
            p[1] = new Pessoa("Hiromi",19,"F");

            l[0] = new livro("O Silmarillion", "JRR Tolkien", 250 , p[0]);
            l[1] = new livro("O Hobbit", "JRR Tolkien", 220,p[1]);
            l[2] = new livro("A Política da Prudência", "Russel Kirk", 495, p[1]);

            System.out.println(l[1].detalhes()); // to string para aparecer vc precisa colocar dentro de uma string como está <<< 
    }
}

