package com.ivanboyukliev.behavioralpatterns.chainofresponsibility;

import java.util.Scanner;

public class Client {
    private DispenseChain dispenseChain1;

    public Client() {
        this.dispenseChain1 = new Dollar50Dispenser();
        DispenseChain dispenseChain2 = new Dollar20Dispenser();
        DispenseChain dispenseChain3 = new Dollar10Dispenser();

        // set the chain of responsibility

        dispenseChain1.setNextChain(dispenseChain2);
        dispenseChain2.setNextChain(dispenseChain3);
    }

    public static void main(String[] args) {
        Client atmDispenser = new Client();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense:");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s");
                return;
            }

            // process the request

            atmDispenser.dispenseChain1.dispense(new Currency(amount));
        }
    }
}
