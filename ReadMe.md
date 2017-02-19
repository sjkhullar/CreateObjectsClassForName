Given an application in java, create new instance/object of classes loaded by class loader dynamically using Class.forName in java (examples)

Given an application in java.
We would like to create the instance of classes by specifying class name.
Instances of the class Class represent classes and interfaces in a running Java application.
We will get the reference of loaded class using Class.forName("Complete path of a class")
And then, we can create instance of loaded class.
Class Class does not have any public constructor.
Instead Class objects are constructed automatically by the Java Virtual Machine as classes are loaded.

What is purpose of Class.forName method?

Class loader of an applications loads all classes.
Class.forName returns the reference of Class objects for specified class name (Class loaded in step 1).
We can created the instance of a class by using reference returned in step 2.

