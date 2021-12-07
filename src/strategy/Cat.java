package strategy;


//泛型  如果不指定MyComparable<Cat> 默认类型是Object，需要在compareTo方法中进行强制类型转换。
public class Cat implements MyComparable<Cat>{
    int weight,height;

    public Cat(int weight,int height){
        this.weight = weight;
        this.height = height;
    }
//    假设需要灵活的指定Cat的compareTo策略，比如按身高排序，
//    只能擦除写好的按体重比较的代码，不符合open（扩展）--close（修改） 原则
//    以下引入策略模式 comparator 用Dog来展示，可以不断扩展新的customized Comparator
    @Override
    public int compareTo(Cat cat) {
        if(this.weight<cat.weight) return -1;
        else if(this.weight>cat.weight) return 1;
        else return 0;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
