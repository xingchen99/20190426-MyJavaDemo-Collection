package org.westos.demo;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: Administrator
 * @CreateTime: 2019-04-26 09:08
 */
public class MyTest2 {
    public static void main(String[] args) {


        ////例如：A集合对B集合取交集，获取到的交集元素在A集合中。返回的布尔值表示的是A集合是否发生变化
        //boolean retainAll (Collection c):获取两个集合的交集元素(交集：两个集合都有的元素)
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
        aList.add(11211);
        aList.add(15244);
        aList.add(11211);
        aList.add(15244);
        aList.add(11211);
        aList.add(1222544);


        Collection aList2 = new ArrayList();
        aList2.add(1);
        aList2.add(15);
        aList2.add(16);
        aList2.add(14);
        aList2.add(17);
        aList2.add(188);
        //aList2.add(1111);
        //aList2.add(1544);
        //aList2.add(1722);
        //aList2.add(1882222);
        //aList2.add(111122);
        //aList2.add(154422);

        //
        //boolean b = aList.retainAll(aList2);
        //
        //System.out.println(b);
        //System.out.println(aList);
        //System.out.println(aList2);

        // aList.addAll(aList2); 将传入的集合中的元素，放到调用的集合中
        // aList.containsAll(aList2); 看传入的集合的所有元素在 调用集合中有没有出现过
        // aList.retainAll(aList2)  取两个集合的交集元素，将交集元素，放置到调用的集合中，返回值表示调用集合的元素和原来的元素对比是否发生过变化，发生过变化就是true，没发生就是false
        //aList.removeAll(aList2);  A集合removeAll  B集合，A集合删除两个集合的交集元素
        //System.out.println(aList);
        //System.out.println(aList2);

    }
}
