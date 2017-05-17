import java.util.Arrays;

import org.junit.Test;

/**
 * 选择排序
 * n 个数据, 需要扫描 n-1 次
 * 比较次数 n-1 + n-2 + ... +1
 * 时间复杂度 o(n^2)
 * 空间复杂度 o(1)
 *
 * @author DBQ
 */
public class SelectSort {

    @Test
    public void testSelectSort() {
        int[] array = new int[]{1, 54, 6, 3, 78, 34, 12, 45};
        int len = array.length;
        for (int j = 0; j < len; j++) {
            int max = array[0];
            int count = len - j;
            System.out.println("count: " + count);
            int pos = 0;
            for (int i = 1; i < count; i++) {
                if (max < array[i]) {
                    max = array[i];
                    pos = i;
                }
            }
            System.out.println("max: " + max);
            array[pos] = array[count - 1];
            array[count - 1] = max;
        }
        System.out.println(Arrays.toString(array));
    }

}
