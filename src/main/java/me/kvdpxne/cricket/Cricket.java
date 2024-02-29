package me.kvdpxne.cricket;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A utility class for logging messages at different severity levels.
 */
public class Cricket {

  private final Logger logger;

  /**
   * Constructs a Cricket object with the specified logger.
   *
   * @param logger The logger object to be used for logging messages.
   */
  Cricket(final Logger logger) {
    this.logger = logger;
  }

  /**
   * Returns the name of the logger associated with this Cricket instance.
   *
   * @return The name of the logger, or null if an anonymous logger was used.
   */
  public String getName() {
    return this.logger.getName();
  }

  /**
   * Gets the simple name of the logger, which is the unqualified class name
   * extracted from the fully qualified class name.
   * <p>
   * For example, if the logger's name is "com.example.MyLogger", this method
   * will return "MyLogger".
   * </p>
   * <p>
   * If the logger's name is {@code null}, this method returns {@code null}.
   * </p>
   *
   * @return The simple name of the logger, or {@code null} if the logger's
   * name is {@code null}.
   */
  public String getSimpleName() {
    final String name = this.getName();
    if (null == name) {
      return null;
    }

    final int index = name.lastIndexOf('.');
    if (-1 == index) {
      return name;
    }

    return name.substring(index);
  }

  /**
   * Logs a message at the ERROR level along with a throwable.
   *
   * @param message   The message to be logged.
   * @param throwable The throwable associated with the error.
   */
  public void error(final String message, final Throwable throwable) {
    this.logger.log(Level.SEVERE, message, throwable);
  }

  /**
   * Logs a formatted message at the ERROR level.
   *
   * @param message   The message format string.
   * @param arguments Arguments referenced by the format string.
   */
  public void error(final String message, final Object... arguments) {
    this.logger.log(Level.SEVERE, message, arguments);
  }

  /**
   * Logs a message at the ERROR level.
   *
   * @param message The message to be logged.
   */
  public void error(final String message) {
    this.logger.log(Level.SEVERE, message);
  }

  /**
   * Logs a message at the ERROR level if the specified condition is true,
   * using the message provided by the given supplier.
   *
   * @param condition The condition to evaluate.
   * @param message   A supplier providing the error message to be logged.
   */
  public void error(final boolean condition, final Supplier<String> message) {
    if (condition) {
      this.error(message.get());
    }
  }

  /**
   * Logs a message at the ERROR level using the message provided by the given
   * supplier.
   *
   * @param message A supplier providing the error message to be logged.
   */
  public void error(final Supplier<String> message) {
    this.error(message.get());
  }

  /**
   * Logs a message at the WARN level along with a throwable.
   *
   * @param message   The message to be logged.
   * @param throwable The throwable associated with the error.
   */
  public void warn(final String message, final Throwable throwable) {
    this.logger.log(Level.WARNING, message, throwable);
  }

  /**
   * Logs a formatted message at the WARN level.
   *
   * @param message   The message format string.
   * @param arguments Arguments referenced by the format string.
   */
  public void warn(final String message, final Object... arguments) {
    this.logger.log(Level.WARNING, message, arguments);
  }

  /**
   * Logs a message at the WARN level.
   *
   * @param message The message to be logged.
   */
  public void warn(final String message) {
    this.logger.log(Level.WARNING, message);
  }

  /**
   * Logs a message at the WARN level if the specified condition is true,
   * using the message provided by the given supplier.
   *
   * @param condition The condition to evaluate.
   * @param message   A supplier providing the error message to be logged.
   */
  public void warn(final boolean condition, final Supplier<String> message) {
    if (condition) {
      this.warn(message.get());
    }
  }

  /**
   * Logs a message at the WARN level using the message provided by the given
   * supplier.
   *
   * @param message A supplier providing the error message to be logged.
   */
  public void warn(final Supplier<String> message) {
    this.warn(message.get());
  }

  /**
   * Logs a message at the INFO level along with a throwable.
   *
   * @param message   The message to be logged.
   * @param throwable The throwable associated with the error.
   */
  public void info(final String message, final Throwable throwable) {
    this.logger.log(Level.INFO, message, throwable);
  }

  /**
   * Logs a formatted message at the INFO level.
   *
   * @param message   The message format string.
   * @param arguments Arguments referenced by the format string.
   */
  public void info(final String message, final Object... arguments) {
    this.logger.log(Level.INFO, message, arguments);
  }

