public class User {
    public String username;
    public String password;

    public User() {

    }

    public User(String username, String password) {
        System.out.println("Hello z konstruktora");

        //słowo kluczowe this wskazuje nam na obiekt ktory wlasnie tworzymy,
        // this.username wskazuje nam na pole nowoutworzonego obiektu
        this.username = username;
        this.password = password;

    }

    public void sayHello() {
        System.out.println("Hello, my name is "+username);
    }
}
