public class AppChecker {

    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Calculator");
        android.appInfo();
        android.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("Calculator");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}
