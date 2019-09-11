package org.westos.demo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: Administrator
 * @CreateTime: 2019-04-26 09:04
 */
public class MyTest {
    public static void main(String[] args) {
        //Collection 集合框架 集合是Java给我们提供的一种容器，可以更加方便的对容器中的元素进行操作
        Collection collection=new ArrayList();
        collection.add("abc");
        //获取集合中的元素个数
        int size = collection.size();
    }
}
