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
         This way we do not need to use if anymore and when we have one more class, we do not neet to interefe in another, just need to extend Base
         * The base class will always be opened for extension and never has to be changed
```

3L - Liskov Substitution Principle
```
Liskov is the name of the woman who creates this principle.
The subclasses can be substituted by the super classes without any intervention
Example: Class X (method A, method B)
         Class Y extends X (if the class class Y use the method B and the method B is not making sense for the class Y,
         So, it is hurting this principle)
```
4) I - Interface Segregation Principle
```
.
```

7) D - Dependency Inversion Principle
```
.
```
