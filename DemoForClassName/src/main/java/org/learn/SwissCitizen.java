package org.learn;

import java.util.UUID;

public class SwissCitizen implements Citizen {


    public void nationality() {
        System.out.println("I am Switzerland Citizen");
    }

    public void identity() {
        System.out.println("My identification number : "+UUID.randomUUID().toString());
    }
}
