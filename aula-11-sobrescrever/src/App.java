public class App {
    public static void main(String[] args) throws Exception {
       Guest visitante = new Guest();
        
       visitante.setName("Yamada");
       visitante.toString();

       Student stu = new Student();

       
       stu.setName("Lee");
       stu.paymentmoth();
       stu.setAge(15);
       stu.setSex("M");
       stu.setCourse("Law");

       
       Colleger cgr = new Colleger();
       cgr.setName("Kwazi");
       cgr.setAge(22);
       cgr.setScholarship(12);
       cgr.setCourse("Science of Computer");
       cgr.setEnrollment(55345610);
       cgr.paymentmoth();
    }
}
