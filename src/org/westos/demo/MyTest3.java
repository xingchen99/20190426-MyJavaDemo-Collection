package org.westos.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: Administrator
 * @CreateTime: 2019-04-26 09:25
 */
public class MyTest3 {
    public static void main(String[] args) {
        Collection aList = new ArrayList();
        aList.add(1);
        aList.add(15);
        aList.add(16);
        aList.add(14);
        aList.add(17);
        aList.add(188);
        aList.add(1111);
        aList.add(1544);
        aList.add(1111);
        aList.add(1544);

        ////创建一个数组
        //Integer[] arr = new Integer[aList.size()];
        //int index = 0;
        //Iterator iterator = aList.iterator();
        //while (iterator.hasNext()) {
        //    Object obj = iterator.next();
        //    Integer integer = (Integer) obj;
        //    arr[index] = integer;
        //    index++;
        //}
        //
        //System.out.println(Arrays.toString(arr));

        //将一个集合转换成数组
        Object[] objects = aList.toArray();

        for (int i = 0; i < objects.length; i++) {
            Integer num= (Integer) objects[i];
            System.out.println(num);
        }

    }
}
