package strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a ={9,5,4,7,1,0,5};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
