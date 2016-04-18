package thejavanetwork;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class SubscriptionRepository {
  private List<User> subscriptions = new ArrayList<>();

  public void addSubscription(User subscribee) {
    subscriptions.add(subscribee);
  }

  public List<User> allSubscriptions() {
    return unmodifiableList(subscriptions);
  }

  public List<String> allSubscriptionMessages() {
    return unmodifiableList(SubscriptionsAggregator.scrape(subscriptions));
  }
}