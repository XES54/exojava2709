public class User {

    private String login;
    private String password;
    private int age;
    private Boolean administratrice;
    public Boolean getAdministratrice() {
        return administratrice;
    }

    public User(String login, String password, int age) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.administratrice = false;

    }
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.age = 18;
        this.administratrice = true;
    }
    public void setAdministratrice(Boolean administratrice) {
        this.administratrice = administratrice;
    }

    public String email() {
        return login+"@cesi.com";
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void afficherInfo() {
        System.out.println("Login : " + login);
        System.out.println("Password : " + password);
        System.out.println("Age : " + age);
        System.out.println("Email : " + email());
        System.out.println("admin : " + administratrice+"\n");
    }
}

