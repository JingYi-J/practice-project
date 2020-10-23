package project.jing.concurrent.cases.singleton;

public class SimpleThreadSingleton {

    private static SimpleThreadSingleton INSTANCE = null;

    private SimpleThreadSingleton(){}

    public static SimpleThreadSingleton getInstance() {

        // check-then-act模式，多线程会有问题
        if (INSTANCE == null) {
            INSTANCE = new SimpleThreadSingleton();
        }

        return INSTANCE;
    }
}

