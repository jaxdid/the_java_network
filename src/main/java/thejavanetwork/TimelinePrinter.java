package thejavanetwork;

import java.util.List;

public class TimelinePrinter {
  private Console console;
  private String timelineHeader;

  public TimelinePrinter(String owner, Console console) {
    this.console = console;
    this.timelineHeader = TimelineFormatter.formatHeader(owner);
  }

  public void print(List<String> messages) {
    console.printLine(timelineHeader);
    for (String message : TimelineFormatter.reverseOrder(messages)) {
      console.printLine(message);
    }
  }
}