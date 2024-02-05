public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor ="Azul";
        c1.ponta = (float) 0.5;
        c1.tampada = false;
        c1.modelo = "Bic";
        c1.destampar();
        c1.statustampadaounao();
        c1.rabiscar();
        

        Caneta c2 = new Caneta();
        c2.modelo = "Print";
        c2.cor ="Preta";
        c2.ponta= (float) 0.7;
        c2.tampar();
        c2.statustampadaounao();
        c2.rabiscar();



        
        
    }
}
