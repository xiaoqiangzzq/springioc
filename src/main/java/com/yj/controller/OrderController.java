package com.yj.controller;

import com.yj.bean.Order;
import com.yj.service.OrderService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * 类说明
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/8 15:08
 * Copyright 2021 by WiteMedia
 */
@Controller
public class OrderController {

    //这里不能使用OrderServiceImpl 注入，因为AOP代理，使用的是JDK代理
    //但是可以使用 proxy-target-class="true" 都使用cglib代理
    //如果OrderServiceImpl 没有去实现任何类，则可以是使用 OrderServiceImpl 注入，因为使用的是cgLib类

    @Resource
    OrderService orderService;


    public List<Order> getOrders(){
        return orderService.getOrders();
    }


    public void addOrder(){
        orderService.addOrder(new Order(11,"汽车",200000));
        System.out.println("新增成功");
    }
}
