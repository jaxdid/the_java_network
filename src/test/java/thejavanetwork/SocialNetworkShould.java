package thejavanetwork;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.verifyNew;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({SocialNetwork.class, User.class})
public class SocialNetworkShould {
  @Mock private User newUser;

  private SocialNetwork theJavaNetwork;

  @Before public void initialize() {
    theJavaNetwork = new SocialNetwork();
  }

  @Test public void createNewUserWithName() throws Exception {
    String name = "Spike";
    MessageRepository messageRepository = new MessageRepository();
    TimelinePrinter timelinePrinter = new TimelinePrinter(name, new Console());
    SubscriptionRepository subscriptionRepository = new SubscriptionRepository();
    SubscriptionsPrinter subscriptionsPrinter = new SubscriptionsPrinter(name, new Console());

    whenNew(User.class)
        .withArguments(name, messageRepository, timelinePrinter, subscriptionRepository, subscriptionsPrinter)
        .thenReturn(newUser);

    theJavaNetwork.createUser(name, messageRepository, timelinePrinter, subscriptionRepository, subscriptionsPrinter);

    verifyNew(User.class)
        .withArguments(name, messageRepository, timelinePrinter, subscriptionRepository, subscriptionsPrinter);
  }
}