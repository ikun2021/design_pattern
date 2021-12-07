package singleton;

/**
 * 懒汉式 lazy loading
 * 但是会带来线程不安全的问题
 */
public class Manager02 {
    //不能加final   加final的变量必须要初始化！！！
    private static Manager02 INSTANCE;

    private Manager02(){};

    //加锁可以解决线程不安全，但是效率下降  static方法加锁，锁的是class ，没有static的话 锁的是当前对象
    public static synchronized Manager02 getInstance(){
        if(INSTANCE==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Manager02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            //new Runnable只有一个方法，可以用lambda代替
            new Thread(() -> {
                //不同对象的hashcode不同，可以判断是否是同一个对象
                System.out.println(Manager02.getInstance().hashCode());
            }).start();
        }
    }
}
