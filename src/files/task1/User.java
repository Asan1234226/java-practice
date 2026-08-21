package files.task1;

public class User {
    private int id;
    private String login;
    private String birthdate;
    private String country;

    public User(int id, String login, String birthdate, String country) {
        this.id = id;
        this.login = login;
        this.birthdate = birthdate;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
