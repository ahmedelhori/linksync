package com.linksync.backend.nongates;

import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testing OneBlock class.
 *
 * @author Ahmed Elhori
 */

@Getter
public class OneBlockTest {
  @Test
  public void testResultTrue() {
    OneBlock oneBlock = new OneBlock();
    assertTrue(oneBlock.result(), "Should be true");
  }
}