package org.learn;

import java.util.ArrayList;

public class DemoForClassName {

    public static void main(String[] args) throws IllegalAccessException,
            InstantiationException, ClassNotFoundException, InterruptedException {

        System.out.println("1. Start Invoking methods of ArrayList class");

        //Demo Standard JDK class like Integer
        demoJDKClasses();

        System.out.println("2. End invoke methods of ArrayList class");
        System.out.println();

        System.out.println("3. Start - Create user defined (Citizen) objects ");
        //Demo to custom user defined objects
        demoUserDefinedObjects();
        System.out.println("4. End -  Create user defined (Citizen) objects ");
        System.out.println();

        System.out.println("5. Create thread in java using class.forName");
        //Invoke methods of thread class in java
        demoCreateThread();
        System.out.println("6. End creating thread using class.forName");
    }

    private static void demoJDKClasses() throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {

        //Load ArrayList class
        Class<?> loadClass = Class.forName("java.util.ArrayList");

        //Create instance of ArrayList class
        ArrayList<String> arrayList = (ArrayList<String>) loadClass.newInstance();

        arrayList.add("Item 0");
        arrayList.add("Item 1");

        //Print attributes of ArrayList class
        System.out.printf("Items in arrayList : %s, size  : %d\n",
                arrayList.toString(), arrayList.size());

    }

     private static void demoUserDefinedObjects() throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {

        System.out.println("3.1 Invoke methods of USCitizen class");

        //Load USCitizen class
        Class<?> loadClass = Class.forName("org.learn.USCitizen");

        //Create instance of USCitizen class
        Citizen citizen = (Citizen) loadClass.newInstance();

        //Invoke method of class
        citizen.nationality();
        citizen.identity();

        System.out.println();
        System.out.println("3.2 Invoke methods of SwissCitizen class");

        //Load Swiss Citizen class
        loadClass = Class.forName("org.learn.SwissCitizen");

        //Create instance of Swiss citizen class
        citizen = (Citizen) loadClass.newInstance();

        //Invoke method of class
        citizen.nationality();
        citizen.identity();
    }

    private static void demoCreateThread() throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, InterruptedException {

        //Load MyThread class
        Class<?> loadClass = Class.forName("org.learn.MyThread");

        //Create instance of Thread class
        Thread thread = (Thread) loadClass.newInstance();
        //Start thread
        thread.start();
        //Wait for completion of thread execution
        thread.join();
    }


}


