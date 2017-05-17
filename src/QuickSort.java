import org.junit.Test;

import java.util.Arrays;

/**
 * Created by DBQ on 2016/9/29.
 */
public class QuickSort {

    int a[] = {4,6,3,1,2};

    public QuickSort() {
        quick(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void testGetMiddle(){
        getMiddle(a, 0, a.length -1 );
    }

    public int getMiddle(int[] list, int low, int high) {
        int tmp = list[low];    //数组的第一个作为中轴
        while (low < high) {
            while (low < high && list[high] >= tmp) {
                high--;
            }
            //System.out.println("high = " + high);
            list[low] = list[high];   //比中轴小的记录移到低端
            while (low < high && list[low] <= tmp) {
                low++;
            }
            //System.out.println("low = " + low);
            list[high] = list[low];   //比中轴大的记录移到高端

        }
        list[low] = tmp;              //中轴记录到尾
        System.out.println("gM: " + Arrays.toString(list));
        return low;                   //返回中轴的位置
    }

    public void _quickSort(int[] list, int low, int high) {
        if (low < high) {
            System.out.println(Arrays.toString(list));
            int middle = getMiddle(list, low, high);  //将list数组进行一分为二
            System.out.println("----> Mid = " + middle);
            _quickSort(list, low, middle - 1);        //对低字表进行递归排序
            _quickSort(list, middle + 1, high);       //对高字表进行递归排序

        }
    }

    public void quick(int[] a2) {
        if (a2.length > 0) {    //查看数组是否为空
            _quickSort(a2, 0, a2.length - 1);
        }
    }

    public static void main(String[] args) {
        new QuickSort();
    }


}
