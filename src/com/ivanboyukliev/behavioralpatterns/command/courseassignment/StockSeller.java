package com.ivanboyukliev.behavioralpatterns.command.courseassignment;

public class StockSeller implements Order {
    private Stock stock;

    public StockSeller(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }
}
