package strategy;


//可以不断来扩展对应的comparator class来指定特定的比较策略，然后传入Sorter2的sort方法即可，这就是策略模式。
public interface MyComparator<T> {
    int compare(T o1,T o2);
}
