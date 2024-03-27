package com.perscholas.lesson30310.abstraction;

import java.util.Scanner;

public class HackerRank {

  /**
   * A no-args constructor for that simulates the HackerRank code.  It will use Scanner to define
   * the title of the book.
   */
  public HackerRank() {
    //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
    Scanner sc = new Scanner(System.in);
    String title = sc.nextLine();
    sc.close();
    new HackerRank(title);
  }

  /**
   * A constructor that uses a pre-defined title.  This is for the convenience of not wanting to
   * type in title each time the program is run.
   *
   * @param title The string used to define the title of the book.
   */
  public HackerRank(String title) {
    MyBook new_novel = new MyBook();
    new_novel.setTitle(title);
    System.out.println("The title is: " + new_novel.getTitle());
  }

  abstract class Book {

    String title;

    abstract void setTitle(String s);

    String getTitle() {
      return title;
    }
  }

  //Write MyBook class here
  class MyBook extends Book {

    MyBook() {
    }

    @Override
    void setTitle(String s) {
      this.title = s;
    }
  }
}
