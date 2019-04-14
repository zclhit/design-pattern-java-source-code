public class LanhanSingleton {
    private volatile static LanhanSingleton instance = null;
    private LanhanSingleton(){}

    public LanhanSingleton getInstance() {
        // first check
        if (null == instance) {
            // lock class
            synchronized (LanhanSingleton.class) {
                // second check
                if (null == instance) {
                    instance = new LanhanSingleton();
                }
            }
        }
        return instance;
    }
}
