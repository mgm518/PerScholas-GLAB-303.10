# Lesson 303.10 - Polymorphism, Object Type casting, Abstraction, interfaces

This assignment is divided into two parts.  The first part is a coding portion that will be provided in the project folder.  The second part is a HackerRank challenge.

## 303.10.1 - Polymorphism and Inheritance

From the document [PA 303.10.1](<Docs/PA 303.10.1 - Practice Assignment - Polymorphism and inheritance.pdf>):

**Scenario:** In our game app, we have many types of monsters that can attack. You will design a superclass called **Monster** and define the method of ***attack()*** in the superclass. You will design subclasses called **FireMonster**, **WaterMonster**, and **StoneMonster**. The subclasses will then provide their actual implementation. In the main program, we will declare instances of the superclass, substitute them with the actual subclass, and invoke the method defined in the superclass.

## 303.10.2 - Abstraction

* [Java Abstract Class](https://www.hackerrank.com/challenges/java-abstract-class)
![Java Abstract Class](Screenshots/Java%20Abstract%20Class%20-%202024-03-27%2010%2021%2040.png)

## 303.10.3 - Polymorphism and Interface

From the document [PA 303.10.3](Docs/PA%20303.10.3%20-%20Practice%20Assignment%20-%20Polymorphism%20and%20Interface.pdf):

**Scenario:** A library needs to develop an online application for two types of users/roles: adults and children. Both of these users should be able to register an account. Any user under 12 years of age will be registered as a child, and they can borrow a “Kids” category book for 10 days, whereas an adult can borrow “Fiction” category books, which need to be returned within 7 days.

The expected output:

```text
Test case #1
Setting kidUser's age to 10: You have successfully registered under a Kids Account
Setting kidUser's age to 18: Sorry, age must be less than 12 to register as a kid.
Setting kidUser's bookType to 'Kids': Book issued successfully, please return the book within 10 days
Setting kidUser's bookType to 'Fiction': Oops, you are allowed to take only kids books.

Test case #2
Setting adultUser's age to 5: Sorry, age must be greater than 12 to register as an adult.
Setting adultUser's age to 23: You have successfully registered under an Adult Account.
Setting adultUser's bookType to 'Kids': Oops, you are allowed to take only adult Fiction books.
Setting adultUser's bookType to 'Fiction': Book Issued successfully, please return the book within 7 days.
```
