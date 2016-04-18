package thejavanetwork;

import java.util.List;

import static com.google.common.collect.Lists.reverse;

public class SubscriptionsFormatter {
  public static String formatHeader(String user) {
    return "*** " + user + "'s Subscriptions ***";
  }

  public static String formatMessage(String user, String message) {
    return "@" + user + ": " + message;
  }
}