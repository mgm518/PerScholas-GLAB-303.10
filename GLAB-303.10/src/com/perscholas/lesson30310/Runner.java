package com.perscholas.lesson30310;

import com.perscholas.lesson30310.abstraction.HackerRank;
import com.perscholas.lesson30310.polymorphism.TestMonster;

public class Runner {

  public static void main(String[] args) {
    System.out.println("""
        **************************************************
        PA 303.10.1 - Polymorphism and Inheritance
        **************************************************""");
    new TestMonster();
    System.out.println();
    System.out.println("""
        **************************************************
        PA 303.10.2 - Abstraction
        **************************************************""");
    new HackerRank("A tale of two cities");
  }
}
