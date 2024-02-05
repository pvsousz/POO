public class ControleRemoto implements Controlador{
  

    private int volume;
    private boolean ligado;
    private boolean tocando;

    
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


    private int getVolume() {
        return volume;
    }


    private void setVolume(int volume) {
        this.volume = volume;
    }


    private boolean getLigado() {
        return ligado;
    }


    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


    private boolean getTocando() {
        return tocando;
    }


    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Tv está inicializando...");
        
    }


    @Override
    public void desligar() {
       this.setLigado(false);
        
    }


    @Override
    public void abrirMenu(){
        if (getLigado()) {
        System.out.println("----Menu----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume " + this.getVolume());
        for (int i = 0; i<= this.getVolume(); i+=10){
            System.out.print("/");
            
        }
            

        }else{
            System.out.println("Tv não está ligada");
        }
       
          
    }


    @Override
    public void fecharMenu() {
        System.out.println(" Fechando menu...");
        
    }


    @Override
    public void maisVolume() {
        if (getLigado()) {
            this.setVolume(getVolume() + 5);
            
        }else{
            System.out.println("Impossível aumentar o volume");
        }
    }


    @Override
    public void menosVolume() {
        if (getLigado()) {
            this.setVolume(getVolume() - 5);
            
        }else{
            System.out.println("Impossível diminuir o volume");
        }
    }


    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0) {
            this.setVolume(0);
            
        }
        
    }


    @Override
    public void desligaMudo() {
        if (getLigado() && getVolume() == 0) {
            this.setVolume(50);
        }
       
    }


    @Override
    public void play() {
        if (getLigado() && getTocando() == false) {
            this.setTocando(true);

            
        }else{
            System.out.println("Não consegui reproduzir");
        }
        
    }


    @Override
    public void pause() {
        if (getLigado() && getTocando())  {
            this.setTocando(false);
            
        }else{
            System.out.println("Não consegui pausar");
        }
        
    }

    
}
