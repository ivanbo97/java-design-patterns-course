package com.ivanboyukliev.behavioralpatterns.mediator.courseassignment;

public interface IAuctionMediator {
    void addBuyer(Buyer auctionBuyer);
    void determineWinner();
    void auctionOverInform();
}
