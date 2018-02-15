package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
 * abc
 * @param  url  an absolute URL giving the base location of the image
 * @return      the image at the specified URL
 */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
  
}
