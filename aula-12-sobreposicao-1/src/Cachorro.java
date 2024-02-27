public class Cachorro extends Lobo{

    @Override
    public void locomover() {
        super.locomover();
    }

    @Override
    public void emitirSom() {
       System.out.println("Au! au! au! au!");
    }

    public void reagir(String frase){
       if (frase.equals("Pega a comida") || frase.equals("Oi!")) {
        System.out.println("Abanar e Latir");
       }else{
        System.out.println("Rosnar");
       }
    }

    public void reagir(int hora, int min){
        if (hora< 12){
            System.out.println("Abanar");
        }else if (hora <=18) {
            System.out.println("Ignorar");
        }else if (hora <=20){
            System.out.println("Passear");
        }else{
            System.out.println("Abanar e latir");
        }
        
    }

    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanar e ficar agitado");
        }else{
            System.out.println("Rosnar");
        }
    }   

    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10 ) {
                System.out.println("Abanadinho");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

    
}   

