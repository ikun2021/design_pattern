package factory.abstractFactory;

public class MagicPeopleFactory extends AbstractPeopleFactory{
    @Override
    Food createFood() {
        return new Mushroom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
