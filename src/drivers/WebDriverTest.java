package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {
        //ChromeDriver chromeDriver = new ChromeDriver();
        WebDriver driver = getDriver("firefoxaaa");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

//        FirefoxDriver firefoxDriver = new FirefoxDriver();
//        firefoxDriver.get();
//        firefoxDriver.findElementBy();
//        firefoxDriver.findElementBy();
//        firefoxDriver.findElementBy();
//        firefoxDriver.findElementBy();
//        firefoxDriver.findElementBy();
//        firefoxDriver.findElementBy();

    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name");
    }
}
