package project.jing.concurrent.cases.singleton;

public class EnumBasiedSingleton {

    public static void main(String[] args) {

        Singleton.INSTANCE.doSomething();
    }

    public static enum Singleton{
        INSTANCE;

        Singleton() {

        }

        public void doSomething() {}
    }
}


