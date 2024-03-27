package com.perscholas.lesson30310.interfaces;


public class KidUser implements LibraryUser {


  private int age;

  private String bookType;

  @Override
  public String registerAccount() {
    if (age <= 11) {
      return "You have successfully registered under a Kids Account";
    }
    return "Sorry, age must be less than 12 to register as a kid.";
  }

  @Override
  public String requestBook() {
    if ("Kids".equals(bookType)) {
      return "Book issued successfully, please return the book within 10 days";
    } return "Oops, you are allowed to take only kids books.";
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getBookType() {
    return bookType;
  }

  public void setBookType(String bookType) {
    this.bookType = bookType;
  }
}
