package org.westos.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author: Administrator
 * @CreateTime: 2019-04-26 09:36
 */
public class MyTest {
    public static void main(String[] args) {


        //void add ( int index, E element)
        //在列表的指定位置插入指定元素（可选操作）。

        //E get ( int index)
        //返回列表中指定位置的元素。

        //ListIterator<E> listIterator ( int index)
        //返回列表中元素的列表迭代器（按适当顺序），从列表的指定位置开始。


        //List<E> subList ( int fromIndex, int toIndex)
        //返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。


        //int lastIndexOf (Object o)
        //返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 - 1。


        //int indexOf (Object o)
        //返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 - 1。

        List list = new ArrayList();
        list.add(10);
        list.add(100);
        list.add(10);
        list.add(100);
        list.add(10);
        list.add(100);
        list.add(10);
        list.add(100);
        list.add(10);
        list.add(100);
        list.add(10);
        list.add(100);
        //可以在指定的索引处，添加元素
        list.add(0,50);

        System.out.println(list);

        Object o = list.get(list.size()-1);
        System.out.println(o);


        //for循环遍历集合元素

        for (int i = 0; i < list.size(); i++) {
            Object num = list.get(i);
            System.out.println(num);
        }

        System.out.println("---------------------------------");

        // List 集合有一个迭代器
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            Object next = listIterator.next();
            System.out.println(next);
        }

    }
}
