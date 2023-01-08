package drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę za pomocą ChromeDriver.");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element na stronie za pomocą przeglądarki Chrome");
    }
}
