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
public class DisplaySubscriptionsFeature {
  @Mock Console console;

  private SocialNetwork theJavaNetwork = new SocialNetwork();
  private User realSpike, realNikesh, testLeo;

  @Before public void initialize() {
    realSpike = createRealUser("Spike");
    realNikesh = createRealUser("Nikesh");
    testLeo = createTestUser("Leo");
  }

  @Test public void displaySubscriptionsFeed() {
    realSpike.publish("Spike's first post");
    realSpike.publish("Spike's second post");
    realNikesh.publish("Nikesh's first post");

    testLeo.subscribeTo(realSpike);
    testLeo.subscribeTo(realNikesh);
    testLeo.displaySubscriptions();

    InOrder inOrder = inOrder(console);
    inOrder.verify(console).printLine("*** Leo's Subscriptions ***");
    inOrder.verify(console).printLine("@Spike: Spike's first post");
    inOrder.verify(console).printLine("@Spike: Spike's second post");
    inOrder.verify(console).printLine("@Nikesh: Nikesh's first post");
  }

  private User createRealUser(String name) {
    Console realConsole = new Console();
    return theJavaNetwork.createUser(name,
                                    new MessageRepository(),
                                    new TimelinePrinter(name, realConsole),
                                    new SubscriptionRepository(),
                                    new SubscriptionsPrinter(name, realConsole));
  }

  private User createTestUser(String name) {
    return theJavaNetwork.createUser(name,
                                    new MessageRepository(),
                                    new TimelinePrinter(name, console),
                                    new SubscriptionRepository(),
                                    new SubscriptionsPrinter(name, console));
  }
}