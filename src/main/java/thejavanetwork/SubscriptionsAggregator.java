package thejavanetwork;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionsAggregator {
  public static List<String> scrape(List<User> subscriptions) {
    List<String> aggregatedMessages = new ArrayList<>();

    for (User user : subscriptions) {
      for (Message message : user.getMessages()) {
        aggregatedMessages.add(SubscriptionsFormatter.formatMessage(message.getAuthor(), message.getText()));
      }
    }

    return aggregatedMessages;
  }
}