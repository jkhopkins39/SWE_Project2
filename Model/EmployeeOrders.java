package Model;

import java.util.ArrayList;

public class EmployeeOrders extends OrderList {
    /*
    the orders ArrayList is going to be the same list as
    the OrderList class so that employees can access
    the same order list as the customers
     */
    public EmployeeOrders() {
        ArrayList<Order> orders = new ArrayList<Order>();
    }

    public void directToEmployeeAccount(){}
    public void directToEmployeeMenu(){}
}
