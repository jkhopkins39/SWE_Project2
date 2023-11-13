package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SALESREPORTTEST extends MenuItem {
    private double cost;
    private int quantitySold;
    private double netSales;
    public LocalDate timeFrame;
    public double totalSales = 0;
    public ArrayList<MenuItem> itemsSold = new ArrayList<MenuItem>();
    public double SALESREPORTTEST(ArrayList<MenuItem> itemsSold, LocalDate timeFrame) {
        for (MenuItem menuItem : itemsSold) {
            /* if (timeFrameOfItems == weekly) {
            generateWeeklyReport();} */
        }
        return totalSales;
    }
    public static double itemSales(MenuItem item) {
        return item.getCost() * item.getQuantity();
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose what to do:");
            System.out.println("1. Generate daily report");
            System.out.println("2. Generate weekly report");
            System.out.println("3. Generate monthly report");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice) {
                case 1:

            }
        }
    }
}
