package com.katas;

public class LeftPad {
  public static String pad(String s, char pad, int n) {
    char[] padding = new char[n];
    if(n > 0) {
      padding[0] = pad;
    }
    return String.valueOf(padding);
  }
}
