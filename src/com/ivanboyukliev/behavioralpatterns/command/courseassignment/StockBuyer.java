package com.ivanboyukliev.behavioralpatterns.command.courseassignment;

public class StockBuyer implements Order {
    private Stock stock;

    public StockBuyer(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
