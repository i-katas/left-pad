package com.katas;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeftPadTest {
  @Test
  public void empty() throws Throwable {
    assertThat(LeftPad.pad("", '_', 0), equalTo(""));
    assertThat(LeftPad.pad("", '_', 1), equalTo("_"));
    //assertThat(LeftPad.pad("", '_', 3), equalTo("___"));
  }
}
