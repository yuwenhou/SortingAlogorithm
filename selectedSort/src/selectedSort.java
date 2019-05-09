import java.util.Arrays;

/**
 * @description:
 * @time:2019/5/9 选择排序
 */
public class selectedSort {

    public static void main(String[] args) {
        int[] a =  { 49,38,65,97,76,13,27,49 };
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void selectSort(int[] a) {
        if (a==null || a.length<=0){
            return;
        }

        for (int i =0; i<a.length;i++){
            int temp = a[i];
            int flag = i;
            for (int j=i+1; j<a.length;j++){
                if (a[j]<temp){
                    temp = a[j];
                    flag = j;

                }
            }
            if(flag!=i){
                a[flag] = a[i];
                a[i] = temp;
            }



        }

    }


}
