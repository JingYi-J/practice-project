package project.jing.concurrent.cases.singleton;

public class StaticHolderSingleton {

    private StaticHolderSingleton() {

    }

    private static class InnerHolder{
        //静态变量的类初始化机制
        final static StaticHolderSingleton INSTANCE = new StaticHolderSingleton();
    }

    public static StaticHolderSingleton getInstance() {
        return InnerHolder.INSTANCE;
    }


}
