package singleton;

/**
 * lazy loading 加锁保证线程安全
 */
public class Manager03 {
    //不能加final   加final的变量必须要初始化！！！
    // 为什么要加volatile  JIT优化-指令重排
    private static  volatile Manager03 INSTANCE;

    private Manager03(){};


    public static Manager03 getInstance(){
        //最外层的判断有必要： 因为大部分进来都不是null，也就不会进入下面的锁，浪费时间在锁上。
        if(INSTANCE==null){
            //双重检查
            synchronized (Manager03.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Manager03();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            //new Runnable只有一个方法，可以用lambda代替
            new Thread(() -> {
                //不同对象的hashcode不同，可以判断是否是同一个对象
                System.out.println(Manager03.getInstance().hashCode());
            }).start();
        }
    }
}
