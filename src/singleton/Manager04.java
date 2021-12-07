package singleton;

/**
 * 完美的方法！
 * 静态内部类方式
 * JVM保证单例，JVM只加载一次class
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Manager04 {
    private Manager04(){};


    //在静态内部类中声明一个静态变量
    private static class Manager04Holder{
        private static final Manager04 INSTANCE = new Manager04();
    }


    public static Manager04 getInstance(){
        return Manager04Holder.INSTANCE;
    }
}
