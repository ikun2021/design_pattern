package strategy;

//泛型 谁在用我的接口时，请指定类型,然后在接口的方法中替换掉所有的T
public interface MyComparable<T> {
    int compareTo(T t);
}