  /**
   * Logs a message at the INFO level.
   *
   * @param message The message to be logged.
   */
  public void info(final String message) {
    this.logger.log(Level.INFO, message);
  }

  /**
   * Logs a message at the INFO level if the specified condition is true,
   * using the message provided by the given supplier.
   *
   * @param condition The condition to evaluate.
   * @param message   A supplier providing the error message to be logged.
   */
  public void info(final boolean condition, final Supplier<String> message) {
    if (condition) {
      this.info(message.get());
    }
  }

  /**
   * Logs a message at the INFO level using the message provided by the given
   * supplier.
   *
   * @param message A supplier providing the error message to be logged.
   */
  public void info(final Supplier<String> message) {
    this.info(message.get());
  }

  /**
   * Logs a message at the DEBUG level along with a throwable.
   *
   * @param message   The message to be logged.
   * @param throwable The throwable associated with the error.
   */
  public void debug(final String message, final Throwable throwable) {
    this.logger.log(Level.CONFIG, message, throwable);
  }

  /**
   * Logs a formatted message at the DEBUG level.
   *
   * @param message   The message format string.
   * @param arguments Arguments referenced by the format string.
   */
  public void debug(final String message, final Object... arguments) {
    this.logger.log(Level.CONFIG, message, arguments);
  }

  /**
   * Logs a message at the DEBUG level.
   *
   * @param message The message to be logged.
   */
  public void debug(final String message) {
    this.logger.log(Level.CONFIG, message);
  }

  /**
   * Logs a message at the DEBUG level if the specified condition is true,
   * using the message provided by the given supplier.
   *
   * @param condition The condition to evaluate.
   * @param message   A supplier providing the error message to be logged.
   */
  public void debug(final boolean condition, final Supplier<String> message) {
    if (condition) {
      this.debug(message.get());
    }
  }

  /**
   * Logs a message at the DEBUG level using the message provided by the given
   * supplier.
   *
   * @param message A supplier providing the error message to be logged.
   */
  public void debug(final Supplier<String> message) {
    this.debug(message.get());
  }

  /**
   * Logs a message at the DEBUG level along with a throwable.
   *
   * @param message   The message to be logged.
   * @param throwable The throwable associated with the error.
   */
  public void trace(final String message, final Throwable throwable) {
    this.logger.log(Level.FINE, message, throwable);
  }

  /**
   * Logs a formatted message at the DEBUG level.
   *
   * @param message   The message format string.
   * @param arguments Arguments referenced by the format string.
   */
  public void trace(final String message, final Object... arguments) {
    this.logger.log(Level.FINE, message, arguments);
  }

  /**
   * Logs a message at the DEBUG level.
   *
   * @param message The message to be logged.
   */
  public void trace(final String message) {
    this.logger.log(Level.FINE, message);
  }

  /**
   * Logs a message at the DEBUG level if the specified condition is true,
   * using the message provided by the given supplier.
   *
   * @param condition The condition to evaluate.
   * @param message   A supplier providing the error message to be logged.
   */
  public void trace(final boolean condition, final Supplier<String> message) {
    if (condition) {
      this.debug(message.get());
    }
  }

  /**
   * Logs a message at the DEBUG level using the message provided by the given
   * supplier.
   *
   * @param message A supplier providing the error message to be logged.
   */
  public void trace(final Supplier<String> message) {
    this.debug(message.get());
  }

  /**
   * Compares this Cricket object with the specified object for equality.
   * <p>
   * Two Cricket objects are considered equal if they reference the same
   * underlying Logger object.
   * </p>
   *
   * @param o The object to compare with.
   * @return {@code true} if this Cricket object is equal to the specified
   *         object, {@code false} otherwise.
   */
  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }

    if (null == o || this.getClass() != o.getClass()) {
      return false;
    }

    final Cricket cricket = (Cricket) o;
    return this.logger.equals(cricket.logger);
  }

  /**
   * Returns a hash code value for this Cricket object.
   * <p>
   * The hash code is computed based on the hash code of the underlying Logger
   * object.
   * </p>
   *
   * @return A hash code value for this Cricket object.
   */
  @Override
  public int hashCode() {
    return this.logger.hashCode();
  }

  /**
   * Returns a string representation of this Cricket object.
   * <p>
   * This method delegates to the toString method of the underlying Logger
   * object.
   * </p>
   *
   * @return A string representation of this Cricket object.
   */
  @Override
  public String toString() {
    return this.logger.toString();
  }
}
