package com.linksync.backend.gate;


import com.linksync.backend.abstracts.AbstractUnaryGate;

/**
 * This is a NotGate implementation.
 *
 * @author ahmed elhori
 */

public class NotGate extends AbstractUnaryGate {
  public NotGate() {
    super(a -> !a);
  }
}