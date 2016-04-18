package thejavanetwork;

public class SocialNetwork {
  public User createUser(String name,
                         MessageRepository messageRepository,
                         TimelinePrinter timelinePrinter,
                         SubscriptionRepository subscriptionRepository,
                         SubscriptionsPrinter subscriptionsPrinter) {
    return new User(name, messageRepository, timelinePrinter, subscriptionRepository, subscriptionsPrinter);
  }
}