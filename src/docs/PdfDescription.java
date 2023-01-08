package docs;

public class PdfDescription implements Document{
    @Override
    public void getDescription() {
        System.out.println("I am pdf document");
    }
}
