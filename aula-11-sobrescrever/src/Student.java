public  class Student extends Person{
    private int enrollment;
    private String course;

    // add final ex "public final void paymoth" 

    public void paymentmoth(){
        System.out.println("----Pagamento efetuado----" + this.name);
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
