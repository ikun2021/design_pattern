package singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用
 *
 * spring框架的bean factory可以给我们保证单例，不用自己写
 */
public class Manager01 {
    //声明一个静态变量，在类加载的时候就创建
    private static final Manager01 INSTANCE = new Manager01();

    //constructor
    private Manager01(){};
    //属于class的静态方法
    public static Manager01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Manager01 m01= Manager01.getInstance();
        Manager01 m02 = Manager01.getInstance();
        System.out.println(m01==m02);
    }
}
