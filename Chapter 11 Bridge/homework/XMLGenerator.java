public class XMLGenerator extends Generator {
    @Override
    void exportFile() {
        this.connector.connectDB();
        System.out.println("generate xml file.");
    }
}
