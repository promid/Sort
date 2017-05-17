import org.junit.Test;

import java.util.Arrays;

/**
 * Created by DBQ on 2016/9/29.
 */

/**
 * 相邻的比
 * 要比较 n-1 次
 * n-1 + n-2 + ... + n
 * 时间复杂度为 o(n^2)
 * 空间复杂度为 o(1)
 */
public class BubbleSort {

    @Test
    public void testBubbleSort() {
        int[] array = new int[]{23, 45, 21, 45, 43, 56, 99, 73};
        int len = array.length;
        for (int i = 0; i < len-1; i++) {
            for(int j = 0; j < len-1-i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
