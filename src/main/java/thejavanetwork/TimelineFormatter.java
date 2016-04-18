package thejavanetwork;

import java.util.List;

import static com.google.common.collect.Lists.reverse;

public class TimelineFormatter {
  public static String formatHeader(String user) {
    return "*** " + user + "'s Timeline ***";
  }

  public static List<Message> reverseOrder(List<Message> messages) {
    return reverse(messages);
  }
}