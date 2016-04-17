package thejavanetwork;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UserShould {
  @Mock MessageRepository messageRepository;
  @Mock TimelinePrinter timelinePrinter;

  private User user;

  @Before public void initialize() {
    user = new User("Spike", messageRepository, timelinePrinter);
  }

  @Test public void addMessageToMessages() {
    user.publish("A million dollars isn't cool...");
    verify(messageRepository).addMessage("A million dollars isn't cool...");
  }

  @Test public void displayTimelineOfAllMessages() {
    List<String> messages = asList();
    given(messageRepository.allMessages()).willReturn(messages);
    user.displayTimeline();
    verify(timelinePrinter).print(messages);
  }
}