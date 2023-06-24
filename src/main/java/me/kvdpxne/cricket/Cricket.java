package me.kvdpxne.cricket;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cricket {

  private final Logger logger;

  Cricket(final Logger logger) {
    this.logger = logger;
  }

  /**
   * The current name of the logger that this object uses to print messages,
   * may be null if an anonymous logger was used to create a new instance of
   * this object.
   *
   * @return The logger name or null.
   */
  public String getName() {
    return this.logger.getName();
  }

  public void error(final String message, final Throwable throwable) {
    this.logger.log(Level.SEVERE, message, throwable);
  }

  public void error(final String message, final Object... arguments) {
    this.logger.log(Level.SEVERE, message, arguments);
  }

  public void error(final String message) {
    this.logger.log(Level.SEVERE, message);
  }

  public void warn(final String message, final Throwable throwable) {
    this.logger.log(Level.WARNING, message, throwable);
  }

  public void warn(final String message, final Object... arguments) {
    this.logger.log(Level.WARNING, message, arguments);
  }

  public void warn(final String message) {
    this.logger.log(Level.WARNING, message);
  }

  public void info(final String message, final Throwable throwable) {
    this.logger.log(Level.INFO, message, throwable);
  }

  public void info(final String message, final Object... arguments) {
    this.logger.log(Level.INFO, message, arguments);
  }

  public void info(final String message) {
    this.logger.log(Level.INFO, message);
  }

  public void debug(final String message, final Throwable throwable) {
    this.logger.log(Level.CONFIG, message, throwable);
  }

  public void debug(final String message, final Object... arguments) {
    this.logger.log(Level.CONFIG, message, arguments);
  }

  public void debug(final String message) {
    this.logger.log(Level.CONFIG, message);
  }
}
