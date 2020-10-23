package project.jing.concurrent.cases.singleton;

public class SimpleDoubleCheckSingleton {

    private static SimpleDoubleCheckSingleton INSTANCE = null;

    private SimpleDoubleCheckSingleton() {}

    public static SimpleDoubleCheckSingleton getInstance() {
        if (null == INSTANCE) {
            synchronized (SimpleDoubleCheckSingleton.class) {
                if (null == INSTANCE) {
                    //step1 : objRef = allocate(DoubeCheckSingleton.class)
                    //step2 : invokeConstructor(objRef);
                    //step3 : instance = objRef
                    //这里可能会有重排序，变成3-1-2，线程1在执行step3时，线程2判断 null==instance返回true，此时thread2拿到未初始化的instance
                    INSTANCE = new SimpleDoubleCheckSingleton();
                }
            }
        }

        return INSTANCE;
    }
}
