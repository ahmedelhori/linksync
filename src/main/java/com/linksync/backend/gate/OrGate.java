package com.linksync.backend.gate;


import com.linksync.backend.abstracts.AbstractMultiGate;

/**
 * This is an OrGate implementation.
 *
 * @author ahmed elhori
 */

public class OrGate extends AbstractMultiGate {

  public OrGate(int inputNum) {
    super(inputNum, (a, b) -> a | b);
  }
}