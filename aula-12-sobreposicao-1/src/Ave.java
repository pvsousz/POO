public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
      System.out.println("Voando");
    }

    @Override
    public void alimentar() {
       System.out.println("Frutas e ou animais de pequeno porte");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public void fazerNinho(){
        System.out.println("Construindo Ninho");
    }
    
}
