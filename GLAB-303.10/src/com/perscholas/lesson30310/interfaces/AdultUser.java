package com.perscholas.lesson30310.interfaces;

public class AdultUser implements LibraryUser {

  private int age;
  private String bookType;
  @Override
  public String registerAccount() {
    if (age >= 12) {
      return "You have successfully registered under an Adult Account.";
    }
    return "Sorry, age must be greater than 12 to register as an adult.";
  }

  @Override
  public String requestBook() {
    if ("Fiction".equals(bookType)) {
      return "Book Issued successfully, please return the book within 7 days.";
    } return "Oops, you are allowed to take only adult Fiction books.";
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
