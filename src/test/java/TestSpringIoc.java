import com.yj.bean.Order;
import com.yj.controller.OrderController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 类说明
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/8 15:17
 * Copyright 2021 by WiteMedia
 */
public class TestSpringIoc {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderController controller = context.getBean(OrderController.class);
//        List<Order> orders = controller.getOrders();
//        orders.forEach(o->{
//            System.out.println(o.getTitle());
//        });
        controller.addOrder();
    }
}
