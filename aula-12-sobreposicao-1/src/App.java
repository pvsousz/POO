public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();


        m.setPeso((float)35.2);
        m.setCorPelo("Preto");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        r.setCorEscama("Listras");
        r.alimentar();
        r.locomover();
        r.emitirSom();

        a.locomover();
        
    }
}
