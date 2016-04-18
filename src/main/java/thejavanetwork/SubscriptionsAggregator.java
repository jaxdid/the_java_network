package thejavanetwork;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionsAggregator {
  public static List<String> scrape(List<User> subscriptions) {
    List<String> aggregatedMessages = new ArrayList<>();

    for (User user : subscriptions) {
      for (String message : user.getMessages()) {
        aggregatedMessages.add(SubscriptionsFormatter.formatMessage(user.getName(), message));
      }
    }

    return aggregatedMessages;
  }
}