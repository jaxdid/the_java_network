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
    whenNew(User.class).withArguments(name).thenReturn(newUser);
    theJavaNetwork.createUser(name);
    verifyNew(User.class).withArguments(name);
  }
}