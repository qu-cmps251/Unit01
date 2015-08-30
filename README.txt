Extract the file then import the project to Eclipse. 

Note the following:

The class App is your start up class and is only used to create an object of 
the the class that you want to run. The main method of the App class is executed 
first.  You can have that main statement create an object of the other classes.

The other classes are Prog1, Prog2, and Prog3. When an object of these classes 
is created the constructor method of it is called. notice the statement to 
create an object from Prog1 can be written as below which is a call to the 
constructor method of class Prog1 and hence, the code in the constructor method 
is executed:
                        new Prog1(); 

You can change the statement above to create an object of Prog2, or Prog3 
instead of Prog1 which will call the constructor of that class and executes the 
the code in it. 

You can think of the App class as either your main class or as a testing class
in which you run other classes by creating objects. 

In the near future, you will be creating objects and using them together to 
solve a given problem. 
