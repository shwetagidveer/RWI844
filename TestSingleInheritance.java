class Animal {  
    void eat() {
        System.out.println("eating...");
    }  
}  

class Dog extends Animal {  
    void bark() {
        System.out.println("barking...");
    }  
}  

class TestSingleInheritance {  
    public static void main(String args[]) {  
        Dog d = new Dog();  
        d.bark();  
        d.eat();  

        // Creating and using the Car object
        Car myCar = new Car();
        myCar.start();   // Inherited method
        myCar.drive();
    }  
}  

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

 //Output :- barking...
   //               eating...
     //             Vehicle started
       //           Car is driving