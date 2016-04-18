package thejavanetwork;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class MessageRepository {
  private List<Message> messages = new ArrayList<>();

  public void addMessage(String author, String messageText) {
    messages.add(new Message(author, messageText));
  }

  public List<Message> allMessages() {
    return unmodifiableList(messages);
  }
}