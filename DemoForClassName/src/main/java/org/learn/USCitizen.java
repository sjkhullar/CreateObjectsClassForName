package org.learn;

import java.util.Random;
import java.util.UUID;

public class USCitizen implements Citizen {

    public void nationality() {
        System.out.println("I am US Citizen");
    }

    public void identity() {
        Random random = new Random();
        random.nextInt();
        System.out.println("My identification number : "+random.nextInt());

    }
}
