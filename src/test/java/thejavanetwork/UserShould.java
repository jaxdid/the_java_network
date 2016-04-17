package thejavanetwork;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UserShould {

  @Mock Timeline timeline;

  private User user;

  @Before public void initialize() {
    user = new User("Spike", timeline);
  }

  @Test public void publishMessageToTimeline() {
    user.publish("A million dollars isn't cool...");
    verify(timeline).addMessage("A million dollars isn't cool...");
  }
}