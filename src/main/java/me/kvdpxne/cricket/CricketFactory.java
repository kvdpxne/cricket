package me.kvdpxne.cricket;

import java.io.File;
import java.util.function.Supplier;
import java.util.logging.Logger;

/**
 * A factory class for creating instances of the Cricket class.
 */
public final class CricketFactory {

  /**
   * Creates a Cricket instance with a logger associated with the specified
   * name.
   *
   * @param name The name of the logger.
   * @return A Cricket instance.
   */
  public static Cricket of(final String name) {
    final Logger logger = Logger.getLogger(name);
    return new Cricket(logger);
  }

  /**
   * Creates a Cricket instance with a logger associated with the name provided
   * by the supplier.
   *
   * @param name The supplier providing the name of the logger.
   * @return A Cricket instance.
   */
  public static Cricket of(final Supplier<String> name) {
    return CricketFactory.of(name.get());
  }

  /**
   * Creates a Cricket instance with a logger associated with the name of the
   * specified class.
   *
   * @param clazz The class whose name will be used for the logger.
   * @return A Cricket instance.
   */
  public static Cricket of(final Class<?> clazz) {
    return CricketFactory.of(clazz.getName());
  }

  /**
   * Creates a Cricket instance with a logger name based on the name of the
   * specified File object.
   *
   * @param file The File object from which to derive the logger name.
   * @return A Cricket instance with a logger name based on the name of the
   * File object.
   */
  public static Cricket of(final File file) {
    return CricketFactory.of(file.getName());
  }

  /**
   * Creates a Cricket instance with a logger associated with the string
   * representation of the provided object.
   *
   * @param any The object whose string representation will be used for the
   *            logger name.
   * @return A Cricket instance.
   */
  public static Cricket of(final Object any) {
    return CricketFactory.of(any.toString());
  }
}
