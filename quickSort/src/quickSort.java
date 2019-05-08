
/**
 * @description:
 * @time:2019/5/8 快速排序
 */
public class quickSort {

    public static void main(String[] args) {
        int i = 0;
        int a[] = {5,6,4,9,8,7,6,0,1,3,2};
        int len =  a.length;
        quickSortSolution(a);
//        sortSolution(a,0,a.length-1);
        for (i = 0; i<len;i++){
            System.out.print(a[i]+" ");
        }

    }

    private static void quickSortSolution(int[] array) {
        sortSolution(array,0,array.length-1);
    }

    private static void sortSolution(int[] a, int low, int high) {
        int i,j;
        int index;
        if (low>=high) return;//基线条件
        i = low;//0
        j = high;//10
        index = a[i];//用子表的第一个记录做基准 5
        while(i<j){ //用表的两端交替向中间扫描
            while(i<j && a[j] >= index)
                j--;
            if (i<j)//i5 j7
                a[i++] = a[j];//用比基准小的记录替换低位记录
            //2,3,4,1,0,7,6,0,8,9,6
            while(i<j && a[i] <= index)
                i++;
            if (i<j)//i5 j6
                a[j--] = a[i];//用比基准大的记录替换高位记录
            //2,3,4,1,0,5,6,7,8,9,6
        }
        a[i] = index;//将基准数之替换回a[i]
//        for (i = 0; i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
        sortSolution(a,low,i-1);
        sortSolution(a,i+1,high);




    }


}
