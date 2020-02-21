package com.katas;

import java.util.Arrays;

public class LeftPad {
  public static String pad(String s, char pad, int n) {
    char[] padding = new char[Math.max(0, n - s.length())];
    Arrays.fill(padding, pad);
    return String.valueOf(padding) + s;
  }
}
