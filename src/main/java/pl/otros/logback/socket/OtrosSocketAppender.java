package pl.otros.logback.socket;

import ch.qos.logback.classic.net.SocketAppender;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * This implementation of SocketAppender is gathering caller data in the Logger.log call thread. In this way caller data
 * is not lost but it can lower the performance.
 */
public class OtrosSocketAppender  extends SocketAppender {

  private boolean includeCallerData = false;

  public void setIncludeCallerData(boolean includeCallerData) {
    this.includeCallerData = includeCallerData;
  }

  @Override
  protected void append(ILoggingEvent event) {
    if (event == null || !isStarted()) return;
    if (includeCallerData){
      event.getCallerData();
    }
    super.append(event);
  }

}
