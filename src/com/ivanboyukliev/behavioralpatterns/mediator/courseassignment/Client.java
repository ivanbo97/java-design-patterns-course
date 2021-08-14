package com.ivanboyukliev.behavioralpatterns.mediator.courseassignment;

public class Client {
    public static void main(String[] args) {
        IAuctionMediator auctionMediator = new AuctionMediatorImpl();

        Buyer buyer1 = new AuctionBuyer("Ivan",auctionMediator);
        Buyer buyer2 = new AuctionBuyer("Dimitar",auctionMediator);
        Buyer buyer3 = new AuctionBuyer("Peter",auctionMediator);
        Buyer buyer4 = new AuctionBuyer("Georgi",auctionMediator);

        auctionMediator.addBuyer(buyer1);
        auctionMediator.addBuyer(buyer2);
        auctionMediator.addBuyer(buyer3);
        auctionMediator.addBuyer(buyer4);

        buyer1.makeBid(225000f);
        buyer1.makeBid(2240f);
        buyer1.makeBid(22500f);
        buyer4.makeBid(2250f);


        auctionMediator.determineWinner();
        auctionMediator.auctionOverInform();
    }
}
