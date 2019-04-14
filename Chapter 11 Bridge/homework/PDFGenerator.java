public class PDFGenerator extends Generator {
    @Override
    void exportFile() {
        this.connector.connectDB();
        System.out.println("generate PDF file.");
    }
}
