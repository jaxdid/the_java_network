package thejavanetwork;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MessageRepositoryShould {
  private MessageRepository messageRepository;

  @Before public void initialize() {
    messageRepository = new MessageRepository();
  }

  @Test public void storeAPublishedMessage() throws Exception {
    messageRepository.addMessage("Spike", "A million dollars isn't cool.");
    List<Message> messages = messageRepository.allMessages();
    assertThat(messages.size(), is(1));
    assertThat(messages.get(0).getAuthor(), is("Spike"));
    assertThat(messages.get(0).getText(), is("A million dollars isn't cool."));
  }
}