// Corey Williams
// COP2800
// Assignment 9
// 07/07/2023

// 1 (a) False. Car would have an has-a relationship with steeringwheel and brakes.
// 1 (b) False. is-a relationship is established via inheritance. 
//       Composition establishes a has-a relationship.
// 1 (c) True
// 1 (d) False. When a subclass redefines a superclass, it overrides it, not overload.

// 2 (a)
@Override
public String toString() {
    return super.toString();
}

// 2 (b) 
public class Pieceworker extends Employee {
}


// 2 (c) 
public class Pieceworker extends Employee {
    public Pieceworker(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }
}


// 3 It allows you to write code that can work with objects of a different class as 
//   long as they are related through inheritance.