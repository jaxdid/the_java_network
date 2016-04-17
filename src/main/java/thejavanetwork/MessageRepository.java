package thejavanetwork;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class MessageRepository {
  private List<String> messages = new ArrayList<>();

  public void addMessage(String message) {
    messages.add(message);
  }

  public List<String> allMessages() {
    return unmodifiableList(messages);
  }
}