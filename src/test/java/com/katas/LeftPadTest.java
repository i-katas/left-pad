package com.katas;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeftPadTest {
  @Test
  public void empty() throws Throwable {
    assertThat(LeftPad.pad("", '_', 0), equalTo(""));
    assertThat(LeftPad.pad("", '_', 1), equalTo("_"));
    assertThat(LeftPad.pad("", '_', 3), equalTo("___"));
  }

  @Test
  public void contentLengthGreaterThanOrEqualToPaddingSize() throws Throwable {
    assertThat(LeftPad.pad("abc", '_', 0), equalTo("abc"));
    assertThat(LeftPad.pad("abc", '_', 3), equalTo("abc"));
  }

  @Test
  public void contentLengthLessThanPaddingSize() throws Throwable {
    assertThat(LeftPad.pad("abc", '_', 5), equalTo("__abc"));
  }
}
