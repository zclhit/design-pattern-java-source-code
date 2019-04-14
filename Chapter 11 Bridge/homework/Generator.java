abstract class Generator {
    protected DbConnector connector;

    // set connector
    public void setConnector(DbConnector connector) {
        this.connector = connector;
    }

    abstract void exportFile();
}
