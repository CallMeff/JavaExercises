package com.feng.jdkdecode;

import com.feng.domin.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectionsDeCodeTest {

    @Test
    public void checkMap() {
        //map.entrySet()
        Map map = new HashMap();
        map.put("key1","value1");
        map.put("key2","value2");
        Set s = map.entrySet();
        Iterator itreter = s.iterator();
        while(itreter.hasNext()){
            Map.Entry entry = (Map.Entry) itreter.next();
            System.out.println(entry.getValue());
        }

        /**
         * map.equals()
         * 通过对比两个map的hashCode返回方法的结果
         * map的hashCode的值为map中每条entry的hashCode的值之和
         */

        Map map2 = new HashMap();
        map2.put("key2","value2");
        map2.put("key1","value1");
        System.out.println(map.equals(map2));

        /**
         * 排序
         */
    }

    @Test
    public void checkList() {

        List<User> userList = new ArrayList<>();
        userList.add(new User("1",22,100));
        userList.add(new User("3",24,300));
        userList.add(new User("2",23,200));
        for (User user:userList) {
            System.out.println(user.getAge());
        }
        userList.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.getAge()>o2.getAge()){
                    return 1;
                }
                if(o1.getAge() == o2.getAge()){
                    return 0;
                }
                return -1;
            }
        });
        for (User user:userList) {
            System.out.println(user.getAge());
        }
    }
}