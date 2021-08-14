package com.ivanboyukliev.behavioralpatterns.mediator.courseassignment;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediatorImpl implements IAuctionMediator {
    private List<Buyer> auctionBuyers;

    public AuctionMediatorImpl() {
        auctionBuyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer auctionBuyer) {
        auctionBuyers.add(auctionBuyer);
    }

    @Override
    public void determineWinner() {
        float topBid = auctionBuyers.get(0).price;
        int topBidIdx = 0;
        float currentBid;
        for (Buyer auctionBuyer : auctionBuyers) {
            currentBid = auctionBuyer.price;
            if (currentBid > topBid) {
                topBid = currentBid;
                topBidIdx = auctionBuyers.indexOf(auctionBuyer);
            }
        }
        Buyer winner = auctionBuyers.get(topBidIdx);
        System.out.println("The winner of this auction is " + winner.name + " with top price " + winner.price + "$.");
    }

    @Override
    public void auctionOverInform() {
        System.out.println("Attention!!! Auction is over!!!");
        for (Buyer currentBuyer : auctionBuyers) {
            currentBuyer.auctionEnded();
        }
    }
}
