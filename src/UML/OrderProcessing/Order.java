package UML.OrderProcessing;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int OrderId;
    Customer customer;
   List<Product>products;
    Order(int OrderId){
        this.OrderId=OrderId;
        customer = new Customer(12);
        products = new ArrayList<>();
    }
    public void CreateOrder(){

    }
}
