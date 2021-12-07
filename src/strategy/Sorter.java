package strategy;

public class Sorter {
    //选择排序
    public void sort(int[] arr) {
        //遍历所有的数
        for(int i=0; i<arr.length; i++){
            int min = i;
            //把当前遍历的数和后面所有的数依次进行比较，并记录下最小的数的下标
            for(int j=i+1; j<arr.length; j++){
                //如果后面比较的数比记录的最小的数小
                if(arr[j]<arr[min]){
                    //记录最小的那个数的下标
                    min = j;
                }
            }
            //如果最小的数和当前遍历数的下标不一致，说明下标为min的数比当前遍历的数更小
            if(i!=min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
