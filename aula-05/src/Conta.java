public class Conta {

    public int numConta;
    protected String tipo;
    private String  dono;
    private float   saldo;
    private boolean status;

    public Conta(float saldo, boolean status){
        this.setSaldo(0);
        this.setStatus(false);
        
    }

    public void estadoAtual(){
        System.out.println("----------------------------------------");
        System.out.println("Conta:" + getnumConta());
        System.out.println("Dono:" + getDono());
        System.out.println("Tipo:" + getTipo());
        System.out.println("Saldo:" + getSaldo());
        System.out.println("Status:" + getStatus());
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
            this.saldo = saldo;
    }


    public int getnumConta(){
        return numConta;
    }
    
    public void setnumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    } 

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;

    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);

        if (t == "CC" ) {
            setSaldo(50);   
        }
            else if (t == "CP"){
            setSaldo(150);
            }
            else{
            System.err.println("Não foi definido o tipo de conta");
            setStatus(false);
            }
        System.err.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
         
         if (getSaldo() < 0) {
            System.err.println("Conta em débito, não pode ser encerrada.");

         }else if (getSaldo() > 0) {
            System.out.println("Conta com valor existente:" + getSaldo());
            
         }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
         }
    }

    public void depositarConta(float r){

        if (getStatus()) {
           setSaldo(getSaldo() + r);
           System.out.println("Deposito realizado com sucesso" + getDono());
            
        }else{
            System.err.println("É impossível depositar, pois a conta não foi aberta");
        }

    }

    public void sacarConta(float r){

        if (getStatus()){
            if (getSaldo() >= r) {
               setSaldo(getSaldo() - r);
               System.out.println("Saque realizado com sucesso" + getDono()); 
            }else{
                System.err.println("Saldo Insuficiente");
            }
        }else{
            System.out.println("Conta não foi aberta, impossível sacar");
        }

    }

    public void pagarMensalidade(){
        int va = 0;

        if (getTipo() == "CC") {
            va= 12;
            
        }else if (getTipo() == "CP") {
            va = 20;  
            
        
        }
        if (getStatus()){
            if (getSaldo() > va) {
                setSaldo(getSaldo() - va);
                System.err.println("Mensalidade paga com sucesso ao " + getDono());
            }else{
                System.err.println("Conta sem saldo suficiente"+ getSaldo());
            }

            
        }else{
            System.err.println("Impossível pagar");
        }

    }
    
    public void transFerir(){
        
    }
}

