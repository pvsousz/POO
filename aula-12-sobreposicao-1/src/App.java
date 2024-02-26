public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();


        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
           
        
        c.locomover();
        k.locomover();
        k.emitirSom();
        c.emitirSom();
        
    }
}
