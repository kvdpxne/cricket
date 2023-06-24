package me.kvdpxne.cricket;

import java.util.logging.Logger;

public final class CricketFactory {

  public static Cricket of(final String name) {
    final Logger logger = Logger.getLogger(name);
    return new Cricket(logger);
  }

  public static Cricket of(final Class<?> clazz) {
    return of(clazz.getName());
  }
}
