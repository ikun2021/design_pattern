package factory.factoryMethod;


/**
 * 适合扩展单个的产品（产品维度），不适合扩展产品族    abstract factory和factory method的区别
 */
public class Main {
    public static void main(String[] args) {
        Movable movable = new Car();
        movable.go();
    }
}
