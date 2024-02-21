public class App {
    public static void main(String[] args) throws Exception {
        Pessoa      p1 = new Pessoa();
        Aluno       p2 = new Aluno();
        Professor   p3 = new Professor();
        Funcionario p4 = new Funcionario();
       
        p1.setNome("Maria");
        p2.setNome("Hikari");
        p3.setNome("Yuhiko");
        p4.setNome("Shinji");

        p1.setSexo("F");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("M");
    
        p3.setSalario(2500.75f);
        p3.getSalario();


        p3.receberAum(550.20f);

        System.out.println(p3.getSalario());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
