package com.perscholas.lesson30310.interfaces;

public class LibraryInterfaceDemo {

  private KidUser kidUser;
  private AdultUser adultUser;
  public LibraryInterfaceDemo() {
    kidUser = new KidUser();
    adultUser = new AdultUser();
    testCase1();
    System.out.println();
    testCase2();
  }
  private void testCase1() {
    System.out.println("Test case #1");
    System.out.print("Setting kidUser's age to 10:\t");
    kidUser.setAge(10);
    System.out.println(kidUser.registerAccount());
    System.out.print("Setting kidUser's age to 18:\t");
    kidUser.setAge(18);
    System.out.println(kidUser.registerAccount());
    System.out.print("Setting kidUser's bookType to 'Kids':\t");
    kidUser.setBookType("Kids");
    System.out.println(kidUser.requestBook());
    System.out.print("Setting kidUser's bookType to 'Fiction':\t");
    kidUser.setBookType("Fiction");
    System.out.println(kidUser.requestBook());
  }
  private void testCase2() {
    System.out.println("Test case #2");
    System.out.print("Setting adultUser's age to 5:\t");
    adultUser.setAge(5);
    System.out.println(adultUser.registerAccount());
    System.out.print("Setting adultUser's age to 23:\t");
    adultUser.setAge(23);
    System.out.println(adultUser.registerAccount());
    System.out.print("Setting adultUser's bookType to 'Kids':\t");
    adultUser.setBookType("Kids");
    System.out.println(adultUser.requestBook());
    System.out.print("Setting adultUser's bookType to 'Fiction':\t");
    adultUser.setBookType("Fiction");
    System.out.println(adultUser.requestBook());
  }
}
