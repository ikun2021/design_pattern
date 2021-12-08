package factory.factoryMethod;

public class PlaneFactory {
    public Movable create(){
        return new Plane();
    }
}
