package ExercicioFixaçao.Entities;

import ExemploEnum.Entities.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;

    private Client client;

    private List<entities.OrderItem> item = new ArrayList<>();

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<entities.OrderItem> getOrderItems() {
        return item;
    }

    public void addItem (entities.OrderItem orderItem) {
        item.add(orderItem);
    }

    public void removeItem (entities.OrderItem orderItem) {
        item.remove(orderItem);
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public double total() {
        double sum = 0;
        for (entities.OrderItem i : item ) {
            sum += i.subTotal();
        }
        return sum;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order Items:\n");
        for (entities.OrderItem orderItem : item) {
            sb.append(orderItem + "\n");
        }
        sb.append("Total price:  $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
