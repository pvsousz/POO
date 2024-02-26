public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo alguns seres do mar");
    }

    @Override
    public void emitirSom() {
        System.out.println("BluBluBlu");
    }

    public void soltarBolhas(){
        System.out.println("Soltando Bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
