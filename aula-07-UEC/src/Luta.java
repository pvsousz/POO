import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1!=l2)) {

            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;

        }else{
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }

    }

    public void lutar(){
        if (aprovada) {
            System.out.println("####DESAFIADO####");
            this.desafiado.apresentar();
            System.out.println("####DESAFIANTE####");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            System.out.println("=======VENCEDOR DA LUTA ======");
            int vencedor = aleatorio.nextInt(3); // Recebe um valor aleatório do tipo inteiro ( 3 representa os 3 números 0,1,2)
            
            switch (vencedor) {
                case 0:  //empate
                    System.out.println("Empatou luta!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();

                    break;

                case 1: // Desafiado vence
                    System.out.println("O grande vencer é " + getDesafiado());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();

                    break;

                case 2: // Desafiante vence
                    System.out.println("O grande vencedor é " + getDesafiante());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();

                    break;
    
            }
            
        }else{
            System.err.println("Luta não poderá acontecer");
        }
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
