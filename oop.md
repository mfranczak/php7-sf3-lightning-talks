# Object-oriented programming
is more than just classes and objects; it's a whole programming paradigm based around objects (data structures) that contain data fields and methods. It is essential to understand this; using classes to organize a bunch of unrelated methods together is not object orientation.

_Junade Ali, Mastering PHP Design Patterns_

https://en.wikipedia.org/wiki/Object-oriented_programming

---

# Domain Driven Design
is an approach to software development for complex needs by connecting the implementation to an evolving model

https://en.wikipedia.org/wiki/Domain-driven_design

---

# Classes define Abstractions
## Objects are instances of classes

We define abstractions to model solutions.
We provide detailed implementation to solve the problem.

---

# class
has properties / fields

```
class Person {
  public $name;
}
```

---

# class
has methods / behaviours 

```
class Person {
  public $name;
  
  public function greet() {
  	echo 'Hello my name is ' . $this->name;
  }
}
```

---

# Encapsulation
Object has a private state but exposes a public interface to manipulate and read from the outside.
You can feed a Cat but you can not set if the Cat is hungry or not.

```
class Cat {
  private $hungry;
    
  public function feed(Food $food) {
  // ...
  }
  
  public function isStillHungry() : bool {
  // ...
  }
}
```

---

# public / protected /private
- public - can be called from the outside
- protected - inside a class and children
- private - only inside a class (internal method)
 
---

# Abstraction
Objects should expose only high level interface and hide implementation details
When you have a Coffee machine you simply need a Coffee you don't care how it works.

```
class AdvancedCoffeeMachine {
  public function makeCoffee() : AwesomeCoffee {
     // ...
  }
  
  private function generatePreasure() { // ... }
  
  private function grindBeans() { // ... }
  
  private function checkWaterTank() { // ... }
  
  // ...
}

```

---

# Inheritance
Similar objects can share behaviour.
Every Person knows how to sayHello no matter if it's a Student, Programmer or Tester

```
class Person {
  public function sayHello() {
    echo 'Hello';
  }
}

class Student extends Person { }
class Programmer extends Person { }
class Tester extends Person { }
```
---

# abstract class / interface / final class
- abtract class - has public or protected methods that must be implemented by child classes
- interface - contract that must be implemented by classes that follow the interface
- final class - no class can inherit from it

---

# Polymorphism
Polymorphism means “many shapes” in Greek.
You can always use a subtype.

```
class Person {
  // ...
  public function welcomeOtherPerson(Person $guest) {
    $this->sayHello();
    $guest->sayHello();
  }
}

$student = new Student();
$tester = new Tester();

$student->welcomeOtherPerson($tester);
$tester->welcomeOtherPerson($student);
```

---

# Before we go back to 
## Coding Companion ...

---

# Let's help John

---

# Task 1
John has a shop for aquarists and asked you to digitalise his business. 
- Each Aquarium can be desribed with can be described with capacity.
- Aquarium can have fish.

John has 3 preconfigured aquariums.
60l tank with 5 Jewel cichlid, 10 Kribensis, 2 Lionhead Cichlid,
100l tank with 10 Angelfish,
25l tank with 3 fancy guppy,

---

# Task 2
John wants to have a Digital Advisor for customers. 
Advisor will tell if two fish can be together in the same Aquarium.

### MVP criteria
- character: agressive fish can live only with agressive fish not with peaceful
- pH: water in a tank has pH fish accept ranges only pH. pH range must overlap if the fish can live together

---

# Task 3
John wants to sell preconfigured aquariums for beginners.
- John knows his costs and has a formula to calculate the final price: (cost of fish * 1.5 + cost of aquarium * 1.3) 
- Price must end with x9,99

---

# Task 4
John wants to add free Gadgets to Aquarium sets for beginners. Aquarium can have many gadgets to do different things:
- Measuring cup TO measure water
- Length of vinyl tubing TO exchange water
- Chamois TO absrob water

Add random gadgets to Aquariums

---

# Task 5
Web agency that works for John wants to get a list of all aquariums with fish and prices in order to build a webshop. 
- endpoint with all fish in the shop (no prices)
- endpoint with all aquariums with fish and prices

---

# Resources
- https://medium.freecodecamp.org/object-oriented-programming-concepts-21bb035f7260
- https://medium.com/the-coding-matrix/ddd-101-the-5-minute-tour-7a3037cf53b8
- https://en.wikipedia.org/wiki/Domain-driven_design
- https://secure.php.net/manual/en/oop5.intro.php
- https://www.learn-php.org/en/Objects
