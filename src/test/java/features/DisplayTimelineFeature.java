package features;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import thejavanetwork.*;

import static org.mockito.Mockito.inOrder;

@RunWith(MockitoJUnitRunner.class)
public class DisplayTimelineFeature {
  @Mock Console console;

  private User user;

  @Before public void initialize() {
    SocialNetwork theJavaNetwork = new SocialNetwork();
    user = theJavaNetwork.createUser("Spike",
                                    new MessageRepository(),
                                    new TimelinePrinter("Spike", console));
  }

  @Test public void displayTimelineContainingAllMessages() {
    user.publish("First post");
    user.publish("Second post");
    user.publish("Third post");

    user.displayTimeline();

    InOrder inOrder = inOrder(console);
    inOrder.verify(console).printLine("*** Spike's Timeline ***");
    inOrder.verify(console).printLine("Third post");
    inOrder.verify(console).printLine("Second post");
    inOrder.verify(console).printLine("First post");
  }
}