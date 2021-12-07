package singleton;

/**
 * 枚举单例   掌握manager01和manager05就可以了
 * 不仅解决线程同步，还可以防止反序列化
 * 前面的各种写法，都不能阻止java 用反射的方法new一个对象
 * 枚举类没有构造方法，所以不能被反射-反序列化。
 */

//enum只能有一个实例
public enum Manager05 {
    INSTANCE;

    public void m(){

    }
}
