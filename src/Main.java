public class Main {

    public static void main(String[] args) {


        User admin = new User("admin", "azerty");

        User tom = new User("Tom", "123", 30);

        System.out.println(admin.getLogin());
        System.out.println(admin.getPassword());
        System.out.println(admin.getAge());


        System.out.println(tom.getLogin());
        System.out.println(tom.getPassword());
        System.out.println(tom.getAge());



    }

}