public class EhanSingleton {
    // Ehan model, initialize while create class
    private static final EhanSingleton instance = new EhanSingleton();
    private EhanSingleton(){};

    public static EhanSingleton getInstance(){
        return instance;
    }
}
