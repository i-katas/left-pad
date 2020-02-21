package com.katas;

public class LeftPad {
  public static String pad(String s, char pad, int n) {
    char[] padding = new char[n];
    int i = 0;
    while(i < n) {
      padding[i] = pad;
      i++;
    }
    return String.valueOf(padding);
  }
}
