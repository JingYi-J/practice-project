package project.jing.concurrent.cases.singleton;

public class SimpleMultithreadSingleton {

    private static SimpleMultithreadSingleton INSTANCE = null;

    private SimpleMultithreadSingleton() {}

    public static SimpleMultithreadSingleton getInstance() {
        //开销较大实现方法
        synchronized (SimpleMultithreadSingleton.class) {
            if (null == INSTANCE) {
                INSTANCE = new SimpleMultithreadSingleton();
            }
        }
        return INSTANCE;
    }
}
