package strategy;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] a ={new Cat(3,3),new Cat(1,1),new Cat(5,5)};
        Sorter sorter = new Sorter();
        sorter.sort(a);

        //Arrays.toString(数组)  Cat class需要有toString方法
        System.out.println(Arrays.toString(a));


        Dog[] b = {new Dog(3,3),new Dog(2,5),new Dog(6,2)};
        Sorter2<Dog> sorter2 = new Sorter2<>();
        sorter2.sort(b,new DogHeightComparator());
        System.out.println(Arrays.toString(b));
        sorter2.sort(b,new DogVoiceComparator());
        System.out.println(Arrays.toString(b));

    }
}
