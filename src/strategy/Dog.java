package strategy;

public class Dog {
    int height,voice;

    public Dog(int height,int voice){
        this.height=height;
        this.voice=voice;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", voice=" + voice +
                '}';
    }
}
