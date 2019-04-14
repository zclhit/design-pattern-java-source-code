public class IoDHSingleton {
    // rewrite builder
    private IoDHSingleton() {
    }

    // static inner class
    private static class HolderClass {
        private static final IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }
}
