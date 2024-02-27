public class Viewer extends Person {
   
    private String login;
    private int totalWatching;

    public Viewer(String name, int age, String sex, String login) {
        super(name, age, sex);
        this.setLogin(login);
        this.setTotalWatching(0);
    }

    public void viewerOneMore(){
        
    }


    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    public int getTotalWatching() {
        return totalWatching;
    }


    public void setTotalWatching(int totalWatching) {
        this.totalWatching = totalWatching;
    }

    @Override
    public String toString() {
        return "Viewer [login= " + login + super.toString()+"\n totalWatching=" + totalWatching + "]";
    }

   
}
