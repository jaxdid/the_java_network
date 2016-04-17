package thejavanetwork;

public class User {
  private String name;
  private MessageRepository messageRepository;
  private TimelinePrinter timelinePrinter;

  public User(String name) {
    this.name = name;
    this.messageRepository = new MessageRepository();
    this.timelinePrinter = new TimelinePrinter();
  }

  public User(String name, MessageRepository messageRepository, TimelinePrinter timelinePrinter) {
    this.name = name;
    this.messageRepository = messageRepository;
    this.timelinePrinter = timelinePrinter;
  }

  public void publish(String messageText) {
    messageRepository.addMessage(messageText);
  }

  public void displayTimeline() {
    timelinePrinter.print(messageRepository.allMessages());
  }
}