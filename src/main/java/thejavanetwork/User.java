package thejavanetwork;

import java.util.List;

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

  private String getName() {
    return name;
  }

  public List<Message> getMessages() {
    return messageRepository.allMessages();
  }

  public void publish(String messageText) {
    messageRepository.addMessage(getName(), messageText);
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