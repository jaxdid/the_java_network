package thejavanetwork;

public class User {
  private String name;
  private MessageRepository messageRepository;

  public User(String name) {
    this.name = name;
    this.messageRepository = new MessageRepository();
  }

  public User(String name, MessageRepository messageRepository) {
    this.name = name;
    this.messageRepository = messageRepository;
  }

  public void publish(String messageText) {
    this.messageRepository.addMessage(messageText);
  }
}