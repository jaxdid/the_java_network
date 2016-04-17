package features;

import org.mockito.Mockito;
import thejavanetwork.SocialNetwork;
import thejavanetwork.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DisplayTimelineFeature {

  @Mock Console console;

  private SocialNetwork theJavaNetwork;
  private User user;

  @Before public void initialize() {
    theJavaNetwork = new SocialNetwork();
    user = theJavaNetwork.createUser("Spike");
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
