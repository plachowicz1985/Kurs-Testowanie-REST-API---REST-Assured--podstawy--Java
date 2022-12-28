//stwórz klasę bazową App, która zawiera pole name i metodę appinfo, dodaj konstruktor do którego przekarzesz wartość name
//stwórz klasy potomne AndroidApp i IphoneApp, które zawierają metodę runAdroidApp / runIphoneApp

public class App {

    public String name;

    public App (String name) {
        this.name = name;
    }

    public void appInfo () {

        System.out.println("Running app with name " + name);

    }
}
