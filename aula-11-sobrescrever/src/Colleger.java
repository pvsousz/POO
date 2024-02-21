public final class Colleger extends Student {
    private int scholarship;
    

    public void renewScholar(){
        System.out.println("Bolsa renovada Sr(a) " + this.name);
    }
 
    @Override
    public void paymentmoth() {
        System.out.println("----Pagamento efetuado---" + this.name);
    }

    public int getScholarship() {
        return scholarship;
    }


    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
}
