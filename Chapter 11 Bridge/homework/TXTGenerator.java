public class TXTGenerator extends Generator {
    @Override
    void exportFile() {
        this.connector.connectDB();
        System.out.println("generate txt file.");
    }
}
