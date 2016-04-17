package thejavanetwork;

import java.util.List;

import static com.google.common.collect.Lists.reverse;

public class TimelinePrinter {
  private Console console;
  private String timelineHeader;

  public TimelinePrinter(String owner, Console console) {
    this.console = console;
    this.timelineHeader = "*** " + owner + "'s Timeline ***";
  }

  public void print(List<String> messages) {
    console.printLine(timelineHeader);
    for (String message : reverse(messages)) {
      console.printLine(message);
    }
  }
}