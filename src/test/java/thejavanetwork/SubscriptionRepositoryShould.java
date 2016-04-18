package thejavanetwork;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SubscriptionRepositoryShould {
  @Mock User user;

  private SubscriptionRepository subscriptionRepository;

  @Before public void initialize() {
    subscriptionRepository = new SubscriptionRepository();
  }

  @Test public void storeASubscription() throws Exception {
    subscriptionRepository.addSubscription(user);
    List<User> subscriptions = subscriptionRepository.allSubscriptions();
    assertThat(subscriptions.size(), is(1));
    assertThat(subscriptions.get(0), is(user));
  }
}
