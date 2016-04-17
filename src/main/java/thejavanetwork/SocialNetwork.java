package thejavanetwork;

public class SocialNetwork {
  public User createUser(String name) {
    return new User(name);
  }

  public User createUser(String name, MessageRepository messageRepository, TimelinePrinter timelinePrinter) {
    return new User(name, messageRepository, timelinePrinter);
  }
}