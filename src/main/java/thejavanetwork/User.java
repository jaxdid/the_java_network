package thejavanetwork;

import java.util.List;

import static java.util.Collections.unmodifiableList;

public class User {
  private String name;
  private MessageRepository messageRepository;
  private TimelinePrinter timelinePrinter;
  private SubscriptionRepository subscriptionRepository;
  private SubscriptionsPrinter subscriptionsPrinter;

  public User(String name,
              MessageRepository messageRepository,
              TimelinePrinter timelinePrinter,
              SubscriptionRepository subscriptionRepository,
              SubscriptionsPrinter subscriptionsPrinter) {
    this.name = name;
    this.messageRepository = messageRepository;
    this.timelinePrinter = timelinePrinter;
    this.subscriptionRepository = subscriptionRepository;
    this.subscriptionsPrinter = subscriptionsPrinter;
  }

  public String getName() {
    return name;
  }

  public List<String> getMessages() {
    return messageRepository.allMessages();
  }

  public void publish(String messageText) {
    messageRepository.addMessage(messageText);
  }

  public void displayTimeline() {
    timelinePrinter.print(messageRepository.allMessages());
  }

  public void subscribeTo(User subscribee) {
    subscriptionRepository.addSubscription(subscribee);
  }

  public void displaySubscriptions() {
    subscriptionsPrinter.print(subscriptionRepository.allSubscriptionMessages());
  }
}