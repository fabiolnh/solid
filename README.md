# Solid Study

Solid Principles

1) S - Single-responsiblity Principle:
```
The class has to have a unique responsability. It has to be changed for only one reason
If you start to see that the class is getting bigger, doing a lot of things, 
probably is interfering in this principle
Example: UserRepository, UserService, UserController, User
```

2) O - Open-closed Principle: 
```
A Class should be opened for extension, but closed for modification. 
Example: BaseController. 
If you are using a lot of IFs, or need to modify a lot of times the class, 
incrementing more ifs in this class, probably you need to do this principle. 
We can use Interface or Extension
Example: Class X has a lot of ifs with an Enum. Instead of doing it, create a class for each type and extends a super class (base), 
         implementing the superclass method for each subclass. 
         This way we do not need to use 'if' anymore and when we have to have one more class, we do not need to interefe in another, just need to extend Base
         * The base class will always be opened for extension and never has to be changed
```

3) L - Liskov Substitution Principle
```
Liskov is the name of the woman who creates this principle.
The subclasses can be substituted by the super classes without any intervention
Example: Class X (method A, method B)
         Class Y extends X (if the class class Y use the method B and the method B is not making sense for the class Y,
         So, it is hurting this principle)
```

4) I - Interface Segregation Principle
```
A class is not obliged to implement an interface that it will not use all the methods.
If you are going to use an interface that has a method which you will not use, don´t use this interface! segregate the existing interface or create a new one!
Example: Class X implements Interface Y (it has method A and method B)
         Class Y implements Interface Y (it has method A and method B, bot method B does not make sense for this class Y)
         So, segregate the existing interface in two, and for the Class X, implements Interface 1 (method A) and 2 (method B)
         And for the Class Y, implements only the Interface A (method A)
```

5D - Dependency Inversion Principle
```
It has to depends of Abstractions (a model, such as interfaces), not the implementations (a concret class, such as common Class that can be instantiate)
Invert the dependencies. Do not force a class to depend of a concrete class
Important: Everytime that we have a class and we are using new Object inside it, we are creating an coupling too strong. Put it in the constructor or a setter method, using  an abstraction (Interface)
           Dependency Injection is good for this case.
Example: Class X receives a concrete class in some method to work inside of it. 
         The main purpose here is to receive in the constructor an Interface. So, instead of using concrete classes, we use Interfaces.
         This way we can create more classes implementing this interface and we do not have to edit the class that is receiving the interface, facilitating maintaining.
```