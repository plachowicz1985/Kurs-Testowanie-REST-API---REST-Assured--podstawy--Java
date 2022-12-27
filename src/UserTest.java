public class UserTest {
    public static void main(String[] args) {
        //konstruktor jest to specjalna metoda, ktora jest wywolywana podczas tworzenia obiektu( User user = new User(); )
        //w javie jest cos takiego jak konstruktor domyslny, ktorego nie trzeba specjalnie definiowac, ale mozna go napisac jawnie

//        User user = new User();
        User user = new User("Tomek", "QWERTYd");

//        user.username="Piotrek";
//        user.password="qwerty";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
