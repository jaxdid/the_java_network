package thejavanetwork;

public class SocialNetwork {
  public User createUser(String name) {
    return new User(name);
  }

  public User createUser(String name, Timeline timeline) {
    return new User(name, timeline);
  }
}