package thejavanetwork;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MessageRepositoryShould {
  private MessageRepository messageRepository;

  @Before public void initialize() {
    messageRepository = new MessageRepository();
  }

  @Test public void storeAPublishedMessage() throws Exception {
    messageRepository.addMessage("Hello, World!");

    List<String> messages = messageRepository.allMessages();

    assertThat(messages.size(), is(1));
    assertThat(messages.get(0), is("Hello, World!"));
  }
}