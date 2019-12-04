#Java programs to demonstrate concepts of OOP.
==============================================

* REQUIREMENTS:
The programs are needed to be compiled before running them.
1. Installing JAVA:

'''
<p>sudo su
   yum install java-devel
</p>
'''

* USAGE:
First compile the programs in order to execute the classes.

'''
<p>javac super1.java
   javac sub.java
</p>
'''

Then to execute them,
'''
<p>java sub</p>
'''

* DESCRIPTION:
The following program file (sub.java) contains a code that implements certain concepts of 
Object-Oriented Programming Language(OOP).

The constructor initialises the variable color and checks its value from a variable of interface 'interface1'
and later printing the new value of the variable thereby demonstrating the concept of #Data-Abstraction.

The next method 'classcall()' calls functions of other class and provides parameters to the methods called.
This demonstrates the concept of creating #Classes and calling it from other classes.

The next method is 'identify()' which displays the methods of this class(sub) and the class extended(super).
The method helps in understanding the concept of #Inheritance as it inherits features of the super class.

The next two methods are overloaded.Overloading is the type of #PolyMorphism in which functions are re-used by changing
the types of their formal parameters and return types.

The next two methods are get/set methods which lets other classes which (if in future) calls this sub class, help in changing 
the update of the private data members.This allows the concept of #Encapsulation to come into demonstration.

The final method is the main method which class all the methods and creates objects for the working of the class file.

* OUTPUT:

'''
<p>
  Creating Class

Name-->justan00b
Lucky number-->5
--------------------
Inheritance

Identity of Class 'sub'.
Identity of Class 'super1'.
--------------------
Polymorphism

Function1 is without any formal parameters
Function1 is not with formal parameter 'n' (int) having value 100
--------------------
Data-Abstraction

red
--------------------
Encapsulation

NONE
--------------------

</p>
'''
