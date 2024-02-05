public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Carga em porcentagem: " + this.carga +"%");
        
    }
    
    void statustampadaounao(){
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada == true){
                System.out.println("Error! Não posso rabiscar pois a caneta está tampada");
        }else{
            System.out.println("Posso rabiscar pois a caneta está destampada");
        }
    }
    
    public void tampar(){
        this.tampada = true;

    }

    public void destampar(){
        this.tampada = false;

    }
}