package com.katas;

import java.util.Arrays;

public class LeftPad {
  public static String pad(String s, char pad, int n) {
    int numPads = Math.max(0, n - s.length());
    char[] buffer = new char[s.length() + numPads];

    Arrays.fill(buffer, 0, numPads, pad);
    System.arraycopy(s.toCharArray(), 0, buffer, numPads, s.length());

    return String.valueOf(buffer);
  }
}
