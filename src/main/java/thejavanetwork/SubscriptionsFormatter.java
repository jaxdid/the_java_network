package thejavanetwork;

public class SubscriptionsFormatter {
  public static String formatHeader(String subscriber) {
    return "*** " + subscriber + "'s Subscriptions ***";
  }

  public static String formatMessage(String author, String message) {
    return "@" + author + ": " + message;
  }
}