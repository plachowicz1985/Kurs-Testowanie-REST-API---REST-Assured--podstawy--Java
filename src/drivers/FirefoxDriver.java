package drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę za pomocą FirefoxDriver.");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element na stronie za pomocą przeglądarki Firefox");
    }
}
