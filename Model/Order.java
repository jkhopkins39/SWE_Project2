package Model;

import java.util.ArrayList;

public class Order extends AccountInformation {
    public String username;
    public String password;
    public static int orderNumber;
    public String orderType;
    public String paymentType;
    public double total;
    public String orderStatus;
    public Order() {
        this.orderNumber = 0;
        this.orderType = "";
        this.paymentType = "";
        this.total = 0;
        this.orderStatus = "";
    }

/*
This constructor implicitly accepts a username and password as
parameters to display only the intended user's orders. This is
to differentiate from the employee/manager view.
 */
    public Order(String username, String password, String orderType, String paymentType, int total, String orderStatus) {
        orderNumber++;
        this.orderNumber = orderNumber;
        this.orderType = orderType;
        this.paymentType = paymentType;
        this.total = total;
        this.orderStatus = orderStatus;
    }

    public Order getOrder(int orderNumber) {
        for (Order order : OrderList) {

        }
    }
}
