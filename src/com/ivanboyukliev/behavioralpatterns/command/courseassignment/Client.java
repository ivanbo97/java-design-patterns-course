package com.ivanboyukliev.behavioralpatterns.command.courseassignment;

public class Client {
    public static void main(String[] args) {
        // Receiver
        Stock stockForBuying = new Stock("CPU", 10);

        // Command
        Order stockBuyer = new StockBuyer(stockForBuying);

        // Invoker
        Broker broker = new Broker();
        broker.takeOrder(stockBuyer);


        Stock stockForSelling = new Stock("RAM", 20);
        Order stockSeller = new StockSeller(stockForSelling);
        broker.takeOrder(stockSeller);

        broker.executeOrders();
    }
}
