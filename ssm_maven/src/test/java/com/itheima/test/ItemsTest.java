package com.itheima.test;

import cn.itcast.Dao.ItemsDao;
import cn.itcast.Service.ItemsService;
import cn.itcast.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //dao测试
        //从容器中拿到所需的dao的代理对象
//        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        //调用方法
//        Items byId = itemsDao.findById(1);
//        System.out.println(byId.getName());
        //service测试
        ItemsService itemsService = ac.getBean(ItemsService.class);
        //调用方法
        Items items = itemsService.findById(2);
        System.out.println(items.getName());
    }
}
