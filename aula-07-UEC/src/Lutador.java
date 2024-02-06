public class  Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura,peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
     int vitorias, int derrotas, int empates){

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
    }

    public void apresentar(){
       
        System.out.println("------------------------------------------------------------------");
        System.out.println("Nascido nas regiões obscuras da internet mais exatamente " + getNacionalidade());
        System.out.println("Com " + getIdade() + " anos ");
        System.out.println("Medindo exatamente " + getAltura() + " metros de altura" );
        System.out.println("Pesando " + getPeso() + "kg");
        System.out.println("Com " + getVitorias() + " Vitórias " + getDerrotas() + " derrotas e " + getEmpates() + " empate.");
        System.out.println("Senhoras e senhores apresento  ele o imbatível eeeeeee " + getNome());
        
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("Peso: "+ getPeso());
        System.out.println("Categoria:" + getCategoria());
        System.out.println("Vitórias:" + getVitorias());
        System.out.println("Derrotas:" + getDerrotas());
        System.out.println("Empates:" + getEmpates());

    }

    public void ganharLuta(){
        setVitorias(getVitorias() +1);

    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        
        if (getPeso() < 52.2) {
            this.categoria = "Inválido";
            
        }else if (getPeso() <= 70.3) {
            this.categoria = "Leve";
            
        }else if (getPeso() <= 83.9) {
            this.categoria = "Médio";

        }else if (getPeso() <= 120.2) {
            this.categoria = "Pesado";
            
        }else{
            this.categoria = "Inválido";
        }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }



}
