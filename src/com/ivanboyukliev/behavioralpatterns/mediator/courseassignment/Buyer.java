package com.ivanboyukliev.behavioralpatterns.mediator.courseassignment;

public abstract class Buyer {
    protected String name;
    protected float price;
    protected IAuctionMediator mediator;

    public Buyer(String name, IAuctionMediator med) {
        this.name = name;
        this.mediator = med;
    }

    public abstract void makeBid(float price);
    public abstract void cancelBid();
    public abstract void auctionEnded();
}
