public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta(0, false);
        c1.setnumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");

        Conta c2 = new Conta(0,false);
        c2.setnumConta(2222);
        c2.setDono("Creusa");
        c2.abrirConta("CP");


        c1.estadoAtual();
        c2.estadoAtual();
        

    }
}
