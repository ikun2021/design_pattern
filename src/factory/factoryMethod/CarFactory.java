package factory.factoryMethod;

public class CarFactory {
    public Movable createCar(){
        return new Car();
    }
}
