public abstract class Person {
    protected String name;
    protected int age;
    protected String sex;
    protected float experience;

    public Person(String name, int age, String sex) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.setExperience(0);
    }

    protected void wonExp(int experience){
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return " Person [name=" + name + ", age=" + age + ", sex=" + sex + ", experience=" + experience + "]";
    }
}
