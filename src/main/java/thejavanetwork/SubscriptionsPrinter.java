package thejavanetwork;

import java.util.List;

public class SubscriptionsPrinter {
  private Console console;
  private String subscriptionsHeader;

  public SubscriptionsPrinter(String owner, Console console) {
    this.console = console;
    this.subscriptionsHeader = SubscriptionsFormatter.formatHeader(owner);
  }

  public void print(List<String> subscriptionMessages) {
    console.printLine(subscriptionsHeader);
    for (String message : subscriptionMessages) {
      console.printLine(message);
    }
  }
}