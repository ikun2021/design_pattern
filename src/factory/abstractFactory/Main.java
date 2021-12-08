package factory.abstractFactory;


/**
 * 抽象工厂 具体工厂
 * 抽象产品 具体产品
 * 适合扩展产品一族（现代人，魔法人，火星人，海底人） 不适合扩展产品      最好的解决方案：spring Ioc！！！
 * 什么时候用abstract class（名词，现实世界存在的），什么时候用interface（形容词，功能性描述，某种属性）    语义更明确！
 */
public class Main {
    public static void main(String[] args) {
        AbstractPeopleFactory factory = new MagicPeopleFactory();
        factory.createFood();
        factory.createVehicle();
        factory.createWeapon();
    }
}
