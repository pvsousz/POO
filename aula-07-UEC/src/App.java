public class App {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6]; 
        
        l[0] = new Lutador("Pretty Boy", "França", 31, (float) 1.75, (float) 68.9, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, (float) 1.68, (float) 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, (float) 1.65, (float) 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, (float) 1.93, (float) 81.6, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil",37, (float) 1.70, (float) 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, (float) 1.81, (float) 105.7, 12, 2, 4);
        
        Luta UEC01 = new Luta();

        UEC01.marcarLuta(l[4],l[5]);
        UEC01.lutar();
        

    }
}
