package factory.factoryMethod;

/**
 * 一个工厂生产所有的类 简单工厂(工厂方法)
 * 简单工厂的可扩展性不好
 */
public class VehicleFactory {
    public Car create(){
        //权限控制，日志等操作
       return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
