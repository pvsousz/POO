public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Uma caneta " + this.cor);
        
    }

    void statustampadaounao(){
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true){
                System.out.println("Error! Não posso rabiscar pois a caneta está tampada");
        }else{
            System.out.println("Posso rabiscar pois a caneta está destampada");
        }
    }
    
    void tampar(){
        this.tampada = true;

    }

    void destampar(){
        this.tampada = false;

    }
}
