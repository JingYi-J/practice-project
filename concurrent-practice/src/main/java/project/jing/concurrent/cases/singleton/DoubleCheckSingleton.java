package project.jing.concurrent.cases.singleton;

public class DoubleCheckSingleton {

    //保障可见性
    private volatile static DoubleCheckSingleton INSTANCE = null;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (null == INSTANCE) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == INSTANCE) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
