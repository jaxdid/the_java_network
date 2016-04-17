package thejavanetwork;

public class User {
  private String name;
  private Timeline timeline;

  public User(String name) {
    this.name = name;
    this.timeline = new Timeline();
  }

  public User(String name, Timeline timeline) {
    this.name = name;
    this.timeline = timeline;
  }

  public void publish(String messageText) {
    this.timeline.addMessage(messageText);
  }
}