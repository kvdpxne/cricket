package me.kvdpxne.cricket;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cricket {

  private final Logger logger;

  Cricket(final Logger logger) {
    this.logger = logger;
  }

  public void error(final String message, final Object... arguments) {
    this.logger.log(Level.SEVERE, message, arguments);
  }

  public void error(final String message) {
    this.logger.log(Level.SEVERE, message);
  }

  public void warn(final String message, final Object... arguments) {
    this.logger.log(Level.WARNING, message, arguments);
  }

  public void warn(final String message) {
    this.logger.log(Level.WARNING, message);
  }

  public void info(final String message, final Object... arguments) {
    this.logger.log(Level.INFO, message, arguments);
  }

  public void info(final String message) {
    this.logger.log(Level.INFO, message);
  }

  public void debug(final String message, final Object... arguments) {
    this.logger.log(Level.CONFIG, message, arguments);
  }

  public void debug(final String message) {
    this.logger.log(Level.CONFIG, message);
  }
}
