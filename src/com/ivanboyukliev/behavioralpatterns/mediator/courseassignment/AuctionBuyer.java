package com.ivanboyukliev.behavioralpatterns.mediator.courseassignment;

public class AuctionBuyer extends Buyer {
    public AuctionBuyer(String name, IAuctionMediator med) {
        super(name, med);
    }

    @Override
    public void makeBid(float price) {
        System.out.println(name + " is making a bid with " + price + "$");
        this.price = price;
    }

    @Override
    public void cancelBid() {
        System.out.println(name + "is canceling his bid for " + price);
        this.price = -1;
    }

    @Override
    public void auctionEnded() {
        System.out.println(name + " was informed for the ending of auction");
    }
}
