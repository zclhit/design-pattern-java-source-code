public class Client {
    public static void main(String[] args) {
        DbConnector connector = new PostgrelDBConnector();
        Generator generator = new PDFGenerator();
        generator.setConnector(connector);
        generator.exportFile();
    }
}
