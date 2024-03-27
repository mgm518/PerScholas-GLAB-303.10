package com.perscholas.lesson30310.polymorphism;

class WaterMonster extends Monster{
  WaterMonster(String name) {
    super(name);
  }

  @Override
  public String attack() {
    return "Attack with water!";
  }
}
