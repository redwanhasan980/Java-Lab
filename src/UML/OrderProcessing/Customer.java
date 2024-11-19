package UML.OrderProcessing;

public class Customer {
    private int CustomerId;
    Order order ;
    Customer(int CustomerId){
        this.CustomerId=CustomerId;
        order = new Order(23);
    }
    public void AddCustomer(){

    }
}
