package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Client;
import entities.Client;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

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

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double soma = 0;
        for (OrderItem it : items){
            soma += it.subTotal();
        }
        return soma;
    }

   public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(sdf2.format(moment)).append("\n");
        sb.append("Order Status: ").append(status).append("\n");
        sb.append("Client: ").append(client).append("\n");
        sb.append("Order Items: ");
        for (OrderItem item : items){
            sb.append(item).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f",total()));
        return sb.toString();

   }
}

