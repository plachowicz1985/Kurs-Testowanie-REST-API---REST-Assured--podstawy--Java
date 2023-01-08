package docs;

public class DocumentChecker {
    public static void main(String[] args) {

        Document pdfDoc = new PdfDescription();
        Document excelDoc = new ExcelDocument();

        pdfDoc.getDescription();
        excelDoc.getDescription();
    }
}
