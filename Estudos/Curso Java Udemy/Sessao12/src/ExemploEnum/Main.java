package ExemploEnum;

import ExemploEnum.Entities.Order;
import ExemploEnum.Entities.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1500, new Date(), OrderStatus.SHIPPED);

        System.out.println(order);

        OrderStatus os2 = OrderStatus.valueOf("SHIPPED");

        System.out.println(os2);
    }
}